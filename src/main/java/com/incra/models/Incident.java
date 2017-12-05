package com.incra.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Incident {

    @Column(name = "Id")
    @Id
    protected Long id;

    @Column(name = "title")
    protected String title;

    @Column(name = "description")
    protected String description;

    @Column(name = "severity")
    protected String severity;
}