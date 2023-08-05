package de.czempin.aesdc.onlinestatus;

public class UserActivityServiceImpl implements UserActivityService {
    @Override
    public boolean isUserActive(long userId) {
        return false;
    }

    @Override
    public void markUserAsActive(long userId) {
    }
}
