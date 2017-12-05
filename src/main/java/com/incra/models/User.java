package com.incra.models;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Column(name = "Id")
    @Id
    protected Long id;

    @Column(name = "firstName")
    protected String firstName;

    @Column(name = "lastName")
    protected String lastName;
}