package customer;

public class Main {
    public static void main(String[] args) {

        OldDatabase oldDatabase = new InMemoryOldDatabase();

        NewDatabase newDatabase = new DatabaseAdapter(oldDatabase);

        newDatabase.openConnection("old-db-url");
        newDatabase.saveData("users", "{name: 'John', age: 30}");
        String result = newDatabase.fetchData("users", "name = 'John'");
        System.out.println("Fetched data: " + result);
        newDatabase.closeConnection();
    }
}

