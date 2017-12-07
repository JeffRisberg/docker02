package com.incra.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="incident")
@Data
@NoArgsConstructor
@AllArgsConstructor
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