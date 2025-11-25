package day123_BackendLLDDesignPatternsBehaviouralDesignPattern;

public class P2_CurrentConditionsDisplay implements P2_Observer, P2_DisplayElement {
    private float temperature;
    private float humidity;

    public P2_CurrentConditionsDisplay() {

    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

}
