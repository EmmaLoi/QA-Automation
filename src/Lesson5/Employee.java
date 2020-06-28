package Lesson5;

public class Employee {

    private String name = "";
    private String position = "";
    private String telephone = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override 
    public String toString(){
        return "Employee details:" + name + " " + position + " " + telephone;
       // return super.toString();
    }
}
