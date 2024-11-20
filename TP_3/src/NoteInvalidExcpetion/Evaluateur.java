package NoteInvalidExcpetion;

public class Evaluateur {
    public Evaluateur(){}

    public void verifierNote(int note) throws NoteInvalidException {
        if( note < 0 || note > 20 ){
            throw new NoteInvalidException(note);
        }
    }

    public static void main(String args[]){
        try{
            Evaluateur e = new Evaluateur();

            System.out.println("Evaluer la note 15");
            e.verifierNote(15);
            System.out.println("Note évalué\n");

            System.out.println("Evaluer la note 25");
            e.verifierNote(25);
            System.out.println("Note évalué\n");
        } catch (NoteInvalidException e){
            System.out.println(e.getMessage());
        }
    }
}
