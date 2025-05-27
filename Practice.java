// import java.io.*;

//  class Example {
//     public static void main(String[] args) {
//         String filePath = "/Users/neerajreddy/Desktop/student.csv"; // Make sure this file exists in your project directory

//         try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//             String line;
//             boolean header = true;

//             while ((line = br.readLine()) != null) {
//                 // Skip header row
//                 if (header) {
//                     header = false;
//                     continue;
//                 }

//                 // Split the line by comma
//                 String[] values = line.split(",");

                
//                 int age = Integer.parseInt(values[2]);
//                 int marks = Integer.parseInt(values[3]);
//                 if (age == 15 && marks > 50) {
//                     System.out.println("Matched Student:");
//                     System.out.println("ID: " + values[0] + ", Name: " + values[1] +
//                                        ", Age: " + values[2] + ", Marks: " + values[3]);
//                 }
//             }

        
//         } catch (IOException e) {
//             System.out.println("Error reading the file!");
        
//         }
//     }
// }

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();
        
        // fruits.add("Mango");
        // fruits.add("Apple");
        // fruits.add("Banana");
        // fruits.add("Orange");
        // fruits.add("Pineapple");
        System.out.println("Enter 5 name of fruit");
        for(int i = 0; i<5;i++)
        {
            fruits.add(sc.nextLine());
            
        }
        
        
        
         System.out.println(fruits);
        
        System.out.println("The Reverse order is: ");
        for (int j =fruits.size()-1 ; j>=0;j--) {
           System.out.println(fruits.get(j));
            
        }
        
        

        

       



            
        
    }
}




























