public class Car {
    static {
        System.out.println("Hey I'm static block in Car!");
    }

    static String static_member = "Hey, I'm static member!";

    public String manufacturer;
    public String colour;
    private String vin;

    public Car(String manufacturer, String colour) {
        this.manufacturer = manufacturer;
        this.colour = colour;
        this.vin = "ABC123"; //factory.generateVin();

    }
}

