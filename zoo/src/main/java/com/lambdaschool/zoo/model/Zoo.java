package com.lambdaschool.zoo.model;

import javax.persistence.*;

@Entity
@Table(name = "zoo")
public class Zoo
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;
    private String zooname;
}
