package de.czempin.aesdc.onlinestatus;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class OnlineStatusTrackerTest {
    private UserActivityService mockUserActivityService = mock(UserActivityService.class);

    @Test
    public void testIsOnline() {
        // Arrange
        when(mockUserActivityService.isUserActive(1234)).thenReturn(true);
        when(mockUserActivityService.isUserActive(5678)).thenReturn(false);
        var onlineStatusTracker = new OnlineStatusTracker();
        onlineStatusTracker.setUserActivityService(mockUserActivityService);

        // Act & Assert
        assertTrue("user 1234 should be online", onlineStatusTracker.isOnline(1234));
        assertFalse("user 5678 should be offline", onlineStatusTracker.isOnline(5678));
    }

    @Test
    public void testMarkUserAsActive() {
        long userId = 12345678L;


        // Call the service method
        mockUserActivityService.markUserAsActive(userId);

        // Verify the mocked method was called
        verify(mockUserActivityService, times(1)).markUserAsActive(userId);
    }

}
