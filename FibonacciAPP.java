package FibonacciAPP;
import java.util.Scanner;
public class FibonacciAPP {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		// get user input
		System.out.print("How many fibonacci numbers would you like to print? (1-32)");
		int amt=userinput.nextInt();
		// make sure that input is valid
		if (amt>32) {
			System.out.print("Enter a valid number");
		}
		// add the previous two values together for the current term and display
		else; {
			int [] values;
			values=new int[amt];
			for (int i=0;i<values.length;i++) {
				if (i<2) {
					values[i]=i;
				}
				else {
					values[i]=values[i-1]+values[i-2];
				}
				System.out.println(i +": "+ values[i]);
			}
		}
	}
}
