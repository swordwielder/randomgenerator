import java.util.*;
public class test{

	public static void main(String [] args)
	{
		int [] integers;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to randomly generate an array of numbers");
		int random = input.nextInt();

		for(int i = random; i >0; i--){

			Random rand = new Random();
			int m = rand.nextInt();
			int r = (int)(Math.random()*m);
			System.out.println(r);
		}

		System.out.println("Completed");
	}

}
