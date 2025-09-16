public class Magpie
{
    /**
     * Return a greeting to start the conversation.
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk. Type in \"Bye\" to end our chat.";
    }

    /**
     * Gives a response to a user statement.
     * For now, it just returns a random response.
     * @param statement the user’s statement
     * @return a response
     */
    public String getResponse(String statement)
    {
        return getRandomResponse();
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        int whichResponse = (int)(Math.random() * NUMBER_OF_RESPONSES); // random number 0–3
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting.";
        }
        else if (whichResponse == 1)
        {
            response = "Okay.";
        }
        else if (whichResponse == 2)
        {
            response = "I haven't heard that before.";
        }
        else if (whichResponse == 3)
        {
            response = "What else could you tell me about that?";
        }

        return response;
    }
}
