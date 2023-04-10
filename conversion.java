
//Write a java program to convert a decimal to binary equivalent using
//stack(Stack collection).

	import java.util.*;

	public class conversion {

		public static void convert(int decimal){

			Stack<Integer> s = new Stack<Integer>();

	        while (decimal > 0) {
	            int remainder = decimal % 2;
	            s.push(remainder);
	            decimal /= 2;
				

				while (!s.isEmpty()) {
					System.out.print(s.pop());
				}
	        }

		}
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a decimal number: ");
	        int decimal = scanner.nextInt();

			convert(decimal);

	        

	       
	    }
	}



