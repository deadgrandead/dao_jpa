package com.deadgrandead.dao_jpa.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@EqualsAndHashCode
public class PersonId implements Serializable {
    private String name;
    private String surname;
    private int age;
}

