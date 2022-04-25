package workdata;

import animal.Animal;

public class PrintData {
    public void showData(Animal animal, PrintType type) {
        new PrintFormatSwitcher().formatSwitcher(type).format(animal.getData());
    }
}
