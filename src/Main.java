import java.util.ArrayDeque;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        QueueOfPeople<Person> queue = new QueueOfPeople<>(new ArrayDeque<>());
        List<String> commandList = List.of(
                "ADD PERSON(Tomasz_Romański)",
                "ADD PERSON(Rafał_Adamczuk)",
                "ADD PERSON(Tomasz_Romański)",
                "ADD PERSON(Mariusz Wilczek)",
                "ADD PERSON(Zbigniew Ratajczak)",
                "PROCESS",
                "LEAVE PERSON(Tomasz_Romański_2)",
                "LEAVE PERSON(Mariusz_Wilczek)",
                "PROCESS",
                "PROCESS",
                "PROCESS"
        );

        for (String command : commandList)
        {
            queue.processCommand(command);
        }


    }
}