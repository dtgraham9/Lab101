
import java.util.Objects;

/**
 * Salaried class extends the Employee class
 * Takes id (int) number, name (string),
 * title (string), and salary (int)
 * @author Graham Thompson
 * @version 8/25/2018
 */
public class Salaried extends Employee{
    private String title;
    private int salary;
    private static int salariedCounter=0;
    
    /**
     *Creates instance of Salaried object 
     * @param id int
     * @param name string
     * @param title string
     * @param salary int
     */
    public Salaried(int id, String name, String title, int salary){
        super(id, name);
        this.title = title;
        setSalary(salary);
        salariedCounter++;
    }
    /**
     * Returns number of Salaried instances
     * @return counter
     */
    public static int getSalariedCounter(){
        return salariedCounter;
    }
    
    /**
     *Returns Salaried employee's title
     * @return title string
     */
    public String getTitle(){
        return this.title;
    }
    
    /**
     * Returns Salaried employee's salary
     * @return salary int
     */
    public int getSalary(){
        return this.salary;
    }
    
    /**
     * Sets Salaried employee's title
     * @param title string
     */
    public void setTitle(String title){
        this.title = title;
    }
    
    /**
     * Sets Salaried employee's salary
     * Does not allow negative if negative
     * set to 0
     * @param salary int
     */
    public final void setSalary(int salary){
        if(salary >= 0)
        {
            this.salary = salary;
        }
        else{
            this.salary = 0;
        }
    }
    /**
     * Takes Salaried's class fields and puts them
     * into a readable string
     * @return 
     */
    @Override
    public String toString(){
        return super.toString() + ", title: " + this.getTitle() + ", salary: " + this.getSalary();
    }
    /**
     * Tests if Object provided is instance of Hourly
     * if so checks its fields for equality.
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals( Object o )
    {
        if ( !( o instanceof Salaried ) )
            return false;   
        Salaried e = ( Salaried ) o;
        return super.equals(o)
                && this.getSalary() == e.getSalary()
                && this.getTitle().equals(e.getTitle());        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.title);
        hash = 17 * hash + this.salary;
        return hash;
    }
}
