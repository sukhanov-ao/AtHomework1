package AtHomework1;

public class Car {
    String name = "Delorean";
    String model = "DMC-12";
    String color = "metallic";
    int run = 12345;
    private int weight = 1230;
    private boolean rta = true;
    private int gasTankVol = 78;
    private Engine engine = new Engine();


    public void horn() {
        System.out.println("Подача звукового сигнала, берегите уши : Beep-Beep!!!");
    }
    public void consuption() {
        System.out.println("Топлива потрачено за все время " + run / engine.getFuelRate() + " л.");
    }
}