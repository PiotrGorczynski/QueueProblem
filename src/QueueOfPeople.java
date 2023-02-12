import java.util.Deque;

public class QueueOfPeople<T>
{
    private final Deque<T> queue;

    public QueueOfPeople(Deque<T> queue)
    {
        this.queue = queue;
    }

    public void processCommand(String command)
    {
        if(command.contains("ADD PERSON"))
        {
            addPerson(command);
        }
        else if(command.contains("LEAVE"))
        {
            leavePerson(command);
        }
        else if(command.contains("PROCESS"))
        {
            processPerson(command);
        }
        else
        {
            throw new RuntimeException("Something is wrong with the command: " + command);
        }
    }

    private void addPerson(String command)
    {

    }

    private void leavePerson(String command)
    {

    }

    private void processPerson(String command)
    {

    }
}
