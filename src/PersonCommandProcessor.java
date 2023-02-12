public class PersonCommandProcessor
{
    private final QueueOfPeople<Person> queueOfPeople;

    public PersonCommandProcessor(QueueOfPeople<Person> queueOfPeople)
    {
        this.queueOfPeople = queueOfPeople;
    }


    public void processCommand(String command)
    {
        if(command.contains("ADD PERSON"))
        {
            addPerson(command);
        }
        else if(command.contains("LEAVE PERSON"))
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
        Person incomingPerson = createIncomingPerson(command);
        System.out.println(command);
        queueOfPeople.welcome(incomingPerson);
    }


    private void leavePerson(String command)
    {
        Person person = createLeavingPerson(command);
        queueOfPeople.leave(person);
    }

    private Person createLeavingPerson(String command)
    {

        createIncomingPerson(command);

        String personId = command
                .replace("LEAVE PERSON(","")
                .replace(")","");
        System.out.println(command);

        String[] splitId = personId.split("_");

        if(splitId.length == 2)
        {
            return new Person(splitId[0],splitId[1],1);
        }

        else if(splitId.length == 3)
        {
            return new Person(splitId[0],splitId[1],Integer.parseInt(splitId[2]));
        }
        throw new IllegalArgumentException("Illegal argument: " + command);
    }

    private Person createIncomingPerson(String command)
    {
        String personKey = command
                .replace("ADD PERSON(","")
                .replace(")","");
        String[] split = personKey
                .split("_");

        if(split.length == 2)
        {
            return new Person(split[0], split[1], queueOfPeople.getAndIncrementCounter(personKey));
        }

        else
        {
            throw new IllegalArgumentException("Illegal argument: " + command);
        }
    }

    private void processPerson(String command)
    {
        System.out.println(command);
        queueOfPeople.enter();
    }
}
