abstract class Transport implements Information {
    private String name;
    public int placeOrder;


    public Transport(String name,  int placeOrder) {
        this.name = name;
        this.placeOrder = placeOrder;
    }


  @Override
    public void displayInfo() {
      System.out.println("");
      System.out.println("Інформація про квиток:");
      System.out.println("--------------");
        System.out.println("МАРКА: " + name + " КІЛЬКІСТЬ МІСЦЬ: "
                + placeOrder );
    }



}

