package day109_BackendLLD_JavaAdvanceConcepts1_Generics;

import java.util.List;

public class P2_AnimalUtility {
//  public static void printAnimalNames(List<P2_Animal> animals){ //This is just a normal method with parameter as list
//  for(P2_Animal animal:animals){
//      System.out.println(animal.name);
//  }
//}

// Generic Method with UpperBound on Animal Class
	/**
	 * So basically in upper class we can not pass list<Dogs> in the place of list
	 * of animal.. because list<Dogs> and list<Animal> are not in parent child
	 * relationship in below method we can parametrize it like <T extends Animal> so
	 * basically we can provide some constraints also here means T should come from
	 * animal or below it.
	 */
	public static <T extends P2_Animal> List<T> printAnimalNames(List<T> animals) {
//  animals.add(new Animal("Elephant")); //If T Extends animal then we can not add anything here.. because this is generic method
				//suppose if some cat variable calls this method then we can not allow cat to add animal or like
//		animals.add(new P2_Dogs("jony"));
		
		animals.add(null);//it does not matter which list can call this fun.. null can be added anywhere.
		animals.remove(animals.size() - 1);//like same this can be done 
		for (P2_Animal animal : animals) {
			System.out.println(animal.name);
		}

		return animals;
	}

	//WILD CARD
	
	/**
	 * upper one can be written like this also.. it means any list which extends animal.
	 * in upper one we used T just because of the return purpose.... like which data type it should return.
	 */
	public static void printAnimalNames2(List<? extends P2_Animal> animals) {
//  animals.add(new Animal("Elephant"));
		animals.add(null);
		animals.remove(animals.size() - 1);
		for (P2_Animal animal : animals) {
			System.out.println(animal.name);
		}
	}

//Dog -> Animal
//List<Dog> -> List<Animal>
}
