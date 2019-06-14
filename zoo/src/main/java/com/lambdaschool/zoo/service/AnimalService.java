package com.lambdaschool.zoo.service;

import com.lambdaschool.zoo.model.Animal;
import com.lambdaschool.zoo.view.CountAnimalsInZoos;

import java.util.ArrayList;

public interface AnimalService
{
    ArrayList<Animal> findAll();

    Animal findAnimalByType(String type);

    ArrayList<CountAnimalsInZoos> getCountAnimalInZoo();
}
