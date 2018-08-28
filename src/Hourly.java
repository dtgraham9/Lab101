
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
    private static int hourlyCounter =0;
        
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
        setHourlyRate(hourlyRate);
        hourlyCounter++;
    }
    
    /**
     * Returns number of Hourly instances
     * @return 
     */
    public static int getHourlyCounter()
    {
        return hourlyCounter;
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
     * Does not allow negative rate if 
     * negative rate set to 0
     * @param hourlyRate double
     */
    public final void setHourlyRate(double hourlyRate){
        if(hourlyRate >= 0.0)
        {
            this.hourlyRate = hourlyRate;
        }
        else
        {
            this.hourlyRate = 0.0;
        }
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
        return super.equals(o)
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
