package AtHomework1;

public class App {
    public static void main(String[] args) {
        Car myCar;
        myCar = new Car("DeLorean", "DMC-12", "metallic", 123456, 1230, true, 78, "v6");
        myCar.horn();
        Engine myEngine;
        myEngine = new Engine(false, 2849, 150, 14);
        System.out.println(myCar.horn());
        //System.out.println(myCar.carEngine);
    }
}
