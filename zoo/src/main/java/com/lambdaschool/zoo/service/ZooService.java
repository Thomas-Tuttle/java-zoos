package com.lambdaschool.zoo.service;

import com.lambdaschool.zoo.model.Zoo;

import java.util.ArrayList;

public interface ZooService
{
    ArrayList<Zoo> findAll();

    Zoo findZooById(long id);

    Zoo findZooByName(String name);

    void delete(long id);

    Zoo save(Zoo zoo);

    Zoo update(Zoo zoo, long id);

    void deleteZooAnimalCombo(long zooid, long animalid);

    void saveZooAnimalCombo(long zooid, long animalid);
}
