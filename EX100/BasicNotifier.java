class BasicNotifier implements Notifier {
    public void send(String message) {
        System.out.println("In-App: " + message);
    }
}
