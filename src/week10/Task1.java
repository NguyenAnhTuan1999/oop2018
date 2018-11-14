package week10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static List<String> getAllFunctions(File path) {
        ArrayList<String> functions = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            StringBuilder function = new StringBuilder();
            int i = 0;
            while ((line = br.readLine()) != null) {
                char[] chars = line.toCharArray();
                if (chars.length > 4){
                    if (chars[3] == (char) 32) {
                        if (chars[4] != (char) 125) {
                            function.append(line).append("\n");
                        }
                        else if (chars.length > 6) {
                            if (chars[6] == (char) 125) {
                                function.append(line);
                                functions.add(i, function.toString());
                                function = new StringBuilder();
                                i++;
                            }
                        }
                        else {
                            function.append(line);
                            functions.add(i, function.toString());
                            function = new StringBuilder();
//                            System.out.println(functions.get(i));
//                            System.out.println("********************************************");
                            i++;
                        }
                    }
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return functions;
    }

    public String findFunctionByName(String name) {
        List<String> functions = getAllFunctions(new File(".\\src\\week9\\Utils.java"));
        String namePart = name.substring(0, name.indexOf("("));
        for (int i = 0; i < functions.size(); i++) {
            if (functions.get(i).contains(namePart)) {
                return functions.get(i).substring(4, functions.get(i).indexOf("{"));
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<String> functions = getAllFunctions(new File(".\\src\\week9\\Utils.java"));
        String function = new Task1().findFunctionByName("writeContentToTheEndOfFile(String)");
        System.out.println(function);
    }
}
