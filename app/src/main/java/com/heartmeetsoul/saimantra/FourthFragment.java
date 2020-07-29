package com.heartmeetsoul.saimantra;


import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.Date;

import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

import static android.content.Context.WINDOW_SERVICE;
import static com.heartmeetsoul.saimantra.MainActivity.hour;
import static com.heartmeetsoul.saimantra.MainActivity.minute;
import static com.heartmeetsoul.saimantra.MainActivity.puja_thali;
import static com.heartmeetsoul.saimantra.MainActivity.textView89;
import static com.heartmeetsoul.saimantra.MainActivity.viewKonfetti;


/**
 * A simple {@link Fragment} subclass.
 */
public class FourthFragment extends Fragment {
Button b1;
TextView textView;
ImageButton livee;
    private int height;
    private int width;

    ImageButton stop,click,play,alarm,three,shareit;
    public FourthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
super.onCreateView(inflater,container,savedInstanceState);
          final View view= inflater.inflate(R.layout.fragment_fourth, container, false);
b1=(Button)view.findViewById(R.id.time);
//rel=(RelativeLayout)view.findViewById(R.id.live_alarm);
//rel.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        startActivity(new Intent(getContext(),Youtubeplayer.class));
//    }
//});



        livee=(ImageButton)view.findViewById(R.id.livee);

        livee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),Youtubeplayer.class));
            }
        });
        final Animation anim = new MyAnimation((ImageButton)view.findViewById(R.id.puja_thali), 200);
        anim.setDuration(3000);
        anim.setRepeatCount(2);
        anim.initialize(100,100,400,500);



        ((ImageButton)view.findViewById(R.id.puja_thali)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             puja_thali.setVisibility(View.VISIBLE);
             puja_thali.startAnimation(anim);
                ((ImageButton)view.findViewById(R.id.puja_thali)).setVisibility(View.INVISIBLE);
             new Handler().postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     puja_thali.setVisibility(View.INVISIBLE);
                     ((ImageButton)view.findViewById(R.id.puja_thali)).setVisibility(View.VISIBLE);
                 }
             },9000);

            }
        });





//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                AlarmManager am = (AlarmManager)getContext().getSystemService(Context.ALARM_SERVICE);
//                Date futureDate = new Date(new Date().getTime() );
//                futureDate.setHours(hour);
//
//                futureDate.setMinutes(minute);
//                futureDate.setSeconds(0);
//                Toast.makeText(getContext(), "HEllo,ye bhi chal ra h"+hour+minute+futureDate.getTime(), Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(getContext(), MyAppReceiver.class);
//                intent.setAction("com.heartmeetsoul.saimantra.MY_UNIQUE_ACTION");
//                PendingIntent sender = PendingIntent.getBroadcast(getContext(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
//                am.setExact(AlarmManager.RTC_WAKEUP,futureDate.getTime()  , sender);
//
//            }
//        });
        return view;
    }





}
