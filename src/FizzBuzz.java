import java.util.stream.IntStream;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fizzBuzzBeforeJava8(24);
        fizzBuzzInJava8(24);
	}

	    private static void fizzBuzzBeforeJava8(int num)
	    {
	        for (int i = 1; i <= num; i++)
	        {
	        	 if (((i % 3) == 0) && ((i % 5) == 0)&& ((i % 7) == 0))
		                System.out.println("fizzbuzzwoff");
	        	else if (((i % 3) == 0) && ((i % 5) == 0))
	                System.out.println("fizzbuzz");
	        	else if (((i % 3) == 0) && ((i % 7) == 0))
	                System.out.println("fizzwoff");
	        	else if (((i % 7) == 0) && ((i % 5) == 0))
	                System.out.println("buzzwoff");
	            else if ((i % 3) == 0) 
	                System.out.println("fizz");
	            else if ((i % 5) == 0)
	                System.out.println("buzz");
	            else if ((i % 7) == 0)
	                System.out.println("woff");
	            else
	                System.out.println(i);
	        }
	    }
	 
	    private static void fizzBuzzInJava8(int num) {
	        IntStream.rangeClosed(1, 100)
	                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
	                .forEach(System.out::println);
	    }
}
