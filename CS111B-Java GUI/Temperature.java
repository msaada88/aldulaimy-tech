import java.util.Scanner;

/**
 * A class that handles temperature objects holding degrees and
 * handles conversion between Celsius and Fahrenheit
 * 
 * @author Boris Alguliev
 * @author Mohamed Saada
 * @version 1
 * @since 2017-03-22
 *
 */

public class Temperature
{
    private double degrees;
    private char type;
    
    public Temperature (double degrees, char type)
    {
        this.degrees = degrees;
        this.type = type;
    }
    
    public Temperature (double degrees)
    {
        this.degrees = degrees;
        this.type = 'C';
    }
    
    public Temperature (char type)
    {
        this.type = type;
        this.degrees = 0;
    }
    
    public Temperature ()
    {
        this.degrees = 0;
        this.type = 'C';
    }
    
    private Temperature convert ()
    {
        if (type == 'C' || type == 'c')
        {
            return new Temperature (degrees * 1.8 + 32, 'F');
        }
        else if (type == 'F' || type == 'f')
        {
            return new Temperature ( (degrees - 32) / 1.8, 'C');
        }
        else
            return this;
    }
    
    private double round (double num)
    {
        return Math.round(num*10)/10.0;
    }
    
    public void readInput ()
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Input the degree measurement: ");
        this.degrees = scan.nextDouble ();
        
        scan.nextLine (); //clear buffer
        
        System.out.print ("Input the measurement scale: ");
        this.type = scan.nextLine ().charAt (0);
        
        while (type != 'c' && type != 'C' && type != 'f' && type != 'F')
        {
            System.out.print ("Please input either 'C' or 'F' : ");
            this.type = scan.nextLine ().charAt (0);
        }
    }
    
    public void writeOutput ()
    {
        System.out.println (round(degrees) + " degrees " + type);
    }
    
    public void writeC ()
    {
        if (type == 'C' || type == 'c')
            this.writeOutput ();
        else
            convert().writeOutput ();
    }
    
    public void writeF ()
    {
        if (type == 'F' || type == 'f')
            this.writeOutput ();
        else
            convert().writeOutput ();
    }
    
    public double getC ()
    {
        double tempC;
        
        if (type == 'C' || type == 'c')
            tempC = degrees;
        else
            tempC = convert().degrees;
        
        return round(tempC);
    }
    
    public double getF ()
    {
        double tempF;
        
        if (type == 'F' || type == 'f')
            tempF = degrees;
        else
            tempF = convert().degrees;
        
        return round(tempF);
    }
    
    public void set (double degrees)
    {
        this.degrees = degrees;
    }
    
    public void set (double degrees, char type)
    {
        this.degrees = degrees;
        this.type = type;
    }
    
    public void set (char type)
    {
        this.type = type;
    }
    
    public boolean equals (Temperature otherTemp)
    {
        return (this.getC () == otherTemp.getC ());
    }
    
    public String toString()
    {
        return (round(degrees) + " degrees " + type);
    }
}