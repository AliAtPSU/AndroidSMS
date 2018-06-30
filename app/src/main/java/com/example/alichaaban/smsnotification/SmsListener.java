package com.example.alichaaban.smsnotification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Telephony;
import android.support.v4.app.NotificationCompat;
import android.telephony.SmsMessage;

public class SmsListener extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Telephony.Sms.Intents.SMS_RECEIVED_ACTION.equals(intent.getAction())){
            for (SmsMessage smsMessage : Telephony.Sms.Intents.getMessagesFromIntent(intent)){
                String messageBody = smsMessage.getMessageBody();
                String messageSender = smsMessage.getOriginatingAddress();
                NotificationCompat.Builder notification = new NotificationCompat.Builder(context,"1")
                        .setContentTitle("SMS notification").setContentText("test")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);
            }
        }
    }

}
