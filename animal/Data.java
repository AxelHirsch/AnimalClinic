package animal;

public class Data {
   private final Animal animal;

    public Data(Animal animal) {
        this.animal = animal;
    }

    public String getAnimalData() {
        return "Name: " + animal.getName() + " , " + "Color: " + animal.getColor();
    }
}
