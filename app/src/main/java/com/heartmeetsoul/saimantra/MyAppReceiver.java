package com.heartmeetsoul.saimantra;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyAppReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Hi,it worked", Toast.LENGTH_SHORT).show();
        Intent intent1=new Intent(context,com.heartmeetsoul.saimantra.MainActivity.class);
        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent1);
        MainActivity.mediaPlayer.start();
    }
}
