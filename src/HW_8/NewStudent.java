package HW_8;

public class NewStudent {
    String name;
    String passport;

    public NewStudent(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }


    @Override
    public String toString() {
        return name + " " + passport;
    }
}
