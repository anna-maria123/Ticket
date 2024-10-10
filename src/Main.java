public class Main {
    public static void main(String[] args) {
        Transport car = new Car("Opel",5,"Comfort");
        Transport bus = new Bus("Mersedes",55,"Premium");
        Ticket carTicket = new Ticket("Ivanyshyn","Andriy","0987546340",
                7,900,"Herson","Lviv",745,"Comfort",5);
        Ticket busTicket = new Ticket("Lidak","Iryna","0976543879",25,
                1250,"Kyiv","Lviv",456.9,"Premium",55);
        car.displayInfo();
        carTicket.customerInfo();
        carTicket.ticketInfo();
        carTicket.calculatePrice();
        carTicket.bookSeatInfo();



        bus.displayInfo();
        busTicket.customerInfo();
        busTicket.ticketInfo();
        busTicket.calculatePrice();
        busTicket.bookSeatInfo();

}

}