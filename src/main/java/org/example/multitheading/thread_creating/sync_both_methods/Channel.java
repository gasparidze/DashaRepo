package org.example.multitheading.thread_creating.sync_both_methods;

public class Channel {
    private static final Object LOCK = new Object();

    public void mobileCall() {
        synchronized (LOCK) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }

    public void skypeCall() {
        synchronized (LOCK) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }

    public void whatsAppCall() {
        synchronized (LOCK) {
            System.out.println("WhatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WhatsApp call ends");
        }
    }
}

class Mobile implements Runnable{
    private final Channel channel;

    public Mobile(Channel channel){
        this.channel = channel;
    }

    @Override
    public void run() {
        channel.mobileCall();
    }
}

class Skype implements Runnable{
    private final Channel channel;

    public Skype(Channel channel){
        this.channel = channel;
    }

    @Override
    public void run() {
        channel.skypeCall();
    }
}

class WhatsApp implements Runnable{
    private final Channel channel;

    public WhatsApp(Channel channel){
        this.channel = channel;
    }

    @Override
    public void run() {
        channel.whatsAppCall();
    }
}
