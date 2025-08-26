import java.util.*;

public class RegisterService {

    static Queue<User> users = new LinkedList<>();
    static List<User> list = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    static Set<Employee> employees = new HashSet<>();

    public static void RegisterUser() {
            System.out.println("Enter email: ");
            String email = sc.nextLine();
            if (!email.matches(RegularExp.email)) {
                System.out.println("Invalid email format");
                return;
            }

            System.out.println("Enter password: ");
            String password = sc.nextLine();
            if (!password.matches(RegularExp.password)) {
                System.out.println("Invalid password format");
                return;
            }

            System.out.println("Enter contact number: ");
            String contact = sc.nextLine();
            if (!contact.matches(RegularExp.contact)) {
                System.out.println("Invalid contact number format");
                return;
            }

            System.out.println("Enter date of birth (dd-mm-yyyy): ");
            String date = sc.nextLine();
            if (!date.matches(RegularExp.date)) {
                System.out.println("Invalid date format");
                return;
            }

            User u = new User(email, password, contact, date);
            users.add(u);
            list.add(u);
            System.out.println("User registered successfully!");
    }

    public static void ShowAllUsers() {
        if (list.isEmpty()) {
            System.out.println("No users found.");
            return;
        }

        System.out.println("\nUser Data:");
        for (User u : list) {
            System.out.println(u.toString());
        }
    }

    public static Employee AcceptData() {
        System.out.println("Enter employee id: ");
        byte employeeId = Byte.parseByte(sc.nextLine());
        System.out.println("Enter Department code: ");
        short departmentCode = Short.parseShort(sc.nextLine());
        System.out.println("Enter Employee's age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Employee's Annual salary: ");
        long annualSalary = Long.parseLong(sc.nextLine());
        System.out.println("Enter Employee's Working hours: ");
        float workingHours = Float.parseFloat(sc.nextLine());
        System.out.println("Enter Employee's Monthly salary: ");
        double monthlySalary = Double.parseDouble(sc.nextLine());
        System.out.println("Enter Employee's grade: ");
        String grade1 = sc.nextLine();
        char grade = grade1.charAt(0);
        System.out.println("Is employee permanent ? (true/ false)");
        boolean isPermanent = Boolean.parseBoolean(sc.nextLine());

        return new Employee(employeeId, departmentCode, age, annualSalary, workingHours, monthlySalary, grade, isPermanent);
    }

    public static void AddEmployee() {
        System.out.println("Add Employee ? (Y/ N)");
        String result = sc.nextLine();
        if(result.equalsIgnoreCase("Y")) {
            Employee emp = AcceptData();
            employees.add(emp);
        }
        else if (result.equalsIgnoreCase("N")) {
            if(!employees.isEmpty()) {
                for (Employee e : employees) {
                    System.out.println(e.toString());
                }
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }

}
