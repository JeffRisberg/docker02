package com.incra.models;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class User {

    protected String firstName;
    protected String lastName;
}