import java.util.ArrayList;
public class PassengerList   {
    private ArrayList<Passengers> passengers;
    public PassengerList(){
        passengers=new ArrayList<>();
    }
    public void addPassenger(Passengers passenger) {
        passengers.add(passenger);
    }

    public void displayInfo(Customer customer) {
        System.out.println("");
        System.out.println("Список пасажирів за цим квитком(для перевірки водієм):");
       System.out.println("------------");
        System.out.println("* " + customer.name + " "+ customer.surname);
    }
    public void displayAllPassenger(){
        for (Passengers passenger: passengers) {
            passenger.displayInfo();
        }
    }

}
