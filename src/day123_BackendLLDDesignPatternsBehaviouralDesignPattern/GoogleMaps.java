package day123_BackendLLDDesignPatternsBehaviouralDesignPattern;

public class GoogleMaps {
    void findPathByMode(TravelMode travelMode) {
    	//factory's aim is to just provide object of right class, 
        PathCalcStrategy p = PathCalStrategyFactory.createPathCalculator(travelMode);
        p.findPath(); //the class object it returned has find path mtd
    }


    //another way without factory.. but here we won't get to know which object to pass.. check client
    void findPathByMode2(PathCalcStrategy p) {
        p.findPath();
    }

}