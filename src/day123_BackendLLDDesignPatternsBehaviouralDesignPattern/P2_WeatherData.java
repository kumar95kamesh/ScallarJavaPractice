package day123_BackendLLDDesignPatternsBehaviouralDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class P2_WeatherData implements P2_Subject{

    private List<P2_Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public P2_WeatherData(){
        observers = new ArrayList<>(); //whenever this is called an empty list is created
    }

    @Override
    public void registerObserver(P2_Observer o) {
        observers.add(o);
        System.out.println("New Observer is registered");
    }

    @Override
    public void removeObserver(P2_Observer o) {
        observers.remove(o);
        System.out.println("Observer is de-registered!");
    }

    @Override
    public void notifyObservers() {
        System.out.println("-----Let's Notify-----");
        for(P2_Observer o:observers){
            o.update(temperature, humidity,pressure);
        }
    }

    public void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
