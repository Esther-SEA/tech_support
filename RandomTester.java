
/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random randomGenerator;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        randomGenerator = new Random();
    }
    
    public void printOneRandom()
    {
        System.out.print(" New random number: " + randomGenerator.nextInt(100));
    }
    
    public void printMultipleRandom(int howMany)
    {
        int index = 0;
        while (index<howMany){
            printOneRandom();
            index++;
        } 
    }
}
