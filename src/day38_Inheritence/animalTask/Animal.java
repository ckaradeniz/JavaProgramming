package day38_Inheritence.animalTask;

public class Animal {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public Animal(String name, String breed, int age, char gender, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.color = color;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
1. Create a class named Animal:
			Variables:
				name, breed, age, gender, size, color

			Add a constructor to set all the fields

			methods:
				eat()
				toString()
 */