abstract class Transport {
    private String name;
    private int numberOfSeats;
    private int placeOrder;
    private String typesOfClass;

    public Transport(String name,  int placeOrder, String typesOfClass) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.typesOfClass = typesOfClass;
        this.placeOrder = placeOrder;
    }

   // public void bookSeatInfo() {
      //  if (this.placeOrder > this.numberOfSeats) {
            //++placeOrder;
       //    System.out.println("Квитки куплено");
       // } else {
       //    System.out.println("Немає вільних місць");
      //  }
   // }

    public void displayInfo() {
        System.out.println("МАРКА: " + name + " КІЛЬКІСТЬ МІСЦЬ: "
                + placeOrder + " ТИП КЛАСУ МАШИНИ: " + typesOfClass);
    }



}

