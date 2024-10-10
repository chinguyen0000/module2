package ss17_IO_binary_file.bai_tap.copy_binary_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyBinaryFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên file nguồn:");
        String source = sc.nextLine();
        System.out.println("Nhập tên file đích: ");
        String target = sc.nextLine();
        copyFile(source, target);
    }

    public static void copyFile(String source, String dest) {
        try {
            FileInputStream input = new FileInputStream("src/ss17_IO_binary_file/bai_tap/copy_binary_file/" + source);
            FileOutputStream output = new FileOutputStream("src/ss17_IO_binary_file/bai_tap/copy_binary_file/" + dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = input.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            input.close();
            output.close();
            System.out.println("Copy file successfully");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
