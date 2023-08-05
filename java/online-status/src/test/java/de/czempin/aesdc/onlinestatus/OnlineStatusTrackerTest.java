package de.czempin.aesdc.onlinestatus;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class OnlineStatusTrackerTest {

    @Test
    public void testIsOnline() {
        // Arrange
        UserActivityService mockUserActivityService = mock(UserActivityService.class);
        when(mockUserActivityService.isUserActive("user1")).thenReturn(true);
        when(mockUserActivityService.isUserActive("user2")).thenReturn(false);
        var onlineStatusTracker = new OnlineStatusTracker();
        onlineStatusTracker.setUserActivityService(mockUserActivityService);

        // Act & Assert
        assertTrue("user1 should be online", onlineStatusTracker.isOnline("user1"));
        assertFalse("user2 should be offline", onlineStatusTracker.isOnline("user2"));
    }

}
