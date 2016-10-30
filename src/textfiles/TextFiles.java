
package textfiles;

import java.io.File;

public class TextFiles {

    
    public static void main(String[] args) {
          
       FileRead fr = new FileRead();
       System.out.println(fr.countLines(new File("plik.txt")));
     
        
        
    }
    
}
