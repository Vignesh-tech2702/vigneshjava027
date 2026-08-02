import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Source File Path: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination File Path: ");
        String destination = sc.nextLine();

        try {
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully.");
            System.out.println("Destination File Created: " + destination);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}