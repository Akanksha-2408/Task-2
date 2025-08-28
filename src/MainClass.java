import java.util.Scanner;

public class MainClass {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n\nMain Menu:\n" +
                    "1. Register User\n" +
                    "2. Update user data\n" +
                    "3. Show all users\n" +
                    "4. Add Employee\n" +
                    "5. Update Employee Salary\n" +
                    "6. Show all employees\n" +
                    "7. Exit");

            System.out.print("Enter your choice: ");
            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number!");
                continue;
            }

            switch (choice) {
                case 1:
                    RegisterService.RegisterUser();
                    break;

                case 2:
                    RegisterService.updateUser();
                    break;

                case 3:
                    RegisterService.ShowAllUsers();
                    break;

                case 4:
                    RegisterService.AddEmployee();
                    break;

                case 5:
                    RegisterService.updateEmployeeSalary();
                    break;

                case 6:
                    RegisterService.showAllEmployees();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Enter a valid choice!");
            }
        }
    }
}
