package de.czempin.aesdc.onlinestatus;

public interface UserActivityService {
    /**
     * Checks whether the given user is active.
     *
     * @param userId The ID of the user to check.
     * @return True if the user is active, false otherwise.
     */
    boolean isUserActive(String userId);
}
