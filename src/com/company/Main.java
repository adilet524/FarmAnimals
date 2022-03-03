package com.company;

public class Main {

    public static void main(String[] args) {

        Cow cow = new Cow("Ulka", (byte) 4, 203.6, "Ui");
        Cow cow2 = new Cow("Red cow", (byte) 3, 209.8, "Ui");
        Cow cow3 = new Cow("Grey cow", (byte) 1, 150.0, "Buka");
        Cow cow4 = new Cow("Black cow", (byte) 2, 180.3, "Buka");
        Cow cow5 = new Cow("Yellow bull", (byte) 6, 300.6, "Ui");
        Cow cow6 = new Cow("Kashenka", (byte) 1, 80.0, "Buka");

        Sheep sheep = new Sheep("Gulya", (byte) 1, 70.0, "Koi");
        Sheep sheep2 = new Sheep("Elya", (byte) 1, 69.9, "Koi");
        Sheep sheep3 = new Sheep("Dokush", (byte) 1, 79.5, "Kochkor");
        Sheep sheep4 = new Sheep("Sonya", (byte) 1, 56, "Koi");

        Horse horse = new Horse("Maisalbek", (byte) 4, 256, "Aigyr");
        Horse horse2 = new Horse("Karager", (byte) 3, 234, "Aigyr");
        Horse horse3 = new Horse("Ahiles", (byte) 5, 287, "Aigyr");


        Cow[] cows = {cow, cow2, cow3, cow4, cow5};
        Sheep[] sheeps = {sheep, sheep2, sheep3};
        Horse[] horses = {horse, horse2};

        Farm farm = new Farm("Adilet", "Kadyrova 89a", cows, sheeps, horses);
        System.out.println(farm);


        Cow[] cows2 = {cow6};
        Sheep[] sheeps2 = {sheep4};
        Horse[] horses2 = {horse3};

        Farm farm2 = new Farm("Bakyt", "Kyshtobaeva 89a", cows2, sheeps2, horses2);
        System.out.println(farm2);


    }
}
