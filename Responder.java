/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
public class Responder
{
    private Random randomGenerator;
   // public ArrayList<String> responses;
    public HashMap<String, String> responses;
    /**
     * Construct a Responder - nothing to do
     */
    
    public Responder()
    {
        randomGenerator = new Random();
        //responses= new ArrayList<>();
        responses = new HashMap<>();
        fillResponses();
    }

    private void fillResponses()
    {
        responses.put("mango","yes");
        responses.put("orange","orange");
        responses.put("apple","caleb");
        responses.put("pass","who knows");
        responses.put("sleep","I'll ask my mom");
        responses.put("java","no idea");
    }
    private String pickDefaultResponse()
    {
        return "Idk leave me alone";
    }
    
     public String generateResponse(String word)
    {
        //int index = randomGenerator.nextInt(responses.size());
        String answer = responses.get(word);
        if (answer == null){
            answer = pickDefaultResponse();
        }
        return answer;
    }
}
