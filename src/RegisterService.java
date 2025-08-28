import java.util.*;

public class RegisterService {

    static Queue<User> users = new LinkedList<>();
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
        users.add(u);
        System.out.println("User registered successfully!");
    }

    public static void updateUser() {
        System.out.println("Enter User ID: ");
        long id = 0;
        try {
            id = sc.nextInt();
            sc.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Invalid user ID");
        }
        for (User u : users) {
            if (u.getId() != id) {
                System.out.println("User with this ID does not exist");
            } else {
                System.out.println("Select One-\n" +
                        "1. Update Email\n" +
                        "2. Update Password\n" +
                        "3. Update Contact Number\n");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        updateEmail(id);
                        break;
                    case 2:
                        updatePwd(id);
                        break;
                    case 3:
                        updateContact(id);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }

    public static void ShowAllUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found.");
            return;
        }

        System.out.println("\nUser Data:");
        for (User u : users) {
            System.out.println(u.toString());
        }
    }

    public static void AddEmployee() {
        Employee emp = AcceptData();
        employees.add(emp);
    }

    public static void showAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees registered yet.");
            return;
        }
        System.out.println("\n--- All Employees ---");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public static void updateEmployeeSalary() {
        System.out.println("Enter employee ID: ");
        int id = 0;
        try {
            id = sc.nextInt();
            sc.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid employee ID.");
        }

        for (Employee e : employees) {
            if (e.getEmployeeId() == id) {
                System.out.println("Enter updated salary: ");
                double salary = 0.0;
                try {
                    salary = Double.parseDouble(sc.nextLine());
                } catch (NumberFormatException ex) {
                    System.out.println("Please enter a valid salary.");
                }
                e.setSalary(salary);
            } else {
                System.out.println("Employee with this ID does not exist");
            }
        }
    }


    //Helper methods
    public static Employee AcceptData() {
        Employee emp = new Employee();

        // Employee ID: byte (0 to 127)
        while (true) {
            try {
                System.out.print("Enter Employee ID (0-127): ");
                String input = sc.nextLine();
                if (input.isEmpty()) return null;

                if (input.matches("\\d{1,3}")) {
                    byte id = Byte.parseByte(input);
                    emp.setEmployeeId(id);
                    break;
                } else {
                    System.out.println("Invalid ID format. Enter 1 to 3 digit number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid byte value.");
            }
        }

        // Department Code: short (3-5 digits)
        while (true) {
            try {
                System.out.print("Enter Department Code (3-5 digits): ");
                String input = sc.nextLine();
                if (input.isEmpty()) return null;

                if (input.matches("\\d{3,5}")) {
                    short deptCode = Short.parseShort(input);
                    emp.setDepartmentCode(deptCode);
                    break;
                } else {
                    System.out.println("Invalid department code. Must be 3 to 5 digits.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid short value.");
            }
        }

        // Age: int (18-65)
        while (true) {
            try {
                System.out.print("Enter Age (18-65): ");
                String input = sc.nextLine();
                if (input.isEmpty()) return null;

                if (input.matches("\\d{2}")) {
                    int age = Integer.parseInt(input);
                    if (age >= 18 && age <= 65) {
                        emp.setAge(age);
                        break;
                    }
                }
                System.out.println("Age must be between 18 and 65.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }

        // Salary: double
        while (true) {
            try {
                System.out.print("Enter Annual Salary: ");
                String input = sc.nextLine();
                if (input.isEmpty()) return null;

                if (input.matches("\\d+(\\.\\d{1,2})?")) {
                    emp.setSalary(Double.parseDouble(input));
                    break;
                } else {
                    System.out.println("Enter a valid salary (e.g., 50000 or 50000.75).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a numeric salary.");
            }
        }

        // Working Hours: float
        while (true) {
            try {
                System.out.print("Enter Working Hours: ");
                String input = sc.nextLine();
                if (input.isEmpty()) return null;

                if (input.matches("\\d+(\\.\\d{1,2})?")) {
                    emp.setWorkingHours(Float.parseFloat(input));
                    break;
                } else {
                    System.out.println("Invalid format. Use a number like 40 or 40.5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid float value.");
            }
        }

        // Contact Number: long (10 digits)
        while (true) {
            try {
                System.out.print("Enter Contact Number (10 digits): ");
                String input = sc.nextLine();
                if (input.isEmpty()) return null;

                if (input.matches("\\d{10}")) {
                    emp.setContact(Long.parseLong(input));
                    break;
                } else {
                    System.out.println("Contact must be a 10-digit number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid contact number.");
            }
        }

        // Grade: char (A-Z)
        while (true) {
            System.out.print("Enter Grade (A-Z): ");
            String input = sc.nextLine();
            if (input.isEmpty()) return null;

            if (input.matches("[A-Z]")) {
                emp.setGrade(input.charAt(0));
                break;
            } else {
                System.out.println("Grade must be a single uppercase letter (A-Z).");
            }
        }

        // Is Permanent: boolean
        while (true) {
            System.out.print("Is the employee permanent? (true/false): ");
            String input = sc.nextLine().toLowerCase();
            if (input.isEmpty()) return null;

            if (input.matches("true|false")) {
                emp.setPermanent(Boolean.parseBoolean(input));
                break;
            } else {
                System.out.println("Enter only 'true' or 'false'.");
            }
        }

        // instanceof check
        if (emp instanceof Employee) {
            System.out.println("Object created is an instance of Employee");
        }

        return emp;
    }

    public static void updateEmail(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                System.out.println("Email: " + user.getEmail());
                System.out.println("Enter updated email: ");
                String email1 = sc.nextLine();
                if (!email1.matches(RegularExp.email)) {
                    System.out.println("Invalid email format");
                    return;
                } else {
                    user.setEmail(email1);
                    break;
                }
            }
        }
        System.out.println("Email Updated SUccessfully !");
    }

    public static void updatePwd(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                System.out.println("Password: " + user.getPassword());
                System.out.println("Enter new password: ");
                String pwd = sc.nextLine();
                if (!pwd.matches(RegularExp.password)) {
                    System.out.println("Invalid password format");
                    break;
                } else {
                    user.setPassword(pwd);
                    break;
                }
            }
        }
        System.out.println("Password Updated Successfully !");
    }

    public static void updateContact(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                System.out.println("Contact: " + user.getContact());
                System.out.println("Enter new contact number: ");
                String number = sc.nextLine();
                if (!number.matches(RegularExp.contact)) {
                    System.out.println("Invalid password format");
                    break;
                } else {
                    user.setContact(number);
                    break;
                }
            }
        }
        System.out.println("Contact Updated Successfully !");
    }
}
