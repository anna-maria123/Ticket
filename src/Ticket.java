public class Ticket extends Customer {
    public int startPrices;
    public String start;
    public String finish;
    public double distance;
    private int placeOrder;
    private String typesOfClass;



    public Ticket(String surname, String name, String contacts, int numberOfSeats,
                  int startPrices, String start, String finish, double distance,String typesOfClass,int placeOrder) {
        super(surname, name, contacts, numberOfSeats);
        this.startPrices = startPrices;
        this.start = start;
        this.finish = finish;
        this.distance = distance;
        this.typesOfClass=typesOfClass;
        this.placeOrder=placeOrder;
    }
    public void calculatePrice() {
        if ( numberOfSeats > 1) {
            System.out.println("Ціна за квитки: "+ startPrices * numberOfSeats );
        } else{
            System.out.println("Ціна за квиток "+ startPrices);
        }
    }
    public void bookSeatInfo() {
        if ( placeOrder  > numberOfSeats) {
            System.out.println("Квитки куплено");
        } else {
            System.out.println("Немає вільних місць");
        }
    }

    @Override
    public void customerInfo() {
        super.customerInfo();
    }
    public void ticketInfo(){
        System.out.println("Квиток від міста " + start + " до міста " + finish);
        System.out.println( "Дистанція: " + distance + " км");
    }
}