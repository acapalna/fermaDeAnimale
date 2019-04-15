package org.fasttrackit.ferma.domain;

import org.fasttrackit.ferma.exception.ValidationException;

public class Animal {
    private String name;
    private String porecla;

    public Animal(){

    }

    public Animal(String name, String porecla) throws ValidationException {
        if (name==null || name.equals("") || name.contains("5")){
            throw new ValidationException("The name of the animal is invalid");
        }

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
