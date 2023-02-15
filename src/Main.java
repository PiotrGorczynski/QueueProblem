import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        QueueOfPeople<Person> queue = new QueueOfPeople<>(new ArrayDeque<>(), new ArrayDeque<>());
        PersonCommandProcessor commandProcessor = new PersonCommandProcessor(queue);

        System.out.println("Give the name and surname: ");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
        {
            String command = scanner.nextLine();
            if("EXIT".equals(command))
            {
                System.out.println("Exiting program...");
                break;
            }
            commandProcessor.processCommand(command);

        }

//        List<String> commandList = List.of(
//                "ADD PERSON(Tomasz_Romański)",
//                "ADD PERSON(Rafał_Adamczuk)",
//                "ADD PERSON(Tomasz_Romański)",
//                "ADD PERSON(Mariusz_Wilczek)",
//                "ADD PERSON(Tomasz_Romański)",
//                "ADD PERSON(Zbigniew_Ratajczak)",
//                "ADD PERSON(Mariusz_Wilczek,VIP)",
//                "ADD PERSON(Zbigniew_Ratownik)",
//                "ADD PERSON(Roman_Tomaszewski,VIP)",
//
//                "PROCESS",
//                "LEAVE PERSON(Mariusz_Wilczek)"
////                "PROCESS",
////                "PROCESS",
////                "PROCESS"
//
//        );
//
//        for (String command : commandList)
//        {
//            commandProcessor.processCommand(command);
//        }


    }
}
