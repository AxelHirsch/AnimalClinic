package workdata;

import animal.Data;

public class ToConsole implements Formatter{
    @Override
    public void format(Data data) {
        System.out.println(data.getAnimalData());
    }
}
