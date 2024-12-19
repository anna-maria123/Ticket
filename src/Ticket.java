public class Ticket implements Information {
    public int startPrices;
    public String start;
    public String finish;
    public double distance;
    private String typesOfClass;
    public String startTime;
    public String finishTime;

    public Ticket(int startPrices, String start, String finish, double distance,String typesOfClass, String startTime,String finishTime) {
        this.startPrices = startPrices;
        this.start = start;
        this.finish = finish;
        this.distance = distance;
        this.typesOfClass=typesOfClass;
        this.startTime=startTime;
        this.finishTime=finishTime;
    }

    public void calculatePrice(Customer customer) {
        if ( customer.numberOfSeats > 1) {
            System.out.println("Ціна за квитки: "+ startPrices * customer.numberOfSeats );
        } else{
            System.out.println("Ціна за квиток "+ startPrices);
        }
    }

    public synchronized void seat(Customer customer,Transport transport) {
        System.out.println("Покупець " + customer.name + " хоче замовити " + customer.numberOfSeats + " місць");
        if (customer.numberOfSeats <= transport.placeOrder) {
            transport.placeOrder -= customer.numberOfSeats;
            System.out.println("Покупець " + customer.name + " успішно замовив " + customer.numberOfSeats + " кількість місць. Залишилося місць " + transport.placeOrder);
        } else {
            System.out.println("Покупцю " + customer.name + " не вдалося замовити квитки,тому що не має вільних місць. Виберіть інший квиток ");
        }
    }
        @Override
        public void displayInfo () {
            System.out.println("Квиток від міста " + start + " до міста " + finish);
            System.out.println("Відправляється: " + startTime);
            System.out.println("Прибуває: " + finishTime);
            System.out.println("Дистанція: " + distance + " км");
        }

}