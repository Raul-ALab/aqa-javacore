package org.raul.lesson_4.model;

abstract class Animal {

    private String name;

    public Animal(){
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void run();

    public abstract void swim();

    public String displayClassType() {
        return "I am a " + this.getClass().getSimpleName().toLowerCase();
    }
}
