package HW_5;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "I am a cat. With name " + name + ", with age " + age;
    }
}
