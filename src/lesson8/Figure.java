package lesson8;

public abstract class Figure implements Shape {
    private final String name;

    public String getName() {
        return name;
    }

    public Figure (String name){
        this.name = name;
    }
    }

