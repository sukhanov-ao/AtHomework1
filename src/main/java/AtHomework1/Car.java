package AtHomework1;

public class Car {
    String name;
    String model;
    String color;
    int run;
    int weight;
    private boolean rta;
    private int gasTankVol;
    String engine;

    public Car(String name, String model, String color, int run, int weight, boolean rta, int gasTankVol, String engine) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.run = run;
        this.weight = weight;
        this.rta = rta;
        this.gasTankVol = gasTankVol;
        this.engine = engine;
    }

    public String horn() {
        //System.out.print("Beep-Beep");
        return "Beep-Beep!";
    }
}