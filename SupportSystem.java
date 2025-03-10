/**
 * This class implements a technical support system. It is the top level class 
 * in this project. The support system communicates via text input/output 
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user,
 * and an object of class Responder to generate responses. It contains a loop
 * that repeatedly reads input and generates output until the users wants to 
 * leave.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }
    
    
    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();
             input = input.trim();
             input = input.toLowerCase(); 
            if(input.equals("bye")) {
                finished = true;
            }
            else {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }

        printGoodbye();
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }

}
/**
    #2. 
    
    #3.
    
    #4. endsWith(String suffix)
    
    #5.length()
    
    #6.test

    #7. Sring text = text.trim();
    
    #10.Return type is boolean
    
    #13. java.util, it generate random numbers, Random(),
   */
  
/** PART 2 
    
 * #24. Hashmap is a way to store data using pairs, keys and values
 * #26. size()
 * #28. the new value replaces the old one.
 * #29. both values are stored separately, since they have different keys.
 * #30. while using containskey()
 * #31. it return null
 * #32. you use keySet()
 * #34. both store things, but Arraylist lets you have duplicates while hashset doesnt.
 * #35. you can define it to splut by a specific character like split(",")
 * #36. to split a string with a tab you use split([ \\t]) , and for a colon it's simply split(":")
 * #37. HashSet doesn't have any order for the elements while Arraylist does.
 * #38. it outputs empty strings.
 * #39. class variables: everyone in the classs can use them, you can also use them without making an object. Class methods: you also dont need to make an object to use them,they are associated with the class rather than an instance of the class
*/