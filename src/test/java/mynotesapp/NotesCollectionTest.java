/**
 * 
 */
package mynotesapp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author ssrms
 *
 */
class NotesCollectionTest {

	private NotesCollection nc;
	private Notes n1;
	private Notes n2;
	private Notes n3;
	private Notes n4;
	private int NOTES_COLLECTION_SIZE = 4;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		nc = new NotesCollection();
		n1 = new Notes(1, "hi", "bye");
		n2 = new Notes(2, "biryani", "with lots of curry");
		n3 = new Notes(3, "JUnit", "working on JUnit");
		n4 = new Notes(4, "testing", "123456");
		
		nc.addNote(n1);
		nc.addNote(n2);
		nc.addNote(n3);
		nc.addNote(n4);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	@Test
	void testGetNotes() {
		// fail("Not yet implemented");
		// Act
		List<Notes> testNc = nc.getNotes(); //testNc stands for test Notes collection

		// assert
		// Assert that notes collection is not empty aft invoking getSongs() function
		assertTrue(!testNc.isEmpty());

		assertEquals(testNc.size(), NOTES_COLLECTION_SIZE);
	}
	
	@Test
	void testAddNote() {
		assertEquals(true,true);
	}

	@Test
	void testFindNoteByTitle() {
		assertEquals(true, true);
		// fail("Not yet implemented");
	}
}
