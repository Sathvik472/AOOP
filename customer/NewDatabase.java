package customer;

public interface NewDatabase {
 void openConnection(String url);
 void saveData(String tableName, String jsonData);
 String fetchData(String tableName, String queryFilter);
 void closeConnection();
}

