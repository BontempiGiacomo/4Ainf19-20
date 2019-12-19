package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 23/11/2019.
 */
public class FileException extends Exception {
    private String matter="";

    public FileException(String matter){
        this.matter = matter;
    }

    public String getMatter() {
        return this.matter;
    }
}
