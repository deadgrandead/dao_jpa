package com.deadgrandead.dao_jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PERSONS")
@Getter
@Setter
@EqualsAndHashCode
@IdClass(PersonId.class)
public class Person {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    private String phoneNumber;
    private String cityOfLiving;
}