package day123_BackendLLDDesignPatternsBehaviouralDesignPattern;

import day123_BackendLLDDesignPatternsBehaviouralDesignPattern.WalkPathCalcStrategy;

public class P2_WeatherStation {
    public static void main(String[] args) {
        // Subject
        P2_WeatherData weatherData = new P2_WeatherData();

        // Observers
        P2_Observer c = new P2_CurrentConditionsDisplay();
        P2_Observer f = new P2_ForecastDisplay();
        P2_Observer s = new P2_StatisticsDisplay();

        weatherData.registerObserver(c);
        weatherData.registerObserver(f);
        weatherData.registerObserver(s);

        weatherData.setMeasurements(80,54,34);
        System.out.println();//all the observers should notified

        weatherData.setMeasurements(70,54,34);
        System.out.println();//all the observers should notified

        weatherData.setMeasurements(70,44,34);
        System.out.println();//all the observers should notified

        weatherData.removeObserver(c);

        weatherData.setMeasurements(79,44,34);
        System.out.println();//all the observers should notified
    }
}
