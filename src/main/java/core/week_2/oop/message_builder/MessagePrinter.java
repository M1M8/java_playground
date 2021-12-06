package core.week_2.oop.message_builder;

public class MessagePrinter
{
    private String message;

    public MessagePrinter(String message)
    {
        this.message = message;
    }

    public void getMessage()
    {
        System.out.println(message);
    }
}
