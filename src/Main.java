import java.util.ArrayDeque;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        QueueOfPeople<Person> queue = new QueueOfPeople<>(new ArrayDeque<>());
        PersonCommandProcessor commandProcessor = new PersonCommandProcessor(queue);
        List<String> commandList = List.of(
                "ADD PERSON(Tomasz_Romański)",
                "ADD PERSON(Rafał_Adamczuk)",
                "ADD PERSON(Tomasz_Romański)",
                "ADD PERSON(Mariusz_Wilczek)",
                "ADD PERSON(Tomasz_Romański)",
                "ADD PERSON(Zbigniew_Ratajczak)",
                "PROCESS",
                "LEAVE PERSON(Mariusz_Wilczek)"
//                "PROCESS",
//                "PROCESS",
//                "PROCESS"

        );

        for (String command : commandList)
        {
            commandProcessor.processCommand(command);
        }


    }
}
