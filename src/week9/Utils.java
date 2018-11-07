package week9;

import java.io.*;
import java.util.Scanner;

public class Utils {

    public static String readContentFromFile(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            StringBuilder data = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                data.append(line);
                data.append("\n");
            }

            br.close();
            return data.toString();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }

    public static void writeContentToFile(String path) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(new File(path), false));

            System.out.println("Nhap moi dung muon ghi vao file:");
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();
            pw.print(data);

            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void writeContentToTheEndOfFile(String path) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(new File(path), true));

            System.out.println("Nhap moi dung muon ghi vao cuoi file:");
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();
            pw.println(data);
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static File findFileByName(String folderPath, String fileName) {
        String filePath = folderPath + "\\" + fileName;

        File file = new File(filePath);
        if (file.exists()) {
            return file;
        }
        else {
            System.out.println("Khong tim thay file!");
        }
        return null;
    }

    public static void main(String[] args) {

//        writeContentToFile("C:\\Users\\cbg2\\FolderTest\\text.txt");
//        writeContentToTheEndOfFile("C:\\Users\\cbg2\\FolderTest\\text.txt");
//        System.out.println(readContentFromFile("C:\\Users\\cbg2\\FolderTest\\text.txt"));
        System.out.println(findFileByName("C:\\Users\\cbg2\\FolderTest", "text.txt"));
    }
}
