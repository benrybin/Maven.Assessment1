package com.zipcodewilmington.assessment1.part3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
String name;
Pet[] sam;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {

        this.name = name;
        this.sam = pets;
        if(!(sam == null)){
            for (Pet pet: sam){

                pet.setOwner(this);

            }
        }

    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        if (!(sam == null)) {
            //System.out.println(temp.get());
            Pet[] newPet = new Pet[sam.length + 1];
            newPet[sam.length + 1] = pet;
            sam = newPet;


        } else {
            sam = new Pet[1];
            sam[0] = pet;
        }
    }


//        ArrayList temp = new ArrayList<Pet>(Arrays.asList(sam));
//        temp.add(pet);
//
//
//        temp.toArray(sam);


//        List<Pet> temp = new ArrayList<>();
//        Pet [] arrayTemp = new Pet[sam.length + 1];
//          if(!(sam ==  null)){
//              temp = Arrays.asList(getPets());
//          }
//         temp.add(pet);
//          System.out.print(temp.get(0));
//         //Pet[] sam =  temp.toArray(temp.size());
//        temp.toArray(arrayTemp);
//        sam = arrayTemp;



    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        List<Pet> temp = new ArrayList<>(Arrays.asList(sam));
        System.out.println(sam.length);
        for(int i =0;i<temp.size();i++){
            if(temp.get(i) == pet){
                temp.remove(i);
                System.out.println(i);
                System.out.println(sam[0]);
            }
        }
        Pet[] temp2 = temp.toArray(new Pet[temp.size()]);
        sam[0] = null;


    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        for (Pet pet2:sam){
            if(pet2 == pet){
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer counter= 100;
        for (Pet pet:sam) {
            if(pet.getAge() < counter){
                counter = pet.getAge();

            }

        }
        return counter;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer counter= 1;
        for (Pet pet:sam) {
            if(pet.getAge() > counter){
                counter = pet.getAge();

            }

        }
        return counter;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Double avg = 0.0;
       Double answer =0.0;
        Double numPets = 0.0;
        for (Pet pet:sam) {
            avg += pet.getAge();
            numPets++;

        }
        answer = avg/numPets;
        float myFloat = answer.floatValue();

        return myFloat;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return sam.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return sam;
    }
}
