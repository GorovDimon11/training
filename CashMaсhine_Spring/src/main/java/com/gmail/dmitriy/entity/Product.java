package com.gmail.dmitriy.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.math.BigInteger;

@Builder
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "product",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"name", "name_ukr"})})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "Please enter name of product")
    @Column(name = "name")
    private String name;
    @NotNull(message = "Будь ласка, введiть назву продукта")
    @Column(name = "name_ukr")
    private String nameUkr;
    @NotNull
    private BigDecimal price;
    @NotNull
    private BigDecimal quantityInStock;

}
