import animal.Cat;
import animal.Dog;
import animal.Parrot;
import workdata.PrintData;
import workdata.PrintType;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "Black");
        Dog dog = new Dog("Palkan", "Black-Orange");
        Parrot parrot = new Parrot("Kesha", "Red-Yellow-Blue");
        PrintData data = new PrintData();
        data.showData(cat, PrintType.TXT);
        data.showData(dog, PrintType.CONSOLE);
        data.showData(parrot, PrintType.CONSOLE);
    }
}
