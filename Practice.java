import java.io.*;

 class Example {
    public static void main(String[] args) {
        String filePath = "/Users/neerajreddy/Desktop/student.csv"; // Make sure this file exists in your project directory

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean header = true;

            while ((line = br.readLine()) != null) {
                // Skip header row
                if (header) {
                    header = false;
                    continue;
                }

                // Split the line by comma
                String[] values = line.split(",");

                
                int age = Integer.parseInt(values[2]);
                int marks = Integer.parseInt(values[3]);
                if (age == 15 && marks > 50) {
                    System.out.println("Matched Student:");
                    System.out.println("ID: " + values[0] + ", Name: " + values[1] +
                                       ", Age: " + values[2] + ", Marks: " + values[3]);
                }
            }

        
        } catch (IOException e) {
            System.out.println("Error reading the file!");
        
        }
    }
}










