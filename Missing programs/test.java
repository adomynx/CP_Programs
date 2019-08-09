import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
/*                                           */
public class CSVFile {

    public static void main(String... args) {
        List<List<String>> records = new ArrayList<>();
        String COMMA_DELIMITER=",";
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(COMMA_DELIMITER);
            records.add(Arrays.asList(values));
            for (int i=0;i<values.length;i++ ) {
                System.out.println(values[i]);
                
            }
            }
        }
        catch(Exception i){
        }
    }
}
/*                                         */