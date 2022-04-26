package animal;

import workdata.Data;

public abstract class Animal {
    private final String name, color;
    private final Data data;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        data = new Data(this);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Data getData() {
        return data;
    }
}
