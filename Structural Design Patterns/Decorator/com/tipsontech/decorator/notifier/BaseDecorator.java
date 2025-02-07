package com.tipsontech.decorator.notifier;

public class BaseDecorator implements Notifier {
    protected Notifier wrappedNotifier;

    public BaseDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
    }
}

