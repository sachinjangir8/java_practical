import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandling {
    public static void main(String [] args) {
        System.out.println("handling the file and saving the data in the file");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        System.out.println("enter your name");
        String name =sc.nextLine();
        System.out.print("Enter your age: ");
        String age = sc.nextLine();
        System.out.println("enter your address");
        String address = sc.nextLine();

        try{
            FileWriter writer = new FileWriter(fileName);
            writer.write(name + "\n");
            writer.write(age + "\n");
            writer.write(address + "\n");
            writer.close();
            System.out.println("Data has been saved to the file: " + fileName);
        }catch(IOException e){
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("now the number of vowels in file is");
        
    }
}
