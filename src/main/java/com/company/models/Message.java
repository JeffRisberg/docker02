package com.company.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="messages")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    @Column(name = "Id")
    @Id
    protected Long id;

    @Column(name = "sender")
    protected String sender;

    @Column(name = "text")
    protected String text;
}
