package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {

        String expectedName = "Name of Cat";
        Integer expectedAge = Integer.MAX_VALUE;

    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {

        age = getAge();
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        name = getName();

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        String name = "Name of Cat";
        Integer age = Integer.MAX_VALUE;
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
