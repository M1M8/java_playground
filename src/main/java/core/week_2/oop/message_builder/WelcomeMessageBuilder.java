package core.week_2.oop.message_builder;

public class WelcomeMessageBuilder
{
    private String name;
    private String welcomeMessage;

    public WelcomeMessageBuilder(String name, String welcomeMessage)
    {
        this.name = name;
        this.welcomeMessage = welcomeMessage;
    }

    public String buildWelcomeMessage()
    {
        return "Hi!, " + this.name + " " + this.welcomeMessage;
    }
}
