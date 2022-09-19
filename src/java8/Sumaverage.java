package java8;
import java.util.ArrayList;
import java.util.OptionalDouble;

public class Sumaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> li=new ArrayList<Integer>();
	        li.add(5);
	        li.add(6);
	        li.add(4);
	        li.add(30);
	        li.add(80);
	        OptionalDouble avg = li.stream().mapToInt(n->n*n).filter(n->n>100).average();
	        if(avg.isPresent())
	            System.out.println(avg.getAsDouble());

	}

}
