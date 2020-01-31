package com.gmail.dmitriy.entity;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "users",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"EMAIL"})})
public class User implements UserDetails{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "Native name cannot be empty")
    private String nameInUkrainianLanguage;

    @NotBlank(message = "Password cannot be empty")
    private String password;

    //@ValidEmail
    @NotBlank(message = "Indicate your Email to login")
    @Column(name = "EMAIL")
    private String email;

    private boolean active;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private UserRole role;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Stream.of(getRole()).collect(Collectors.toList());
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
