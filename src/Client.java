
import java.util.Scanner;

/**
 *
 * @author Graham Thompson
 * @version 8/25/2018
 */
public class Client {
    
    public static Hourly createHourlyObject(Scanner input)
    {
        System.out.println("Enter information for hourly employee.");
        System.out.print("Enter in id#: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("\nEnter in name: ");
        String name = input.nextLine();
        //input.nextLine();
        System.out.print("\nEnter in position: ");
        String position = input.nextLine();
        //input.nextLine();
        System.out.print("\nEnter in hourly rate: ");
        double hourlyRate = input.nextDouble();
        input.nextLine();
        return new Hourly(id, name, position, hourlyRate);
    }
    
    public static Salaried createSalaryObject(Scanner input)
    {
        System.out.println("Enter information for salary employee.");
        System.out.print("Enter in id#: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("\nEnter in name: ");
        String name = input.nextLine();
        //input.nextLine();
        System.out.print("\nEnter in title: ");
        String title = input.nextLine();
        //input.nextLine();
        System.out.print("\nEnter in salary: ");
        int salary = input.nextInt();
        input.nextLine();
        return new Salaried(id, name, title, salary);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee[] employeeList = new Employee[10];
        employeeList[0] = createHourlyObject(input);
        employeeList[1] = createSalaryObject(input);
        employeeList[2] = createHourlyObject(input);
        employeeList[3] = createSalaryObject(input);
        employeeList[4] = createHourlyObject(input);
        employeeList[5] = createSalaryObject(input);
        
        for(int i = 0; i <10;i++){
            try{
            System.out.println(employeeList[i].toString());
            }
            catch(NullPointerException e){
                System.out.println("id: , name: ");
            }
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
}
}
