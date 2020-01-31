package com.gmail.dmitriy.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRecord;
    private LocalDateTime dateTime;
    @NotNull
    @ManyToMany
    private List<Сheque> сheques;
    @Enumerated(EnumType.STRING)
    private TypeOfRecord type;
    @Digits(integer = 6, fraction = 2)
    private BigDecimal totalAll;
    @ManyToOne
    private User user;

}
