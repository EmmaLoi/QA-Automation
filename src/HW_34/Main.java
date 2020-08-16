package HW_34;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Home privateHouse = new Home(new Window("huge", "wooden"), "wooden", "200 square meters", 20);
    Home highRise = new Home(new Window("small", "plastic"), "metal", "700 square meters", 1);
    Home office = new Home(new Window("big", "plastic"), "plastic", "\n" +
        "200 square meters", 3);
    Home office2 = new Home(new Window("200 square meters", "plastic"), "plastic", "\n" +
        "big", 2);

    System.out.println(privateHouse.equals(office));
    System.out.println(privateHouse.equals(highRise));
    System.out.println(highRise.equals(office));
    System.out.println(office.equals(office2));

    System.out.println("HashCode privateHouse = " + privateHouse.hashCode());
    System.out.println("HashCode highRise = " + highRise.hashCode());
    System.out.println("HashCode office = " + office.hashCode());
    System.out.println("HashCode office2 = " + office2.hashCode());

    ArrayList<Home> listHome = new ArrayList<>();
    listHome.add(office2);
    listHome.add(office);
    listHome.add(highRise);
    listHome.add(privateHouse);
    listHome.sort(Home::compareTo);

    for (Home h : listHome) {
      System.out.println(h);
    }

    ArrayList<Car> listCar = new ArrayList<>();
    listCar.add(new Car("BMW", "black", 2018));
    listCar.add(new Car("Chevrolet", "white", 2020));
    listCar.add(new Car("Nissan", "red", 2015));
    listCar.add(new Car("Buick", "yellow", 2012));
    listCar.sort(Car::compareTo);

    for (Car c : listCar) {
      System.out.println(c);
    }

    ArrayList<Dog> listOfDog = new ArrayList<>();
    listOfDog.add(new Dog("Rick", 8));
    listOfDog.add(new Dog("Candy", 1));
    listOfDog.add(new Dog("Terra", 4));
    listOfDog.add(new Dog("Rex", 12));
    listOfDog.sort(Dog::compareTo);

    for (Dog d : listOfDog) {
      System.out.println(d);
    }
  }
}