package com.gmail.dmitriy.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Сheque {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCheck;
    @NotNull
    private LocalDateTime dateTime;
    @Enumerated(EnumType.STRING)
    private StatementOfCheck status = StatementOfCheck.OPEN;
    // TODO
    @ManyToOne
    private User user;
    @ManyToMany
    private Set<Product> products;

}
