package de.czempin.aesdc.onlinestatus;

public class OnlineStatusTracker {
    private UserActivityService userActivityService;

    public boolean isOnline(String userID) {
        return userActivityService.isUserActive(userID);
    }

    public void setUserActivityService(UserActivityService userActivityService) {
        this.userActivityService = userActivityService;
    }
}
