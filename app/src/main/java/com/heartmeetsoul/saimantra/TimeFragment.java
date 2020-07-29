package com.heartmeetsoul.saimantra;

import android.app.AlarmManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Date;

public class TimeFragment extends DialogFragment {

    public TimeFragment()
    {

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        super.onCreateDialog(savedInstanceState);
        Dialog mDialog;


        TimePickerDialog.OnTimeSetListener listener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                try {
                    AlarmManager am = (AlarmManager) getContext().getSystemService(Context.ALARM_SERVICE);
                    Date futureDate = new Date(new Date().getTime() );
                    MainActivity.hour=hourOfDay;
                    MainActivity.minute=minute;
                    futureDate.setHours(hourOfDay);

                    futureDate.setMinutes(minute);
                    futureDate.setSeconds(0);
                    Intent intent = new Intent(getContext(), MyAppReceiver.class);
                    intent.setAction("com.heartmeetsoul.saimantra.MY_UNIQUE_ACTION");
                    PendingIntent sender = PendingIntent.getBroadcast(getContext(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
                    am.setExact(AlarmManager.ELAPSED_REALTIME, futureDate.getTime() , sender);
                    Toast.makeText(getContext(), "Alarm Set for " + hourOfDay + ":" + minute, Toast.LENGTH_SHORT).show();
                } catch (Exception ex) {
                    Toast.makeText(getContext(), "Error" + ex, Toast.LENGTH_SHORT).show();
                }
            }
        };
        mDialog=new TimePickerDialog(getContext(),listener,0,0,false);

        return mDialog;
    }

//    public static class MyAppReciever extends BroadcastReceiver {
//        @Override
//        public void onReceive(Context context, Intent intent) {
//            Toast.makeText(context, "Hi,it worked", Toast.LENGTH_SHORT).show();
//            Intent intent1=new Intent(context,MainActivity.class);
//            intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//          context.startActivity(intent1);
//            // MainActivity.class.mediaPlayer.start();
//        }
    }


