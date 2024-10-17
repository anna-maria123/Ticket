public class Passengers implements Information{
    public String surname;
    public String name;

    public Passengers(String name, String surname) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public void displayInfo(){
        System.out.println("* "+ surname + " " + name);
    }
}
