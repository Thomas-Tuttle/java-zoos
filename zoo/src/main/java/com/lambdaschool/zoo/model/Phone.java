package com.lambdaschool.zoo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "phone")
public class Phone
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long phoneid;
    private String phonetype;
    private String phonenumber;

    @ManyToOne
    @JoinColumn(name = "zooid")
    private Zoo zoo;

    @ManyToMany(mappedBy = "phones")
    private List<Animal> animals = new ArrayList<>();

    public Phone()
    {

    }

    public Phone(String phonetype)
    {
        this.phonetype = phonetype;
    }

    public Phone(String phonetype, Zoo zoo)
    {
        this.phonetype = phonetype;
        this.zoo = zoo;
    }

    public Phone(String phonetype, String phonenumber, Zoo zoo)
    {
        this.phonetype = phonetype;
        this.phonenumber = phonenumber;
        this.zoo = zoo;
    }

    public long getPhoneid()
    {
        return phoneid;
    }

    public void setPhoneid(long phoneid)
    {
        this.phoneid = phoneid;
    }

    public String getPhonetype()
    {
        return phonetype;
    }

    public void setPhonetype(String phonetype)
    {
        this.phonetype = phonetype;
    }

    public String getPhonenumber()
    {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }

    public Zoo getZoo()
    {
        return zoo;
    }

    public void setZoo(Zoo zoo)
    {
        this.zoo = zoo;
    }

    public List<Animal> getAnimals()
    {
        return animals;
    }

    public void setAnimals(List<Animal> animals)
    {
        this.animals = animals;
    }
}
