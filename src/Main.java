import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car("Opel", 2);
        Transport bus = new Bus("Mersedes", 55);
        Customer carCustomer = new Customer("Ivanyshyn", "Andriy", "0976542770", 3);
        Customer busCustomer = new Customer("Lidak", "Anna", "096578930", 5);
        Passengers carPassengers = new Passengers("Iryna", "Ivanyshyn");
        Passengers carPassengers1 = new Passengers("Viktoria", "Ivanyshyn");
        Passengers busPassenger = new Passengers("Lida", "Lidak");
        Passengers busPassenger1 = new Passengers("Ivan", "Vorobiy");
        Passengers busPassenger2 = new Passengers("Veronika", "Vorobiy");
        Passengers busPassenger3 = new Passengers("Artur", "Suhoruk");
        Passengers busPassenger4 = new Passengers("Maria", "Suhoruk");
        Ticket carTicket = new Ticket(1000, "Lviv", "Herson",
                769.8, "Comfort", "23.30", "5.00");
        Ticket busTicket = new Ticket(1500, "Kyiv", "Odesa", 450,
                "Premium", "9.00", "16.00");
        Ticket carTicket1 = new Ticket(500, "Odesa", "Harkiv", 600, "Econom", "14.00", "23.00");

        TicketList ticketList = new TicketList();
        PassengerList passengerList = new PassengerList();
        ticketList.displayInfo();
        ticketList.displayAllTickets();
        ticketList.addTicket(carTicket);
        ticketList.addTicket(busTicket);
        ticketList.addTicket(carTicket1);
        ticketList.removeTicket(busTicket);
        ticketList.displayAllTickets();
        ticketList.removeTicket(carTicket);
        Scanner ticket = new Scanner(System.in);
        boolean moreUsers = true;

        while (moreUsers) {
            ticketList.displayAllTickets();
            System.out.println("Введіть номер квитка, який бажаєте вибрати (1, 2 або 3):");
            int ticketChoice = ticket.nextInt();
            Ticket selectedTicket = null;
            switch (ticketChoice) {
                case 1:
                    selectedTicket = carTicket;
                    break;
                case 2:
                    selectedTicket = busTicket;
                    break;
                case 3:
                    selectedTicket = carTicket1;
                    break;
                default:
                    System.out.println("Неправильний вибір. Спробуйте ще раз.");
                    continue;
            }
            if (selectedTicket != null) {
                System.out.println("Ви вибрали квиток:");
                System.out.println("-----------");
                selectedTicket.displayInfo();
                System.out.println("Інформація про пасажирів:");
                System.out.println("-------------");
                if (ticketChoice == 1) {
                    passengerList.displayInfo(carCustomer);
                    passengerList.addPassenger(carPassengers);
                    passengerList.addPassenger(carPassengers1);
                    passengerList.displayAllPassenger();
                    car.displayInfo();
                    carCustomer.displayInfo();
                    carTicket.calculatePrice(carCustomer);
                    carTicket.bookSeatInfo(carCustomer, car);
                } else if (ticketChoice == 2) {
                    passengerList.displayInfo(busCustomer);
                    passengerList.addPassenger(busPassenger);
                    passengerList.addPassenger(busPassenger1);
                    passengerList.addPassenger(busPassenger2);
                    passengerList.addPassenger(busPassenger3);
                    passengerList.addPassenger(busPassenger4);
                    passengerList.displayAllPassenger();
                    bus.displayInfo();
                    busCustomer.displayInfo();
                    busTicket.calculatePrice(busCustomer);
                    busTicket.bookSeatInfo(busCustomer, bus);
                } else if (ticketChoice == 3) {
                }
            }

            System.out.println("Чи є ще один користувач, який хоче вибрати квиток? (введіть 'так' або 'ні'):");
            String moreUsersChoice = ticket.next();
            if (moreUsersChoice.equalsIgnoreCase("ні")) {
                moreUsers = false;
                System.out.println("Дякуємо всім користувачам за використання програми!");
            }
        }
        ticket.close();
    }
}







