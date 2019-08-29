package AtHomework1;

public class Car {
    String name = "DeLorean";
    String model = "DMC-12";
    String color = "metallic";
    int run = 123456;
    private int weight = 1230;
    private boolean rta = true;
    private int gasTankVol = 78;
    private Engine engine = "v6";

    Engine myEngine = new Engine();


    public void horn() {
        System.out.println("Подача звукового сигнала, берегите уши : Beep - Beep!!!");
    }
    public void consuption() {
        System.out.println("Топлива потрачено за все время " + run / myEngine.getFuelRate() + " л.");
    }
}