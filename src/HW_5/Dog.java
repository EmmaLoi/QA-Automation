package HW_5;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "I am a dog. With name " + name + ", with age " + age;
    }
}
