import java.io.FileReader;
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
        try {
            FileReader reader=new FileReader(fileName);
            int vowelCount=0;
            int c;
            while((c=reader.read())!=-1){
                char ch=(char)c;
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    vowelCount++;
                }
            }
            System.out.println(vowelCount);
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
