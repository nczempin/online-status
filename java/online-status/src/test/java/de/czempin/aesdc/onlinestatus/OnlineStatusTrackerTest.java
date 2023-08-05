package de.czempin.aesdc.onlinestatus;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class OnlineStatusTrackerTest {

    @Test
    public void testIsOnline() {
        // Arrange
        UserActivityService mockUserActivityService = mock(UserActivityService.class);
        when(mockUserActivityService.isUserActive(1234)).thenReturn(true);
        when(mockUserActivityService.isUserActive(5678)).thenReturn(false);
        var onlineStatusTracker = new OnlineStatusTracker();
        onlineStatusTracker.setUserActivityService(mockUserActivityService);

        // Act & Assert
        assertTrue("user 1234 should be online", onlineStatusTracker.isOnline(1234));
        assertFalse("user 5678 should be offline", onlineStatusTracker.isOnline(5678));
    }

}
