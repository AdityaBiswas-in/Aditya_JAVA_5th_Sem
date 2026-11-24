import java.util.Random;

class Notification {
    protected String message;

    public Notification(String message) {
        this.message = message;
    }

    public void showNotification() {
        System.out.println("Notification from parent: " + message);
    }
}

class ChildNotification extends Notification {
    public ChildNotification(String message) {
        super(message);
    }
}

public class Notificatio {
    public static void main(String[] args) {
        String[] apps = {
            "Facebook: You have a new message from Ali.",
            "Instagram: Someone liked your photo.",
            "WhatsApp: A new message arrived.",
            "Telegram: You received a new update.",
            "Twitter: Your post got a new mention."
        };

        Random random = new Random();
        int index = random.nextInt(apps.length);

        ChildNotification obj = new ChildNotification(apps[index]);
        obj.showNotification();
    }
}

