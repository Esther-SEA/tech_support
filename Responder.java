/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
import java.util.ArrayList;
import java.util.Random;
public class Responder
{
    private Random randomGenerator;
    public ArrayList<String> responses;
    /**
     * Construct a Responder - nothing to do
     */
    
    public Responder()
    {
         randomGenerator = new Random();
        responses= new ArrayList<>();
        fillResponses();
    }

    private void fillResponses()
    {
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("who knows");
        responses.add("I'll ask my mom");
        responses.add("no idea");
    }
    
     public String generateResponse()
    {
        int index = randomGenerator.nextInt(responses.size());
        return responses.get(index);
    }
}
