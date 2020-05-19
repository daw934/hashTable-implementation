public class Main {

    public static final String FIRST = "first";
    public static final String SECOND = "second";
    public static final String THIRD = "third";
    public static final String NOT_EXISTS = "not_exists";
    public static final String DUPLICATE_PERSON = "duplicatePerson";

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        Person firstPerson = new Person("First Person");
        addObjectToHashTable(hashTable, firstPerson);

        logPersonSerach(SECOND);
        hashTable.get(SECOND);

        logPersonSerach(DUPLICATE_PERSON);
        hashTable.get(DUPLICATE_PERSON);

        logPersonSerach(NOT_EXISTS);
        hashTable.get(NOT_EXISTS);
    }

    private static void logPersonSerach(String key) {
        System.out.println("\nLooking for the Person using key: " + key);
    }

    private static void addObjectToHashTable(HashTable hashTable, Person firstPerson) {
        System.out.println("######## HashTable initialisation ########");
        System.out.println("Adding the person: " + firstPerson.toString() + " to the hashTable");
        hashTable.put(FIRST, firstPerson);
        System.out.println("The person was added\n");
        Person secondPerson = new Person("Second Person");
        System.out.println("Adding the person: " + secondPerson.toString() + " to the hashTable");
        hashTable.put(SECOND, secondPerson);
        System.out.println("The person was added\n");
        Person thirdPerson = new Person("Third Person");
        System.out.println("Adding the person: " + thirdPerson.toString() + " to the hashTable");
        hashTable.put(THIRD, thirdPerson);
        System.out.println("The person was added\n");
        Person nextPerson = new Person("Duplicate Person");
        System.out.println("Adding the person: " + nextPerson.toString() + " to the hashTable");
        hashTable.put(DUPLICATE_PERSON, nextPerson);
        System.out.println("The person was added");
        System.out.println("######## The end of initialisation ########");
    }
}
