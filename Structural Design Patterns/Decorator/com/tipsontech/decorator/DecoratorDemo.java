package com.tipsontech.decorator;

import com.tipsontech.decorator.notifier.EmailNotifier;
import com.tipsontech.decorator.notifier.FacebookDecorator;
import com.tipsontech.decorator.notifier.Notifier;
import com.tipsontech.decorator.notifier.SMSDecorator;
import com.tipsontech.decorator.notifier.SlackDecorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        // Base notifier (Email Only)
        Notifier emailNotifier = new EmailNotifier();
        
        System.out.println("Basic Email Notification:");
        emailNotifier.send("System Update Available!");

        System.out.println("\nEmail + SMS Notification:");
        Notifier emailAndSMS = new SMSDecorator(emailNotifier);
        emailAndSMS.send("System Update Available!");

        System.out.println("\nEmail + SMS + Facebook Notification:");
        Notifier emailSMSSlack = new FacebookDecorator(emailAndSMS);
        emailSMSSlack.send("System Update Available!");

        System.out.println("\nEmail + SMS + Facebook + Slack Notification:");
        Notifier fullNotifier = new SlackDecorator(emailSMSSlack);
        fullNotifier.send("System Update Available!");
    }
}

