package day109_BackendLLD_JavaAdvanceConcepts1_Generics;

import java.util.ArrayList;
import java.util.List;

public class P2_Main {
public static void main(String[] args) {
    List<P2_Dogs> dogs = new ArrayList<>();
//  dogs.add(new Animal("")); // can not be written
  dogs.add(new P2_Dogs("Tobby"));
  dogs.add(new P2_Dogs("Tommy"));

  List<P2_Animal> animals = new ArrayList<>();//it is list of animals not parametrized.
  animals.add(new P2_Dogs("Tom"));
  animals.add(new P2_Dogs("Tom1"));
  animals.add(new P2_Animal("Human"));

  P2_AnimalUtility.printAnimalNames(animals);
  P2_AnimalUtility.printAnimalNames(dogs);//can be passed because of parameterized method..(second one).
}
}
