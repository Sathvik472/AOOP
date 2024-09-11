package customer;

public interface OldDatabase {
 void connect(String connectionString);
 void insert(String table, String data);
 String select(String table, String query);
 void disconnect();
}

