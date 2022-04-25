package workdata;

import animal.Data;

public class ToTxt implements Formatter {
    @Override
    public void format(Data data) {
        System.out.println(" +++ This is txt file +++ " + data.getAnimalData() + " +++ This is txt file +++ ");
    }
}
