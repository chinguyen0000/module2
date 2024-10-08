package ss16_IO_text_file.bai_tap;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    private static final String PATH = "src/ss16_IO_text_file/bai_tap/";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name that needs copy: ");
        String fileName = sc.nextLine();
        try {
            File file = new File(PATH+fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String temp = null;
            String readString = "";
            while ((temp = reader.readLine()) != null) {
                //System.out.println(temp);
                readString += temp + "\n";
            }
            reader.close();
            
            File destinationFile = null;
            do {
                System.out.println("Enter the destination file name: ");
                String destinationFileName = sc.nextLine();
                destinationFile = new File(PATH+destinationFileName);
            } while (destinationFile.exists());

            FileWriter fileWriter = new FileWriter(destinationFile);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(readString);
            writer.close();

            System.out.println("The number of characters is "+readString.length());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
