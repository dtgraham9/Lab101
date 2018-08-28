
import java.util.Scanner;

/**
 * Creates three Salaried class and three Hourly class 
 * that are stored in an Employee array
 * All classes are create via input from keyboard
 * All classes are printed by toString
 * All classes receive a 10% raise and reprinted via toString
 * Finally the total of each type of class is printed
 * The equals method for Employee, Salaried, and Hourly are test
 * @author Graham Thompson
 * @version 8/25/2018
 */
public class Client {
    /**
     * Prompt for id and name values and return a String array
     * @param input
     * @return 
     */
    public static String[] createEmployee(Scanner input)
    {
        System.out.print("Enter in id#: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Enter in name: ");
        String name = input.nextLine();
        String[] employeeValues = new String[2];
        employeeValues[0] = String.valueOf(id);
        employeeValues[1] = name;
        return employeeValues;
        
    }
    /**
     * Calls createEmployee to prompt for id and name then prompt 
     * for position and hourly rate to return Hourly object
     * @param input
     * @return 
     */
    public static Hourly createHourlyObject(Scanner input)
    {
        System.out.println("Enter information for hourly employee.");
        String[] employeeValues = createEmployee(input);
        System.out.print("Enter in position: ");
        String position = input.nextLine();
        System.out.print("Enter in hourly rate: ");
        double hourlyRate = input.nextDouble();
        input.nextLine();
        return new Hourly(Integer.parseInt(employeeValues[0]), employeeValues[1], position, hourlyRate);
    }
    /**
     * Calls createEmployee to prompt for id and name and then prompt
     * for title and salary to return Salaried
     * @param input
     * @return 
     */
    public static Salaried createSalaryObject(Scanner input)
    {
        System.out.println("Enter information for salary employee.");
        String[] employeeValues = createEmployee(input);
        System.out.print("Enter in title: ");
        String title = input.nextLine();
        System.out.print("Enter in salary: ");
        int salary = input.nextInt();
        input.nextLine();
        return new Salaried(Integer.parseInt(employeeValues[0]), employeeValues[1], title, salary);
    }
    
    public static Employee fillEmployeeArray(Scanner input)
    {
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee[] employeeList = new Employee[10];
        for(int i = 0, hourly=0,salary=0; i <10; i++){
            if((hourly>3)&&(salary>3)){
                System.out.println("Choose h for hourly or s for salaried or exit to exit: ");
                String userDecision= input.nextLine();
                if(userDecision.equals("exit")){
                    
                }
            }
        }
        
        for(int i = 0; i <10;i++){
            System.out.println(employeeList[i].toString());
        }
        
        System.out.println("\nRaise");
        for (int i = 0; i < 10; i++) {

            if (employeeList[i] instanceof Hourly) {
                ((Hourly) employeeList[i]).setHourlyRate(((Hourly) employeeList[i]).getHourlyRate() * 1.1);
                System.out.println(employeeList[i].toString());
            } else if (employeeList[i] instanceof Salaried) {
                ((Salaried) employeeList[i]).setSalary((int) (((Salaried) employeeList[i]).getSalary() * 1.1));
                System.out.println(employeeList[i].toString());
            }

        }
        //Number of class instances
        System.out.println("\nNumber of Employee instances: " + Employee.getEmployeeCounter());
        System.out.println("Number of Hourly instances: " + Hourly.getHourlyCounter());
        System.out.println("Number of Salaried instances: " + Salaried.getSalariedCounter()); 
        
        //Test false for employee equals
        Employee employeeTemplate = new Employee(1,"Bob");
        Employee falseEmployee = new Employee(2,"Sam");
        System.out.println("\nTesting for false value for Employee equals: " + employeeTemplate.equals(falseEmployee));
        
        //Test true for employee equals
        Employee trueEmployee = new Employee(1, "Bob");
        System.out.println("Test for true value for Employee equals: " + employeeTemplate.equals(trueEmployee));
        
        //Test false for Hourly equals
        Hourly hourlyTemplate = new Hourly(1,"Bob","Intern",15.0);
        Hourly falseHourly = new Hourly(2,"Sam", "Senior", 15.0);
        System.out.println("Test for false value for Hourly equals: " + hourlyTemplate.equals(falseHourly));
        
        //Test true for Hourly equals
        Hourly trueHourly = new Hourly(1,"Bob","Intern",15.0);
        System.out.println("Test true value for Hourly equals: " + hourlyTemplate.equals(trueHourly));
        
        //Test false for Salaried equals
        Salaried salariedTemplate = new Salaried(1,"Bob","Intern",1500);
        Salaried falseSalaried = new Salaried(2,"Sam","Senior", 200000);
        System.out.println("Test for false value for Salaried equals: " + salariedTemplate.equals(falseSalaried));
        
        //Test true for Salaried equals
        Salaried trueSalaried = new Salaried(1,"Bob","Intern",1500);
        System.out.println("Test for true value for Salaried equals: " + salariedTemplate.equals(trueSalaried));
        
        

    }
}
