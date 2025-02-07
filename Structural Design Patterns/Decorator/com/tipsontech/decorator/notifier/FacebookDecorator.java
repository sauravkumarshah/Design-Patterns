package com.tipsontech.decorator.notifier;

public class FacebookDecorator extends BaseDecorator {
    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending Facebook Message: " + message);
    }
}
