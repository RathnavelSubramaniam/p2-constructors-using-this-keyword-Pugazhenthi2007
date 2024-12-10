class Person
{
    String firstName;
    String lastName;
    int age;
    // Default constructor
     Person()
    {
        firstName= "";
        lastName= "";
        age=0;
    }
    Person(String firstName,String lastName,int age)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    // Method to get full name
     String getFullName()
     {
        return firstName + "" + lastName;
     }
}
class Practical1
{
    public static void main(String[] args)
    {
        // Create two Person objects
        Person person1 =new Person("John", "Doe", 30);
        Person person2 =new Person("Alice", "Smith",25);
        System.out.println("Person1:" + person1.getFullName());
        System.out.println("Person2:" + person2.getFullName());
        double averageAge=(person1.age+ person2.age)/2.0;
        System.out.println("Average age: " + averageAge);
    }
}
