package ooplab9;

import ooplab8.Pet;

public class Cow extends Pet {
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("More More");
    }
}