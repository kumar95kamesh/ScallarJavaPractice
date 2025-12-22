package day111_BackendLLDJavaAdvancedConcepts3StreamsandLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
	public static void main(String[] args) {

////    Anonymous Class
//
//    SampleInterface si = new SampleInterface(){
//
//        @Override
//        public void fun() {
//            System.out.println("Hello Fun");
//        }
//
//        @Override
//        public void bun() {
//            System.out.println("Hello Bun");
//        }
//    };
//
//    si.bun();
//
//    Student st = new Student(){
//
//        private int test;
//
//        public void bun(){ //Useless function... wo alag baat h agar ise fun() m iska use hota..
//            System.out.println("ANonymous's Fun Method");
//        }
//
//        @Override
//        public void fun(){
//            System.out.println("ANonymous's Fun Method");
//        }
//    };

//    	st.fun(); // due to runtime polymorphism this mtd will be called.
//
//      st.bun();//This mtd is not in parent so can not call that.. because that st reference is not of parent type.
//
//    Runnable r = new Runnable() {
//        @Override
//        public void run() {
//            System.out.println("My Task");
//        }
//    };
//
//    Thread t = new Thread(r);
//    t.start();
//
//    Runnable r2 = new Runnable() {
//        @Override
//        public void run() {
//
//        }
//    };
//
//    Thread t2 = new Thread(r2);
//
//    Thread t3 = new Thread(new Runnable() {//same thing direct function m hi object create kr diya.. e.g. r2 ka right part
//        @Override
//        public void run() {
//
//        }
//    });

		// Lambda's
//    Way 1 of writting runnable interface.. class implements interface.
//    HelloWorldPrinter
//        Runnable r = new HelloWorldPrinter
//    Way 2: Anonymous class
//    Runnable r = new Runnable() {
//        @Override
//        public void run() {
//
//        }
//    }
//    Way 3: Lambda.. since thread expects Runnable interface and it is functional interface.
//    Thread t = new Thread(()->{
//        System.out.println(Thread.currentThread().getName()+ " Hello World");
//    });
//    t.start();

//    Runnable r = new Runnable() {
//        @Override
//        public void run() {
//
//        }
//    };
//
		// Anonymous classs ki bhi jrurat nhi h.. like upper one.
//    Runnable r = ()->{  
//        System.out.println("Hello World");
//    };
//
//    Thread t = new Thread(r);
//
//    Thread t2 = new Thread(()->{
//        System.out.println("Hello World");
//    });
//
//    	sort array list.
//    ArrayList<Integer> list = new ArrayList<>();
//    list.add(500);
//    list.add(100);
//    list.add(15);
//		way1
//    Comparator<Integer> cmp = (o1,o2)->{
//        return o2-o1;
//    };
//
//		way2 directly write comparator lambda function.
//    Collections.sort(list,(o1,o2)->{//sort expect comparator as argument.. and it is functional interface.
//        return o2-o1;
//    });
//
//    System.out.println(list);

//    List<Integer> l2 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);
//
//    Stream<Integer> s1 = l2.stream(); // converted list into stream and stored in s1.. stream has some fucntions which we can use and play with it.
//
//    s1.forEach((elem)->{ 			//forEach expects some consumer.. and this consumer is functional interface.. and it accepts argument.. here argument will be interger value. like 5,10..
//        System.out.print(elem+" ");
//    });

//    s1 = s1.limit(4); //limit will stop data to 4 elements only and it return another stream.. here we have overridden previous only..
//
//    s1.forEach((elem)->{
//        System.out.print(elem+" "); //here it will return first 4 eles only.. 5,10,2,1
//    });
//
//    System.out.println();
//
//    System.out.println(l2);

//    Streams -> has Intermediate and Terminal functions
//    Intermediate fn -> Return a Stream back   e.g. limit
//    Terminal fn -> Terminates a stream.. stream is ended after that.. it can not be used later. e.g. forEach

//    List<Integer> l2 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);
//
//    l2.stream().limit(4).forEach((e)-> System.out.println(e)); //everything in a single line

		List<Student> list1 = new ArrayList<>();
//    Student st1 = new Student(25 , 65.0 , "Mohit" , 10.0);
//    Student st2 = new Student(21 , 78.0 , "Nishant" , 100.0);
		list1.add(new Student(25, 65.0, "Mohit", 10.0));
		list1.add(new Student(21, 78.0, "Nishant", 100.0));
		list1.add(new Student(28, 20.0, "Rohan", 90.0));

//    list1.stream().filter((e)->{
//        return e.psp>50;  //filtering based on psp>50
//    }).limit(3).forEach((e)->{
//        System.out.println(e);
//    });
//
//		way1
//		(e)-> e.psp>50
//		way2
//		(e)->{
//			return e.psp>50;
//		}
//		way 1 and way2 Both the things are same because it has only 1 mtd and single line to return
//		 so no need of return statement and curly braces.
//		
//    list1.stream().filter((e)-> e.psp>50).limit(1).forEach((e)->{System.out.println(e);});

		/**
		 * collect(Collectors.toList()
		 * collect is to collect data after processing data.
		 * Collectors.tolist().. in which format you want to collect data.
		 */
//    System.out.println(list1);//printnig before process
//    List<Student> l3 = list1.stream().filter(e->e.psp>50).collect(Collectors.toList());
//    System.out.println(l3);//printing after process

		/**
		 * making stream of list and filtering by even numbers and squaring and collecting in form of list.
		 */
//    List<Integer> l2 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);
//    List<Integer> l3=l2.stream().filter(e->e%2==0).map(e->e*e).collect(Collectors.toList());
//		System.out.println(l3);
		
//		Lambda function
////    Predicate<Integer> predicate = (e)->{
////        return e%2==0;
////    };
//
		//Anonymous class
//    Predicate<Integer> predicate = new Predicate<Integer>() {
//        @Override
//        public boolean test(Integer integer) {
//            return false;
//        }
//    };
//
//    List<Integer> l3 = l2.stream().filter(predicate).map(e->{
//        return e*e;
//    }).collect(Collectors.toList());
//
//    System.out.println(l3);

//    List<Integer> l2 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);
//
//    int count = (int)l2.stream().filter(e->{
//        System.out.println("Inside Filter"+e);
//        return e%2==0;
//    }).count();
////
////    System.out.println(count);
//
//    Stream<Integer>s1 = l2.stream().map(e->{
//        System.out.println("Inside Map"+e);
//        return e*e;
//    });
//
//    int count = (int)s1.count();
//
//    System.out.println(count); //map will not be executed.. bcoz count hi to jan ne h.. hr element ka square krne s kya hi frk pdega

		
		/**
		 * its not necessary that findFirst will return an element all the time.. so
		 * its Optional.. and it returns Optional
		 * here if we see the console it has executed filter only for 5 and 10.. because
		 * after that line its not necessary to get first even number.
		 */
//    List<Integer> l2 = List.of(50 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);
//    Optional<Integer> optional = l2.stream().filter(elem->{
//        System.out.println("Filtering "+elem);
//        return elem%2==0;
//    }).map(elem->{
//        System.out.println("Mapping "+elem);
//        return elem*elem;
//    }).findFirst();//from the outcome it will give first element.	 
//
//    if(optional.isPresent()){
//        System.out.println(optional.get());
//    }
		
		
//		List<Integer>Integer l3 = l2.stream();
//	            .distinct()
//	            .filter((elem)-> elem%2==0)
//	            .map(elem->{return elem*elem;})
//	            .sorted()
//	            .collect(Collectors.toList());
	//
//	    System.out.println(l3);

//    List<Integer>Integer l3 = l2.stream()
//            .distinct()
//            .filter((elem)-> elem%2==0)
//            .map(elem->{return elem*elem;})
//            .sorted((o1,o2)->{return o2-o1;})    //can be sorted on other parameter.//here descending... comparator Interface
//            .collect(Collectors.toList());
//
//    System.out.println(l3);

//    reduce:- It's a terminal function.
//    It tries to converge your whole stream into a single element based on some logic

		List<Integer> l2 = List.of(50, 10, 2, 1, 16, 3, 8, 1, 2, 2);
//    find sum of a list
//    int sum = 0;
//    for(Integer elem:l2){
//        sum+=elem;
//    }

		/**
		 * reduce.. first argument is what is first value(from where we are starting).. here first sum=0 , second is lambda
		 * (cur_sum, elem) cur_sum on what variable you want to store and elem on what ele you want to do for every ele
		 * To find max curr_sum will be neg infinite, 
		 */
		// this is equivalent Aggregate of SQl(count, max,min, sum)
		Integer x2 = l2.stream().reduce(0, (cur_sum, elem) -> { 
			cur_sum += elem;
			return cur_sum;
		});

		System.out.println(x2);

		// Try calculating max from reduce.. for practice

		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5),
				Arrays.asList(6, 7, 8));

		System.out.println(listOfLists);//[[1, 2, 3], [4, 5], [6, 7, 8]]

		/**
		 * Basically every elem is a 1d array list.. so first we have to return a stream of that 1d arrayList and collect.
		 * flatMap will conver whole 2d arrays into a 1d arraylist(a flat array) means it will just reduce the dimension.
		 */
		List<Integer> ans = listOfLists.stream().flatMap(elem -> {
			return elem.stream();
		}).collect(Collectors.toList());

		System.out.println(ans);//[1, 2, 3, 4, 5, 6, 7, 8]

		List<Integer> ans2 = listOfLists.stream().flatMap(elem -> {
			return elem.stream().map(elem1 -> elem1 * elem1);
		}).collect(Collectors.toList());

		System.out.println(ans2);//[1, 4, 9, 16, 25, 36, 49, 64]
		
		//parallelStreams
//		l2.parallelStream().. so instead of stream we use this then all the intermediate and terminal 
//		will run in different threads.

	}
}
