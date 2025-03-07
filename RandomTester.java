
/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.ArrayList;
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random randomGenerator;
    public ArrayList<String> responses;
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        randomGenerator = new Random();
        responses = new ArrayList<>();
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("who knows");
        responses.add("I'll ask my mom");
        responses.add("no idea");
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
    
    public String getResponse()
    {
        int index = randomGenerator.nextInt(3);
        if (index == 0){
            return "yes";
        }
        else if (index == 1){
            return "no";
        }
        else{
            return "maybe";
        }
    }
    
    public String getBetterResponse()
    {
        int index = randomGenerator.nextInt(responses.size());
        return responses.get(index);
    }
    
    public void maxRandomRange(int max)
    {
        int index = randomGenerator.nextInt();
    }
}
