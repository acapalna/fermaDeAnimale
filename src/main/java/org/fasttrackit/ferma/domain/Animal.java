package org.fasttrackit.ferma.domain;

public class Animal {
    private String name;
    private String porecla;

    public Animal(){

    }

    public Animal(String name, String porecla) {
        this.name = name;
        this.porecla = porecla;
    }

    public void eat(String aliment){
        System.out.println(porecla + "("+  name +  ")"+ " " + name + " a mancat " + aliment);
    }

    public void sleep(int hoursOfSleep){
        System.out.println(porecla + "("+  name +  ")"+ " doarme " + hoursOfSleep + " ore");
    }


}
