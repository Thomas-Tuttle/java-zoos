package com.lambdaschool.zoo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "animal")
public class Animal
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;
    private String animaltype;

    @ManyToMany
    private List<Phone> phones = new ArrayList<>();
//
    public Animal()
    {
    }

    public Animal(String animaltype)
    {
        this.animaltype = animaltype;
    }
//
    public long getAnimalid()
    {
        return animalid;
    }

    public void setAnimalid(long animalid)
    {
        this.animalid = animalid;
    }

    public String getAnimaltype()
    {
        return animaltype;
    }

    public void setAnimaltype(String animaltype)
    {
        this.animaltype = animaltype;
    }

    public List<Phone> getPhones()
    {
        return phones;
    }

    public void setPhones(List<Phone> phones)
    {
        this.phones = phones;
    }
}
