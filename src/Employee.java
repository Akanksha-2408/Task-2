public class Employee {
    public static void main(String[] args) {

        System.out.println("\n\n---Primitive data types---");
        byte employeeId = 101;
        short departmentCode = 2101;
        int age = 35;
        long annualSalary = 12_00_000L;
        float workingHours = 8.5f;
        double monthlySalary = 100000.75;
        char grade = 'A';
        boolean isPermanent = true;

        System.out.println("\nEmployee Details:");
        System.out.println("ID (byte): " + employeeId);
        System.out.println("Department Code (short): " + departmentCode);
        System.out.println("Age (int): " + age);
        System.out.println("Annual Salary (long): " + annualSalary);
        System.out.println("Daily Working Hours (float): " + workingHours);
        System.out.println("Monthly Salary (double): " + monthlySalary);
        System.out.println("Grade (char): " + grade);
        System.out.println("Is Permanent (boolean): " + isPermanent);

        System.out.println("\n---Type Casting---");
        //Implicit casting
        double bonus = age;  // int to double
        System.out.println("\nBonus(Implicit cast int to double): " + bonus);

        // Explicit casting (narrowing conversion)
        try {
            int roundedSalary = (int) monthlySalary;  // double to int
            System.out.println("Monthly Salary (rounded- explicit cast" + roundedSalary);
        } catch (Exception e) {
            System.out.println("Error in casting monthly salary: " + e.getMessage());
        }

        // Casting beyond range (with data loss)
        try {
            byte overflowedId = (byte) 130;  // byte range is -128 to 127
            System.out.println("Casted employee ID with overflow: " + overflowedId);
        } catch (Exception e) {
            System.out.println("Error in overflowed casting: " + e.getMessage());
        }

        System.out.println("\n---Wrapper Class---");
        // Wrapper class usage
        Integer ageObj = Integer.valueOf(age);
        Double salaryObj = Double.valueOf(monthlySalary);
        Boolean statusObj = Boolean.valueOf(isPermanent);
        Character gradeObj = Character.valueOf(grade);

        System.out.println("\nWrapped Age (Integer): " + ageObj);
        System.out.println("Wrapped Salary (Double): " + salaryObj);
        System.out.println("Wrapped Status (Boolean): " + statusObj);
        System.out.println("Wrapped Grade (Character): " + gradeObj);

        System.out.println("\n---Object Casting---");
        // Object casting example
        Object obj = "5000";

        try {
            String str = (String) obj;
            System.out.println("\nObject cast to String: " + str);

            // Trying invalid cast
            Integer salaryCast = (Integer) obj;  // Will throw ClassCastException
            System.out.println("Cast to Integer (invalid): " + salaryCast);
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }

        System.out.println("\n---String Parsing---");

        try {
            String bonusStr = "5000";
            int parsedBonus = Integer.parseInt(bonusStr);
            System.out.println("Parsed Bonus (int): " + parsedBonus);

            String invalid = "abc";
            int failParse = Integer.parseInt(invalid);  // Will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        System.out.println("\nArray of mixed types using Object[]");
        Object[] empData = { employeeId, age, monthlySalary, "Manager", true };
        System.out.println("\nEmployee data (Object Array):");
        for (Object data : empData) {
            System.out.println("- " + data);
        }
    }
}