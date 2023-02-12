import java.util.Objects;

public class Person
{
    private final String name;
    private final String surname;
    private final Integer counter;
    private final String id;

    public Person(String name, String surname, Integer counter)
    {
        this.name = name;
        this.surname = surname;
        this.counter = counter;
        this.id = generateId();

    }

    private String generateId()
    {
        return String.format("%s_%s_%s", this.name, this.surname, this.counter);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Person person = (Person) o;

        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode()
    {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString()
    {
        return id;
    }
}
