package com.gmail.dmitriy.entity;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "Please enter name of product")
    private String name;
    @NotNull(message = "Будьласка введiть назву продукта")
    private String nameUkr;
    @NotNull
    @Digits(integer = 5, fraction = 0, message = "please not more then 5 symbols")
    private BigInteger price;
    @NotNull
    private BigDecimal quantityInStock;

}
