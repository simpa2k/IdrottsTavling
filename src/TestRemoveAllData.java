import static org.junit.Assert.*;

import org.junit.Test;

public class TestRemoveAllData {

	IdrottsTavling idrottsTävling = new IdrottsTavling();
	
	@Test
	public void testRemoveAllData() {
		
		idrottsTävling.addParticipant("Ada", "Lovelace", "Computing");
		idrottsTävling.addEvent("Long Jump", 3, true);
		idrottsTävling.addResult(idrottsTävling.getParticipant(100), idrottsTävling.getEvent("Long Jump"), 6.7);
		
		assertEquals("Ada Lovelace", idrottsTävling.getParticipant(100).getFullName());
		assertEquals(1, idrottsTävling.getTeams().size());
		assertEquals(1, idrottsTävling.getEvents().size());
		assertEquals(101, idrottsTävling.getParticipantCounter());
		
		idrottsTävling.reinitialize();
		
		assertEquals(null, idrottsTävling.getParticipant(100));
		assertEquals(0, idrottsTävling.getTeams().size());
		assertEquals(0, idrottsTävling.getEvents().size());
		assertEquals(100, idrottsTävling.getParticipantCounter());
		
	}

}
