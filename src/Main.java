public class Main {
    public static void main(String[] args) {
        Transport car = new Car("Opel",2);
        Transport bus = new Bus("Mersedes",55);
        Customer carCustomer = new Customer ("Ivanyshyn","Andriy","0976542770",3);
        Customer busCustomer = new Customer ("Lidak","Anna","096578930",5);
        Passengers carPassengers = new Passengers("Iryna","Ivanyshyn");
        Passengers carPassengers1 = new Passengers("Viktoria","Ivanyshyn");
        Passengers busPassenger = new Passengers("Lida","Lidak");
        Passengers busPassenger1 = new Passengers("Ivan","Vorobiy");
        Passengers busPassenger2 = new Passengers("Veronika","Vorobiy");
        Passengers busPassenger3 = new Passengers("Artur","Suhoruk");
        Passengers busPassenger4= new Passengers("Maria","Suhoruk");
        Ticket carTicket = new Ticket(1000,"Lviv","Herson",
                769.8,"Comfort","23.30","5.00");
        Ticket busTicket = new Ticket(1500,"Kyiv","Odesa",450,
                "Premium","9.00","16.00");
        Ticket carTicket1 = new Ticket(500,"Odesa","Harkiv",600,"Econom","14.00","23.00");

        TicketList ticketList = new TicketList();
        PassengerList passengerList =new PassengerList();
        ticketList.displayInfo();
        ticketList.displayAllTickets();
        ticketList.addTicket(carTicket);
        ticketList.addTicket(busTicket);
        ticketList.addTicket(carTicket1);
        ticketList.removeTicket(busTicket);
        ticketList.displayAllTickets();
        ticketList.removeTicket(carTicket);


        passengerList.displayInfo(carCustomer);
        passengerList.addPassenger(carPassengers);
        passengerList.addPassenger(carPassengers1);
        passengerList.displayAllPassenger();

        car.displayInfo();
        carCustomer.displayInfo();
        carTicket.displayInfo();
        carTicket.calculatePrice(carCustomer);
        carTicket.bookSeatInfo(carCustomer,car);


        passengerList.displayInfo(busCustomer);
        passengerList.addPassenger(busPassenger);
        passengerList.addPassenger(busPassenger1);
        passengerList.addPassenger(busPassenger2);
        passengerList.addPassenger(busPassenger3);
        passengerList.addPassenger(busPassenger4);
        passengerList.displayAllPassenger();

        bus.displayInfo();
        busCustomer.displayInfo();
        busTicket.displayInfo();
        busTicket.calculatePrice(busCustomer);
        busTicket.bookSeatInfo(busCustomer,bus);

}

}