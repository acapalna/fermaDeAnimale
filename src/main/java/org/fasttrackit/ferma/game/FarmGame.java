package org.fasttrackit.ferma.game;

import org.fasttrackit.ferma.domain.Animal;
import org.fasttrackit.ferma.domain.Farm;
import org.fasttrackit.ferma.domain.Ingrijitor;
import org.fasttrackit.ferma.exception.ValidationException;

public class FarmGame {

    public static void main(String[] args) {
        Animal catel = null;


        Farm myFarm = new Farm();

        Ingrijitor ion = new Ingrijitor(myFarm, "Ionut Bacalu");

        try {
             catel = new Animal("catel", "Labus");
        }catch (ValidationException ve){
            System.out.println("Am prins o exceptie :" + ve.getMessage());
        }
        try {
            Animal pisica = new Animal("pisica5", "Mata");
            ion.addAnimal(pisica);

            Animal oaie = new Animal("oaie", "beee");
            ion.addAnimal(oaie);
        }catch (ValidationException ve){
            System.out.println("Am prins o exceptie :" + ve.getMessage());
        }



        ion.addAnimal(catel);


        ion.feedAllAnimals("varza");
        ion.putAllAnimalsToSleep();

        System.out.println(ion.getName() + " merge acasa ca e obosit.");

        try {
            Animal invalidAnimal = new Animal("Animal5", "");
        }catch (ValidationException ve){
            System.out.println("Invalid animal. Aduceti caruciorul " + ve.getMessage());
        }
    }
}
