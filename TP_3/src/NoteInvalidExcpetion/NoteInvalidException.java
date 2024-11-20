package NoteInvalidExcpetion;

public class NoteInvalidException extends Exception {
    public NoteInvalidException(int note){
        super("Exception de type NoteInvalideException. Note invalide : "+note);
    }
}
