package org.example.multitheading.thread_creating.sync_both_methods;

public class ChannelTest {
    public static void main(String[] args) {
        Channel channel = new Channel();
        Thread mobileThread = new Thread(new Mobile(channel));
        Thread skypeThread = new Thread(new Skype(channel));
        Thread whatsAppThread = new Thread(new WhatsApp(channel));

        mobileThread.start();
        skypeThread.start();
        whatsAppThread.start();
    }
}
