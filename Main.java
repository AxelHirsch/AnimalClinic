import animal.Cat;
import animal.Dog;
import animal.Parrot;
import workdata.PrintData;
import formatter.FormatterType;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "Black");
        Dog dog = new Dog("Palkan", "Black-Orange");
        Parrot parrot = new Parrot("Kesha", "Red-Yellow-Blue");
        PrintData data = new PrintData();
        data.showData(cat, FormatterType.HTML);
        data.showData(dog, FormatterType.CONSOLE);
        data.showData(parrot, FormatterType.CONSOLE);
    }
}
