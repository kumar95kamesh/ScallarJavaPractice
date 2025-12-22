package day123_BackendLLDDesignPatternsBehaviouralDesignPattern;

public class Client {
    public static void main(String[] args) {
        GoogleMaps g = new GoogleMaps();
        g.findPathByMode(TravelMode.BIKE);//TravelMode is enum which has fixed objects.. so its kind of 
        //drop down which will have fix values.. 

//        g.findPathByMode2(new WalkPathCalcStrategy());
    }
}