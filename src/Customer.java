public class Customer {
    public String surname;
    public String name;
    public String contacts;


    public int numberOfSeats;

    public Customer(String surname, String name,String contacts,  int numberOfSeats) {
        this.surname = surname;
        this.name = name;
        this.contacts = contacts;
        this.numberOfSeats = numberOfSeats;
    }
    public void customerInfo(){
        System.out.println("Прізвище, ім'я покупця:  " + name + " " + surname);
        System.out.println("Номер телефону покупця:  " + contacts);
        System.out.println("Кількість замовлених місць:  " + numberOfSeats);
    }

}

git