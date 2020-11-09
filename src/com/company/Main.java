
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // static demo
        System.out.println(Car.static_member);
        // object instantiation
        final Car bmw = new Car ( "BMW", "Blue");
        System.out.println(bmw.manufacturer+" "+bmw.colour);
        // reassignment
        System.out.println("bmw ref: "+bmw);
        //bmw = new Car("BMW", "Blue"); can't modify final
        System.out.println("bmw ref: "+bmw);
        bmw.manufacturer = "Mercedes"; // can modify object even if variable is final
        System.out.println(bmw.manufacturer+" "+bmw.colour);




        Car TOYOTA = new Car ("TOYOTA", "black");
        System.out.println(TOYOTA.manufacturer+" "+TOYOTA.colour);

        Vehicle motorcycle = new Vehicle( "motorcycle", "fast");
        System.out.println(motorcycle.wheeled+" "+motorcycle.speed);
// passing primitives
        int b =3;
        modifyInt(b);
        System.out.println("b="+b);
// passing objects
        System.out.println("Car "+bmw.manufacturer);
        modifyCar(bmw);
        System.out.println("Car "+bmw.manufacturer);
    }

    public static void modifyInt(int a) {
        System.out.println("a="+a);
        a = 100;
    }

    public static void modifyCar(Car car) {
        System.out.println("car="+car);
        car.manufacturer = "Audi";

    }
}
