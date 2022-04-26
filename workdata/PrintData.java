package workdata;

import animal.Animal;
import formatter.FormatterFactory;
import formatter.FormatterType;

public class PrintData {
    public void showData(Animal animal, FormatterType type) {
        FormatterFactory factory = new FormatterFactory();
        String info = factory.formatFactory(type).format(animal.getData());
        System.out.println(info);
    }
}
