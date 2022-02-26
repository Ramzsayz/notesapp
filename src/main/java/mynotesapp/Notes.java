package mynotesapp;

import java.util.Comparator;


public class Notes {
	protected int id;
	protected String title;
	protected String note;
	
	public Notes(int id, String title, String note) {
		super();
		this.id = id;
		this.title = title;
		this.note = note;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public static Comparator<Notes> titleComparator = new Comparator<Notes>() { //this is titleComparator
		@Override 
		public int compare(Notes n1, Notes n2) {
			return (int) (n1.getTitle().compareTo(n2.getTitle())); 
		}
	};
	
	public static Comparator<Notes> noteComparator = new Comparator<Notes>() { //this is noteComparator
		@Override 
		public int compare(Notes n1, Notes n2) {
			return (int) (n1.getNote().compareTo(n2.getNote())); 
		}
	};
}
