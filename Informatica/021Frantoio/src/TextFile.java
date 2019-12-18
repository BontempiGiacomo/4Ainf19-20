package it.itis.cuneo;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

/**
 * Created by inf.bontempig3107 on 23/11/2019.
 */
public class TextFile {

    private char mode;
    private BufferedWriter out;
    private BufferedReader in;

    public TextFile(String filename, char mode)throws IOException{
        this.mode = 'R';
        if(mode == 'W' || mode == 'w'){
            this.mode = 'w';
            out = new BufferedWriter(new FileWriter(filename));
        }
        else
            in = new BufferedReader(new FileReader(filename));
    }

    public void toFile(String line)throws FileException, IOException{
        if(this.mode == 'R')throw new FileException("Read-only file!");
        out.write(line);
        out.newLine();
    }

    public String fromFile() throws FileException, IOException{
        String tmp;
        if(this.mode == 'W') throw new FileException("Write-only file!");
        tmp = in.readLine();
        if(tmp == null) throw new FileException("End of file!");
        return tmp;
    }

    public void closeFile() throws IOException{
        if(this.mode == 'R')
            in.close();
        else
            out.close();
    }

    public static void main(String[] args) throws IOException{
        TextFile out = new TextFile("file.txt", 'W');
        try{
            out.toFile("Riga 1");
            out.toFile("Riga 2");
            out.toFile("Riga 3");
        }
        catch (FileException exception){
            System.out.println(exception.getMatter());
        }
        out.closeFile();

        TextFile in = new TextFile("file.txt", 'R');
        String line;
        try{
            while (true) {
                line = in.fromFile();
                System.out.println(line);
            }
        }
        catch (FileException exception){
            System.out.println(exception.getMatter());
        }
        out.closeFile();
    }
}
