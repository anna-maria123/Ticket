abstract class Transport implements Information {
    private String name;
    public int placeOrder;
    public Transport(String name,  int placeOrder) {
        try{
            if(placeOrder<=0){
                throw new IllegalArgumentException("Початкова кількість місць у автобусі має бути більшп за 0");
            }
            this.name = name;
            this.placeOrder = placeOrder;
        }catch (IllegalArgumentException e){
            System.out.println("Помилка під час виведеної інформації про транспорт");
        }

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

