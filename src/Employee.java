
import java.util.Objects;

/**
 * Employee stores id (int) number
 * and name (string) 
 * @author Graham Thompson
 * @version 8/25/2018
 */
public class Employee {
    private int id;
    private String name;
       
    /**
     * Creates instance of Employee with an id
     *  and name
     * @param id of employee
     * @param name of employee
     */
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    /**
     * Returns this employee's name
     * @return name 
     */
    public String getName(){
        return this.name;
    }
    
    /**
     *Returns this employee's id number
     * @return id
     */
    public int getId(){
        return this.id;
    }
    
    /**
     * Sets the employee's id number
     * @param id int
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * Sets the employee's name
     * @param name string
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Takes employee's class fields and puts them
     * into a readable string
     * @return string
     */
    @Override
    public String toString(){
        return "id: " + this.getId() + ", name: " + this.getName();
        
    }
    
    /**
     * Tests if Object provided is instance of Employee
     * if so checks its fields for equality.
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals( Object o )
    {
        if ( !( o instanceof Employee ) )
            return false;   
        Employee e = ( Employee ) o;
        return id == e.id
                && name.equals( e.name );     
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.name);
        return hash;
    }


}
