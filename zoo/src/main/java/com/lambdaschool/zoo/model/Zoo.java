package com.lambdaschool.zoo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zoo")
public class Zoo
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long zooid;
    private String zooname;

    @OneToMany(mappedBy = "zoo")
    private List<Phone> phones = new ArrayList<>();

    public Zoo()
    {
    }

    public Zoo(String zooname)
    {
        this.zooname = zooname;
    }

    public long getZooid()
    {
        return zooid;
    }

    public void setZooid(long zooid)
    {
        this.zooid = zooid;
    }

    public String getZooname()
    {
        return zooname;
    }

    public void setZooname(String zooname)
    {
        this.zooname = zooname;
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
