package workdata;

import animal.Animal;

public class Data {
   private final Animal animal;

    public Data(Animal animal) {
        this.animal = animal;
    }

    public String getAnimalData() {
        return "Name: " + this.animal.getName() + "#" + "Color: " + this.animal.getColor() + "#";
    }
}
