
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.HashMap;
public class MapTester
{
    // instance variables - replace the example below with your own
    private int x;
    public HashMap<String,String> hashMap;
    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        // initialise instance variables
        hashMap = new HashMap<>(); 
    }
    
    public void enterNumber(String name, String number)
    {
        hashMap.put(name,number);
    }
    
    public String lookupNumber(String name)
    {
        return hashMap.get(name);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
