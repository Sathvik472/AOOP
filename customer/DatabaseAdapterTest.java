package customer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DatabaseAdapterTest {

    private InMemoryOldDatabase oldDatabase;
    private DatabaseAdapter databaseAdapter;

    void setUp() {
        oldDatabase = new InMemoryOldDatabase();
        databaseAdapter = new DatabaseAdapter(oldDatabase);
    }

    void testOpenConnection() {
        String url = "jdbc:example";
        databaseAdapter.openConnection(url);
        assertTrue(oldDatabase.isConnected(), "Database should be connected");
    }
        
    void testSaveData() {
        String tableName = "users";
        String jsonData = "{\"name\":\"John Doe\"}";
        databaseAdapter.saveData(tableName, jsonData);
        // In this simple example, we are not verifying the actual insert operation
        // because InMemoryOldDatabase does not store data. You might want to add
        // more logic if necessary.
    }

    void testFetchData() {
        String tableName = "users";
        String queryFilter = "name='John Doe'";
        String expectedData = "{\"name\":\"John Doe\"}";
        
        String result = databaseAdapter.fetchData(tableName, queryFilter);
        assertEquals(expectedData, result, "Fetched data should match expected data");
    }
    void testCloseConnection() {
        databaseAdapter.closeConnection();
        assertFalse(oldDatabase.isConnected(), "Database should be disconnected");
    }
}
