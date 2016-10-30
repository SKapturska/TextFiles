package textfiles;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    
  public int countLines(File file){
        int lines = 0;
        int letter;
        int previousLetter = 0;
        try { 
            FileReader fr = new FileReader(file);
            while((letter = fr.read()) != -1){
                if(previousLetter == 13 && letter == 10){
                    lines++;
                }
                previousLetter = letter;
            }
            
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return lines;
    }



    
   

    
}
