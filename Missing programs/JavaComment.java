import java.io.*;
class JavaComment {

    public static void main(String a[]) {
        File file = new File("test.java");
        String fileString = readLineByLine(file);
        fileString = fileString.replaceAll(
                "(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)", "");
        try {
            File file1 = new File("test1.java");
            FileWriter fileWriter = new FileWriter(file1);
            fileWriter.write(fileString);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readLineByLine(File file) {
        String textFile = "";
        FileInputStream fstream;
        try {
            fstream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                textFile = textFile + replaceComments(strLine) + "\n";

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return textFile;
    }

    private static String replaceComments(String strLine) {

        if (strLine.startsWith("//")) {
            return "";
        } else if (strLine.contains("//")) {
            if (strLine.contains("\"")) {
                int lastIndex = strLine.lastIndexOf("\"");
                int lastIndexComment = strLine.lastIndexOf("//");
                if (lastIndexComment > lastIndex) { // ( "" // )
                    strLine = strLine.substring(0, lastIndexComment);
                }
            } else {
                int index = strLine.lastIndexOf("//");
                strLine = strLine.substring(0, index);
            }
        }

        return strLine;
    }

}