package org.fasttrackit.ferma.game;

import org.fasttrackit.ferma.domain.Animal;
import org.fasttrackit.ferma.domain.Farm;
import org.fasttrackit.ferma.domain.Ingrijitor;

public class FarmGame {

    public static void main(String[] args) {
        Animal catel = new Animal("catel", "Labus");
        Animal pisica = new Animal("pisica", "Mata");
        Animal oaie = new Animal("oaie", "beee");

        Farm myFarm = new Farm();

        Ingrijitor ion = new Ingrijitor(myFarm, "Ionut Bacalu");

        ion.addAnimal(catel);
        ion.addAnimal(pisica);
        ion.addAnimal(oaie);

        ion.feedAllAnimals("varza");
        ion.putAllAnimalsToSleep();

        System.out.println(ion.getName() + " merge acasa ca e obosit.");
    }
}
