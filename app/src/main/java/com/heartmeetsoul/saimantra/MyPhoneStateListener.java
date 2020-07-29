package com.heartmeetsoul.saimantra;


import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.webkit.WebView;

import static com.heartmeetsoul.saimantra.MainActivity.bool;
import static com.heartmeetsoul.saimantra.MainActivity.ig;
import static com.heartmeetsoul.saimantra.MainActivity.mediaPlayer;

public class MyPhoneStateListener extends PhoneStateListener {

        public static Boolean phoneRinging = false;

        public void onCallStateChanged(int state, String incomingNumber) {

            switch (state) {
                case TelephonyManager.CALL_STATE_IDLE:
                    Log.d("DEBUG", "IDLE");

                    if((mediaPlayer!=null)&&bool)
                    {
                        mediaPlayer.start();
                        ig.setImageResource(R.drawable.pause);
                    }
                    break;
                case TelephonyManager.CALL_STATE_OFFHOOK:
                    Log.d("DEBUG", "OFFHOOK");
                    phoneRinging = true;

                    if((mediaPlayer!=null)) {
                        mediaPlayer.pause();
                        ig.setImageResource(R.drawable.play);
                    }
                    break;
                case TelephonyManager.CALL_STATE_RINGING:
                    Log.d("DEBUG", "RINGING");
                    phoneRinging = true;
                    if((mediaPlayer!=null)) {
                        mediaPlayer.pause();
                        ig.setImageResource(R.drawable.play);
                    }
                    break;
            }
        }

    }

