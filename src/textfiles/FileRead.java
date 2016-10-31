package textfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileRead {

    public int countLines(File file) {
        int lines = 1;
        int letter;
        int previousLetter = 0;
        try {
            FileReader fr = new FileReader(file);
            while ((letter = fr.read()) != -1) {
                if (previousLetter == 13 && letter == 10) {
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
    
    public int countWords(File file){
        int word = 0;
        try {
            BufferedReader f = new BufferedReader(new FileReader(file));
            String line = f.readLine();
            while(line != null){
                word++;
                for(int i = 0; i < line.length() - 1; i++){
                    if((line.charAt(i) == ' ' || line.charAt(i) == '\t') || line.charAt(i) == '\n'){
                        word++;
                    }
                }
                line = f.readLine();  
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
      return word;  
    }

}
