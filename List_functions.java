


	import java.util.ArrayList;
	import java.util.Scanner;

	public class List_functions {

	    public static void main(String[] args) {

	        ArrayList<Integer> numbers = new ArrayList<Integer>();
	        Scanner scanner = new Scanner(System.in);
	        int choice; 

	        do {
	            System.out.println("\nSelect an operation to perform:");
	            System.out.println("1. Display the list");
	            System.out.println("2. Search for a number");
	            System.out.println("3. Remove an element from a position");
	            System.out.println("4. Add a number to the list");
	            System.out.println("5. Check if the list is empty");
	            System.out.println("6. Exit");

	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    displayList(numbers);
	                    break;
	                case 2:
	                    searchNumber(numbers, scanner);
	                    break;
	                case 3:
	                    removeElement(numbers, scanner);
	                    break;
	                case 4:
	                    addNumber(numbers, scanner);
	                    break;
	                case 5:
	                    checkEmpty(numbers);
	                    break;
	                case 6:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	                    break;
	            }
	        } while (choice != 6);
	    }

	    public static void displayList(ArrayList<Integer> list) {
	        if (list.isEmpty()) {
	            System.out.println("The list is empty.");
	        } else {
	            System.out.println("The list is: " + list);
	        }
	    }

	    public static void searchNumber(ArrayList<Integer> list, Scanner scanner) {
	        if (list.isEmpty()) {
	            System.out.println("The list is empty.");
	        } else {
	            System.out.print("Enter a number to search for: ");
	            int number = scanner.nextInt();
	            if (list.contains(number)) {
	                System.out.println(number + " is present in the list.");
	            } else {
	                System.out.println(number + " is not present in the list.");
	            }
	        }
	    }

	    public static void removeElement(ArrayList<Integer> list, Scanner scanner) {
	        if (list.isEmpty()) {
	            System.out.println("The list is empty.");
	        } else {
	            System.out.print("Enter the position of the element to remove: ");
	            int position = scanner.nextInt();
	            if (position < 1 || position > list.size()) {
	                System.out.println("Invalid position! Please try again.");
	            } else {
	                int removedElement = list.remove(position - 1);
	                System.out.println("The element " + removedElement + " has been removed from the list.");
	            }
	        }
	    }

	    public static void addNumber(ArrayList<Integer> list, Scanner scanner) {
	        System.out.print("Enter a number to add to the list: ");
	        int number = scanner.nextInt();
	        list.add(number);
	        System.out.println(number + " has been added to the list.");
	    }

	    public static void checkEmpty(ArrayList<Integer> list) {
	        if (list.isEmpty()) {
	            System.out.println("The list is empty.");
	        } else {
	            System.out.println("The list is not empty.");
	        }
	    }
	}



