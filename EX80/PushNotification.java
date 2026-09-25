final class PushNotification extends Notification {
    private String deviceId;
    
    public PushNotification(String message, String deviceId) {
        super(message);
        this.deviceId = deviceId;
    }
    
    @Override
    String deliver() {
        return "Sending push to device " + deviceId + ": " + message;
    }
}
