package day112_BackendLLDJavaAdvancedConcepts4ExceptionHandling;

public class Student {
	 static void test(int a){
	        test(a);
	    }

	    static int doSomething(int x) {
//	        return 1/x;
//	        if(x==0){
//	            throw new ArithmeticException();
//	        }else if(x==1){
//	            throw new ClassCastException();
//	        }else if(x==2){
//	            // checked Exception thats why have to use throws
//	            throw new SQLException();
//	        }else if(x==3){
//	            throw new NullPointerException();
//	        }else if(x==4){
//	            throw new IllegalAccessException();
//	        }

//	        try{
//	            throw new IllegalAccessException("Testing Exceptions");
//	        }catch (IllegalAccessException e){
//	            System.out.println(e.getMessage());
////	            return -1;
//	        }

//	        throw new IllegalAccessException("Testing Exceptions");

//	        System.out.println("Hello World");


//	        return 0;

//	        System.out.println("Test");
//	        throw new IllegalAccessException("Test"); //WE can show some message also.

//	        throw new RandomException();//our own defined exception.. check another class.
//	        return 0;

//	        throw new StackOverflowError("Random Stack OverFlow Error");

//	        try{
////	            System.out.println("Test");
//	            Student.doSomething(2);
	//
//	        }catch(Exception e1){
//	            System.out.println(e1);
//	        }catch (Error e){
//	            System.out.println(e.getMessage());
//	        }

//	        test(0);

	        try{
	            if(x==5){
	                throw new Exception();
	            }

	            if(x==6){
	                System.out.println("X==6 in try");
	                return 1;
	            }

	            System.out.println("Clearning Reousces");
	            return 2;

	        }catch(Exception e1){
	            System.out.println(e1);
	            return 3;
	        }finally {
	            System.out.println("Finally Block");
	            return 4;
	        }

	        /**
	         * RunTime Exception + These are exceptional conditions that are internal to the
application, and that the application usually cannot anticipate or recover from. These
usually indicate programming bugs, such as logic errors or improper use of an API. 


Errors
These are exceptional conditions that are external to the application, and that the
application usually cannot anticipate or recover from. For example, suppose that an
application successfully opens a file for input, but is unable to read the file because
of a hardware or system malfunction.

Finally block
The finally block always executes when the try block exits. This ensures that
the finally block is executed even if an unexpected exception occurs. But finally is
useful for more than just exception handling - it allows the programmer to avoid having
cleanup code accidentally bypassed by a return, continue, or break. Putting cleanup
code in a finally block is always a good practice, even when no exceptions are
anticipated.

Extra
Runtime exceptions can occur anywhere in a program, and in a typical one they can be
very numerous. Having to add runtime exceptions in every method declaration would reduce
a program's clarity. Thus, the compiler does not require that you catch or specify
runtime exceptions (although you can).

"If it's so good to document a method's API, including the exceptions it can throw, why
not specify runtime exceptions too?" Runtime exceptions represent problems that are the
result of a programming problem, and as such, the API client code cannot reasonably be
expected to recover from them or to handle them in any way. Such problems include
arithmetic exceptions, such as dividing by zero; pointer exceptions, such as trying to
access an object through a null reference; and indexing exceptions, such as attempting
to access an array element through an index that is too large or too small.

Here's the bottom line guideline: If a client can reasonably be expected to recover from
an exception, make it a checked exception. If a client cannot do anything to recover
from the exception, make it an unchecked exception.

Sometimes, it's appropriate for code to catch exceptions that can occur within it. In
other cases, however, it's better to let a method further up the call stack handle the
exception. For example, if you were providing the ListOfNumbers class as part of a
package of classes, you probably couldn't anticipate the needs of all the users of your
package. In this case, it's better to not catch the exception and to allow a method
further up the call stack to handle it.

When faced with choosing the type of exception to throw, you can either use one written
by someone else - the Java platform provides a lot of exception classes you can use - or
you can write one of your own. You should write your own exception classes if you answer
yes to any of the following questions; otherwise, you can probably use someone else's.

* Do you need an exception type that isn't represented by those in the Java platform?
. Would it help users if they could differentiate your exceptions from those thrown by
classes written by other vendors?
. Does your code throw more than one related exception?

. If you use someone else's exceptions, will users have access to those exceptions? A
similar question is, should your package be independent and self-contained?


	         */



//	        return 4;

	    }

}
