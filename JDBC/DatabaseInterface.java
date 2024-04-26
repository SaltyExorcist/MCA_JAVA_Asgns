import java.sql.*;
import java.util.Scanner;

public class DatabaseInterface {
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

    static final String USER = "system";
    static final String PASS = "system";

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            int choice;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Create a table");
                System.out.println("2. Insert records");
                System.out.println("3. Display all records");
                System.out.println("4. Update a record");
                System.out.println("5. Delete a record");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        createTable(stmt);
                        break;
                    case 2:
                        insertRecords(stmt);
                        break;
                    case 3:
                        displayRecords(stmt);
                        break;
                    case 4:
                        updateRecord(stmt);
                        break;
                    case 5:
                        deleteRecord(stmt);
                        break;
                    case 6:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 6);

            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    static void createTable(Statement stmt) throws SQLException {
        System.out.println("Creating a new table...");
        System.out.print("Enter table name: ");
        String tableName = scanner.next();
        System.out.print("Enter number of columns: ");
        int numColumns = scanner.nextInt();

        String createTableQuery = "CREATE TABLE " + tableName + " (";
        for (int i = 0; i < numColumns; i++) {
            System.out.print("Enter column name: ");
            String columnName = scanner.next();
            System.out.print("Enter column type: ");
            String columnType = scanner.next();
            System.out.print("Enter column size: ");
            int columnSize = scanner.nextInt();

            createTableQuery += columnName + " " + columnType + "(" + columnSize + ")";
            if (i != numColumns - 1)
                createTableQuery += ",";
        }
        createTableQuery += ")";

        stmt.executeUpdate(createTableQuery);
        System.out.println("Table created successfully.");
    }

    static void insertRecords(Statement stmt) throws SQLException {
        System.out.println("Inserting records into the table...");
        System.out.print("Enter table name: ");
        String tableName = scanner.next();

        ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName);
        ResultSetMetaData rsmd = rs.getMetaData();
        int numColumns = rsmd.getColumnCount();

        for (int i = 1; i <= numColumns; i++) {
            System.out.print("Enter value for column " + rsmd.getColumnName(i) + ": ");
            String value = scanner.next();
            stmt.executeUpdate("INSERT INTO " + tableName + " (" + rsmd.getColumnName(i) + ") VALUES ('" + value + "')");
        }
        System.out.println("Records inserted successfully.");
    }

    static void displayRecords(Statement stmt) throws SQLException {
        System.out.println("Displaying all records from the table...");
        System.out.print("Enter table name: ");
        String tableName = scanner.next();

        ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName);
        ResultSetMetaData rsmd = rs.getMetaData();
        int numColumns = rsmd.getColumnCount();

        while (rs.next()) {
            for (int i = 1; i <= numColumns; i++) {
                System.out.print(rsmd.getColumnName(i) + ": " + rs.getString(i) + "\t");
            }
            System.out.println();
        }
    }

    static void updateRecord(Statement stmt) throws SQLException {
        System.out.println("Updating a record...");
        System.out.print("Enter table name: ");
        String tableName = scanner.next();
        System.out.print("Enter column name to search by: ");
        String columnName = scanner.next();
        System.out.print("Enter value to search by: ");
        String searchValue = scanner.next();
        System.out.print("Enter column name to update: ");
        String updateColumn = scanner.next();
        System.out.print("Enter new value: ");
        String newValue = scanner.next();

        String updateQuery = "UPDATE " + tableName + " SET " + updateColumn + "='" + newValue + "' WHERE " + columnName + "='" + searchValue + "'";
        stmt.executeUpdate(updateQuery);
        System.out.println("Record updated successfully.");
    }

    static void deleteRecord(Statement stmt) throws SQLException {
        System.out.println("Deleting a record...");
        System.out.print("Enter table name: ");
        String tableName = scanner.next();
        System.out.print("Enter column name to search by: ");
        String columnName = scanner.next();
        System.out.print("Enter value to search by: ");
        String searchValue = scanner.next();

        String deleteQuery = "DELETE FROM " + tableName + " WHERE " + columnName + "='" + searchValue + "'";
        stmt.executeUpdate(deleteQuery);
        System.out.println("Record deleted successfully.");
    }
}
