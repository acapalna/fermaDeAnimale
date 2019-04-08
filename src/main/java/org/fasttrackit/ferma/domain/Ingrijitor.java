package org.fasttrackit.ferma.domain;

public class Ingrijitor {

    private Farm farm;
    private String name;

    public Ingrijitor(Farm farm, String name) {
        this.farm = farm;
        this.name = name;
    }

    public void addAnimal(Animal animal){
//        farm.getAnimals().add(animal);
        farm.addAnimal(animal);
    }

    public void putAllAnimalsToSleep(){
        for (Animal a :farm.getAnimals()){
            a.sleep(8);
        }
    }

    public void feedAllAnimals(String aliment){
        for (Animal a : farm.getAnimals()){
            a.eat(aliment);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
