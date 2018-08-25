
import java.util.Objects;

/**
 * Hourly class extends the Employee class
 * Takes id (int) number, name (string),
 * position (string), and hourly rate (double)
 * @author Graham Thompson
 * @version 8/25/2018
 */
public class Hourly extends Employee {
    private String position;
    private double hourlyRate;
        
    /**
     * Creates instance of Hourly object 
     * @param id int
     * @param name String
     * @param position String
     * @param hourlyRate double
     */
    public Hourly(int id, String name, String position, double hourlyRate){
        super(id,name);
        this.position = position;
        this.hourlyRate = hourlyRate;
    }
    
    /**
     * Returns Hourly employee's position
     * @return position string
     */
    public String getPosition(){
        return this.position;
    }
    
    /**
     * Returns hourly employee's hourly rate
     * @return hourlyRate int
     */
    public double getHourlyRate(){
        return this.hourlyRate;
    }
    
    /**
     * Sets hourly employee's position
     * @param position string
     */
    public void setPosition(String position){
        this.position = position;
    }
    
    /**
     * Sets hourly employee's hourly rate
     * @param hourlyRate double
     */
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
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
        if ( !( o instanceof Hourly ) )
            return false;   
        Hourly e = ( Hourly ) o;
        return super.getId() == e.getId()
                && super.getName().equals( e.getName())
                && this.getHourlyRate() == e.getHourlyRate()
                && this.getPosition().equals(e.getPosition());        
    }
    
    /**
     * Takes Hourly's class fields and puts them
     * into a readable string
     * @return string
     */
    @Override
    public String toString(){
        return super.toString() + ", position: " + this.getPosition() + ", hourly rate: " + this.getHourlyRate();
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.position);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.hourlyRate) ^ (Double.doubleToLongBits(this.hourlyRate) >>> 32));
        return hash;
    }

}
