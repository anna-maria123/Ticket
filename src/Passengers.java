public class Passengers implements Information{
    public String surname;
    public String name;
    public Passengers(String name, String surname) throws PassangerException{
        if (name == null || surname == null || name.isEmpty() || surname.isEmpty()) {
        throw new IllegalArgumentException("ім'я і прізвище користувача не можуть бути порожніми.");
    }
        this.surname = surname;
        this.name = name;

    }

    @Override
    public void displayInfo(){
            System.out.println("* " + surname + " " + name);
        }
    }

