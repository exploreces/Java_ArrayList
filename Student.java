


	


	import java.util.LinkedList;
	import java.util.Scanner;

	public class Student {
	    private String name;
	    private int age;
	    private double mark;

	    public Student(String name, int age, double mark) {
	        this.name = name;
	        this.age = age;
	        this.mark = mark;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public double getMark() {
	        return mark;
	    }

	    
	    public String toString() {
	        return name + ", " + age + " years old, " + mark + " marks";
	    }

	    public static void main(String[] args) {
	        LinkedList<Student> students = new LinkedList<>();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\nSelect an operation to perform:");
	            System.out.println("1. Display the list");
	            System.out.println("2. Search for a student");
	            System.out.println("3. Remove a student");
	            System.out.println("4. Count the number of students");
	            System.out.println("5. Add a student to the list");
	            System.out.println("6. Exit");

	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    displayList(students);
	                    break;
	                case 2:
	                    searchStudent(students, scanner);
	                    break;
	                case 3:
	                    removeStudent(students, scanner);
	                    break;
	                case 4:
	                    countStudents(students);
	                    break;
	                case 5:
	                    addStudent(students, scanner);
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

	    public static void displayList(LinkedList<Student> list) {
	        if (list.isEmpty()) {
	            System.out.println("The list is empty.");
	        } else {
	            System.out.println("The list is:");
	            for (Student student : list) {
	                System.out.println(student);
	            }
	        }
	    }

	    public static void searchStudent(LinkedList<Student> list, Scanner scanner) {
	        if (list.isEmpty()) {
	            System.out.println("The list is empty.");
	        } else {
	            System.out.println("Enter the name of the student to search for:");
	            String name = scanner.next();
	            boolean found = false;
	            for (Student student : list) {
	                if (student.getName().equals(name)) {
	                    found = true;
	                    System.out.println("Student found:\n" + student);
	                }
	            }
	            if (!found) {
	                System.out.println("Student not found.");
	            }
	        }
	    }

	    public static void removeStudent(LinkedList<Student> list, Scanner scanner) {
	        if (list.isEmpty()) {
	            System.out.println("The list is empty.");
	        } else {
	            System.out.println("Enter the name of the student to remove:");
	            String name = scanner.next();
	            boolean removed = false;
	            for (Student student : list) {
	                if (student.getName().equals(name)) {
	                    list.remove(student);
	                    removed = true;
	                    System.out.println("Student removed:\n" + student);
	                    break;
	                }
	            }
	            if (!removed) {
	                System.out.println("Student not found.");
	            }
	        }
	    }

	    public static void countStudents(LinkedList<Student> list) {
	        int count = list.size();
	        if (list.isEmpty()) {
	            System.out.println("The list is empty.");
	        } else {
	            System.out.println("Number of students in the list: " + count);
	        }
	    }
	    
	    public static void addStudent(LinkedList<Student> list, Scanner scanner) {
	        System.out.println("Enter the name of the student:");
	        String name = scanner.next();
	        System.out.println("Enter the age of the student:");
	        int age = scanner.nextInt();
	        System.out.println("Enter the marks of the student:");
	        double marks = scanner.nextDouble();
	        Student student = new Student(name, age, marks);
	        list.add(student);
	        System.out.println("Student added to the list:\n" + student);
	    }
	}







