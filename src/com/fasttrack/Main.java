package com.fasttrack;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Alex", 35, true);
        System.out.println(firstPerson.toString());

        Person secondPerson = new Person("Stefan", 40, true);
        System.out.println(secondPerson.toString());

        Person thirdPerson = new Person("Horia", 33, false);
        System.out.println(thirdPerson.toString());

        Product beer = new Product("Beer", 1.29, 87, "drinks");
        System.out.println(beer.toString());
        System.out.println("Has stock: " + beer.hasStock());
        System.out.println("Is category: " + beer.isCategory("drinks"));

        Product burger = new Product("Burger", 10, 100, "food");
        System.out.println(burger.toString());
        System.out.println("Has stock: " + burger.hasStock());
        System.out.println("Is category: " + burger.isCategory("drinks"));

        Product steak = new Product("Steak", 15, 20, "food");
        System.out.println(steak.toString());
        System.out.println("Has stock: " + steak.hasStock());
        System.out.println("Is category: " + steak.isCategory("drinks"));

        Bottle soda = new Bottle(1000);
        soda.openBottle();
        System.out.println("Filling thie bootle...");
        soda.fillBottle(900);
        soda.drink(1000);
        soda.closeBottle();
    }
}
