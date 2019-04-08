package org.fasttrackit.ferma.domain;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
