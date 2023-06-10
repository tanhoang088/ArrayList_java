import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU: ");
        System.out.println("1. Input employee: ");
        System.out.println("2. Show all list employee: ");
        System.out.println("3. Exit program.");
        int inputNumber = 0;
        ArrayList<Employment> employeeList = new ArrayList<>();
        while (inputNumber != 3) {
            System.out.print("Input your choice: ");
            inputNumber = sc.nextInt();
            switch (inputNumber) {
                case 1: {
                    Employment employee = new Employment();
                    System.out.print("Input ID: ");
                    employee.setId(sc.next());
                    System.out.print("Input Name: ");
                    employee.setName(sc.next());
                    System.out.print("Input Age: ");
                    employee.setAge(sc.nextInt());
                    employeeList.add(employee);
                    break;
                }
                case 2: {
                    for (int i = 0; i < employeeList.size(); i++) {
                        System.out.printf("%d: %s | %s | %d \n", i+1 , employeeList.get(i).getId(), employeeList.get(i).getName(), employeeList.get(i).getAge());
                    }
                    break;
                }
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid input! Choose again!");
            }
        }
    }
}