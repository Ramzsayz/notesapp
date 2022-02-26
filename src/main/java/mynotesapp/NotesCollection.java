package mynotesapp;
import java.util.*;

//import com.sddevops.junit_maven.eclipse.Song;
// import mynotesapp.Notes;

//import com.sddevops.junit_maven.eclipse.Song;

public class NotesCollection {
	private ArrayList<Notes> notes = new ArrayList<>(); //ArrayList<Notes> refers to part 1's Notes.java
    private int capacity;
    
    public NotesCollection(){
    	this.capacity = 20;
    }
    public NotesCollection(int capacity) {
        this.capacity = capacity;
    }

    public List<Notes> getNotes() {
        return notes;
    }

    public void addNote(Notes note) {
    	if(notes.size() != capacity) {
    		notes.add(note);
    	}
    }
    
    public ArrayList<Notes> sortNotesByTitle() {         
        Collections.sort(notes, Notes.titleComparator);         
        return notes;     
    } 
    
    public ArrayList<Notes> sortNotesByNote() {         
        Collections.sort(notes, Notes.noteComparator);         
        return notes;     
    } 
    
    public Notes findNoteByTitle(String title) {
    	for (Notes n : notes) { 	//store Notes in 'n' variable	      
            if(n.getTitle().equals(title)) return n;
       }
    	return null;
    }

}
