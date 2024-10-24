import java.util.ArrayList;

public class TicketList implements Information {
    private ArrayList<Ticket> tickets;



    public TicketList() {
        tickets = new ArrayList<>();
    }


    public void addTicket(Ticket ticket) {
        tickets.add(ticket);

    }

    public void removeTicket(Ticket ticket){
       tickets.remove(ticket);
        System.out.println("Квиток наразі недоступний");
        System.out.println("---------------------");
    }
    @Override
    public void displayInfo() {
        System.out.println("Інформація про всі доступні квитки:");
    }

    public void displayAllTickets(){
        for (Ticket ticket : tickets) {
            ticket.displayInfo();
            System.out.println("Ціна за квиток: " + ticket.startPrices);
            System.out.println("---------------------");
        }
    }
}

