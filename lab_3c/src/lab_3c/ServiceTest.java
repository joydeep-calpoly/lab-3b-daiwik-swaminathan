package lab_3c;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class ServiceTest {

    private Service service;
    private Database mockDatabase;

    @Test
    public void testGetDatabaseID() {
    	// Mock the Database class
        mockDatabase = mock(Database.class);

        // Inject the mockDatabase into the Service class
        service = new Service(mockDatabase);
        
        // Say what should be returned for the database method
        when(mockDatabase.getUniqueId()).thenReturn(10);

        // Call the method to test from Service class
        String result = service.getDatabaseID();

        // Check
        assertEquals("Using database with id: 10", result);
    }
}
