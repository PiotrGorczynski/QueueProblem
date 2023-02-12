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
        String personKey = command
                .replace("ADD PERSON(","")
                .replace(")","");
        String[] split = personKey
                .split("_");

        if(split.length == 2)
        {
            String name = split[0];
            String surname = split[1];

            Integer counter = queueOfPeople.getAndIncrementCounter(personKey);

            queueOfPeople.welcome(new Person(name, surname, counter));
        }
    }


    private void leavePerson(String command)
    {

    }

    private void processPerson(String command)
    {

    }
}
