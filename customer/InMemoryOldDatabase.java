package customer;


public class InMemoryOldDatabase implements OldDatabase {

    private boolean connected = false;

    @Override
    public void connect(String url) {
        connected = true;
    }

    @Override
    public void insert(String tableName, String jsonData) {
        // Simple in-memory operation
    }

    @Override
    public String select(String tableName, String queryFilter) {
        return "{\"name\":\"John Doe\"}"; // Returning a fixed value for testing
    }

    @Override
    public void disconnect() {
        connected = false;
    }

    public boolean isConnected() {
        return connected;
    }
}
