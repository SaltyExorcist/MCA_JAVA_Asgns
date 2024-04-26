import java.io.*;
public class FileOperations {
    private static final String FILE_NAME = "student.txt";

    public static void writeRecord(FileStudent student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(student.getRollNo() + "," + student.getName() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readRecords() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int rollNo = Integer.parseInt(parts[0]);
                String name = parts[1];
                FileStudent student = new FileStudent(rollNo, name);
                System.out.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void searchRecord(int rollNo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int rNo = Integer.parseInt(parts[0]);
                if (rNo == rollNo) {
                    found = true;
                    String name = parts[1];
                    System.out.println("Record Found: Roll No - " + rNo + ", Name - " + name);
                    break;
                }
            }
            if (!found) {
                System.out.println("Record not found for Roll No: " + rollNo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        // Writing records to the file
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter roll no of the student1:");
        int roll1=Integer.parseInt(br.readLine());
        System.out.println("Enter name of the student1:");
        String name1=br.readLine();

        System.out.println("Enter roll no of the student2:");
        int roll2=Integer.parseInt(br.readLine());
        System.out.println("Enter name of the student2:");
        String name2=br.readLine();

        System.out.println("Enter roll no of the student3:");
        int roll3=Integer.parseInt(br.readLine());
        System.out.println("Enter name of the student3:");
        String name3=br.readLine();

        writeRecord(new FileStudent(roll1, name1));
        writeRecord(new FileStudent(roll2, name2));
        writeRecord(new FileStudent(roll3, name3));

        // Reading all records from the file
        System.out.println("All Records:");
        readRecords();

        // Searching for a record
        System.out.println("Enter roll no of the student to be searched:");
        int rollsearch=Integer.parseInt(br.readLine());
        System.out.println("\nSearching Record for Roll No: "+rollsearch);
        searchRecord(rollsearch);
    }
}