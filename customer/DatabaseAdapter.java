package customer;

public class DatabaseAdapter implements NewDatabase {

 private final OldDatabase oldDatabase;

 public DatabaseAdapter(OldDatabase oldDatabase) {
     this.oldDatabase = oldDatabase;
 }

 @Override
 public void openConnection(String url) {
     oldDatabase.connect(url);
 }

 @Override
 public void saveData(String tableName, String jsonData) {
     oldDatabase.insert(tableName, jsonData);
 }

 @Override
 public String fetchData(String tableName, String queryFilter) {
     return oldDatabase.select(tableName, queryFilter);
 }

 @Override
 public void closeConnection() {
     oldDatabase.disconnect();
 }
}
