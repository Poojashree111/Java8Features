package java8;
import java.util.Random;

public class Randum5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Random random = new Random();
	        random.ints().limit(5).forEach(System.out::println);
	        random.ints().limit(5).sorted().forEach(System.out::println);

	}

}
