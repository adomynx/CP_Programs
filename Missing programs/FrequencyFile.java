import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 
  
public class FrequencyFile{ 
  public static void main(String[] args) throws FileNotFoundException { 
    /*File file = new File("file1.txt"); 
    Scanner sc = new Scanner(file); 
    sc.useDelimiter(" "); */
    int maxLength=0;
    int maxFreq=0;
    String max;
    Scanner sc2 = null;
    try {
        sc2 = new Scanner(new File("file1.txt"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();  
    }
    while (sc2.hasNextLine()) {
            Scanner s2 = new Scanner(sc2.nextLine());
        while (s2.hasNext()) {
            String s = s2.next();
            if(s.length()>maxLength && max==s){
              maxLength=s.length();
              max=s;
              maxFreq++;
            }
        }
    }

 } 
} 