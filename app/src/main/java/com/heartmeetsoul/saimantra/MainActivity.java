package com.heartmeetsoul.saimantra;

import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;

import android.os.Bundle;
import android.provider.MediaStore;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.content.pm.PackageManager;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.Manifest;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

//import com.github.jinatonic.confetti.ConfettiManager;

import com.google.android.material.tabs.TabLayout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

import java.util.List;

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

import static com.heartmeetsoul.saimantra.MyPhoneStateListener.phoneRinging;
//import com.example.mantra.FallingConfettiFromTopActivity;

public class MainActivity extends AppCompatActivity {
    private static final int CHOOSE_FILE_REQUESTCODE = 1;
    int images[]={R.drawable.saibaba1,R.drawable.saibaba2,R.drawable.saibaba3,R.drawable.saibaba4,R.drawable.saibaba5,R.drawable.saibaba6,R.drawable.saibaba7,R.drawable.saibaba8,R.drawable.saibaba9,R.drawable.saibaba10,R.drawable.saibaba11,R.drawable.back0, R.drawable.back1, R.drawable.back2, R.drawable.back3, R.drawable.back4, R.drawable.back5, R.drawable.back6, R.drawable.back7, R.drawable.back8, R.drawable.back9, R.drawable.back10,R.drawable.back11,R.drawable.back12,R.drawable.back13,R.drawable.back14,R.drawable.back15};
   // int images[] = {R.drawable.back0, R.drawable.back1, R.drawable.back2, R.drawable.back3, R.drawable.back4, R.drawable.back5, R.drawable.back6, R.drawable.back7, R.drawable.back8, R.drawable.back9, R.drawable.back10,R.drawable.back11,R.drawable.back12,R.drawable.back13,R.drawable.back14,R.drawable.back15,R.drawable.back16,R.drawable.back17,R.drawable.back18,R.drawable.back19,R.drawable.back20,R.drawable.back21,R.drawable.back22,R.drawable.back23,R.drawable.back24};
    ImageView imageView2, imageView1;
    ViewPager viewpager;
   static MediaPlayer mediaPlayer;
    static ImageButton ig;
    static int text = 15;
    int f = 0;
   static int c = 0;
    int f7x = 1;
    int pause=0;
    MediaPlayer mediaPlayer1;

    static int hour=0,minute=0;
   // private final List<ConfettiManager> activeConfettiManagers = new ArrayList<>();
    public int pi1;
    public int pi2;
    public int pi3;
    int mpcount= 1;
   static TextView textView6b;
    int counter = 0;
     static TextView textView6,textView7,textView8,textView4,textView9,text6,text7,text8,text4;

    ViewFlipper viewFlipper;
    //private InterstitialAd interstitial;
    private boolean interstitial_shown_to_user=false;
    private ThreadGroup adView1;
    private int f4j=0;
    int repeat=1;
    int repeat2=1;
    private int repeat3=0;
    private int multiple=11;
    Handler mHandler;
   static TextView textView89;
    public static boolean bool;
    ImageButton   ig1;

    // static PendingIntent sender;
   static KonfettiView viewKonfetti;
   static ImageView puja_thali;
    private int minimizef=0;
    public static int height;
    public static int width;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // imageView = (ImageView) findViewById(R.id.img1);
        ig=(ImageButton)findViewById(R.id.play);
         //  ig1=(ImageButton)findViewById(R.id.stop);
        mediaPlayer = MediaPlayer.create(this, R.raw.saibabamantra);


//        OneSignal.startInit(this)
//                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
//                .unsubscribeWhenNotificationsAreDisabled(true)
//                .init();
//    }






findViewById(R.id.phool).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        viewKonfetti.build()
                        .addColors(getResources().getColor(R.color.orange), Color.RED)
                        .setDirection(0.0, 359.0)
                        .setSpeed(1f, 5f)
                        .setFadeOutEnabled(true)
                        .setTimeToLive(2000L)
                        .addShapes(Shape.CIRCLE)
                        .addSizes(new Size(12, 5))
                        .setPosition(viewKonfetti.getX()+viewKonfetti.getWidth()/23f,viewKonfetti.getX() + viewKonfetti.getWidth() / 0.8f, viewKonfetti.getY() + viewKonfetti.getHeight()/ 2.8f,viewKonfetti.getY() + viewKonfetti.getHeight()/1.2f)
                        .burst(320);

    }
});

        puja_thali=(ImageView)findViewById(R.id.aarti);

        viewKonfetti=findViewById(R.id.konfetti_view);
        textView89=findViewById(R.id.textview89);
        textView89.setText("Read More About Sai Baba Mantra");
        textView89.setGravity(Gravity.CENTER_HORIZONTAL);
        textView89.setTextSize(18);
        textView89.setPaddingRelative(17,24,0,0);
        textView89.setTextColor(Color.WHITE);




        WindowManager wm = (WindowManager) getSystemService(WINDOW_SERVICE);
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(displayMetrics);
         height = displayMetrics.heightPixels;
         width = displayMetrics.widthPixels;

        ((RelativeLayout)findViewById(R.id.rel)).setLayoutParams(new RelativeLayout.LayoutParams((int) (width), (int) (height * .654)));


        RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(width,(int)(height*.07));
        params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        params.addRule(RelativeLayout.TEXT_ALIGNMENT_GRAVITY);
           textView89.setLayoutParams(params);





        if ((ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED)&&(ContextCompat.checkSelfPermission(this,Manifest.permission.WRITE_EXTERNAL_STORAGE)==PackageManager.PERMISSION_GRANTED))  {

        } else {
            if ( shouldShowRequestPermissionRationale(Manifest.permission.READ_PHONE_STATE)&&(shouldShowRequestPermissionRationale(Manifest.permission.WRITE_EXTERNAL_STORAGE))) {
                Toast.makeText(this, "External Storage and Phone Permission Required", Toast.LENGTH_SHORT).show();
            }

            requestPermissions(new String[]{Manifest.permission.READ_PHONE_STATE,Manifest.permission.WRITE_EXTERNAL_STORAGE}, 9);
        }

//                    textView6.setTextSize(height*.04f);
//                    textView7.setTextSize(height*.04f);
//                    textView8.setTextSize(height*.04f);
//                    textView4.setTextSize(height*.04f);
//
//
//        text6.setTextSize(height*.04f);
//            text7.setTextSize(height*.04f);
//            text8.setTextSize(height*.04f);
//            text4.setTextSize(height*.04f);















//        ((TelephonyManager) getSystemService(TELEPHONY_SERVICE)).listen(new PhoneStateListener() {
//            public void onCallStateChanged(int i, String str) {
//                switch (i) {
//                    case TelephonyManager.CALL_STATE_IDLE:
//                    {
//                          if(bool) {
//                              mediaPlayer.start();
//                              ImageButton ig = (ImageButton) findViewById(R.id.play);
//                              ig.setImageResource(R.drawable.pause);
//                              return;
//                          }
//                        return;
//                    }
//                    case TelephonyManager.CALL_STATE_RINGING:
//                        try {
//                            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
//                                MainActivity.this.mediaPlayer.pause();
//                               ImageButton ig= (ImageButton) findViewById(R.id.play);
//                               ig.setImageResource( R.drawable.play);
//                                bool=false;
//                                return;
//                            }
//                            return;
//                        }
//                        catch (Exception e) {
//                           // i2.printStackTrace();
//                            Toast.makeText(MainActivity.this, ""+e, Toast.LENGTH_SHORT).show();
//                            return;
//                        }
//                    case TelephonyManager.CALL_STATE_OFFHOOK:
//                        try {
//                            if (mediaPlayer != null && mediaPlayer.isPlaying() != false) {
//                                MainActivity.this.mediaPlayer.pause();
//                                ImageButton imageButton=(ImageButton)findViewById(R.id.play);
//                                imageButton.setImageResource(R.drawable.pause);
//                                //textView2.setText("CONTINUE");
//                               // MainActivity.this.f1d++;
//                                bool=true;
//                                return;
//                            }
//                            return;
//                        } catch (Exception e) {
//                            Toast.makeText(MainActivity.this, ""+e, Toast.LENGTH_SHORT).show();
//                            return;
//                        }
//
//
//                    default:
//                        return;
//                }
//            }
//        }, 32);








            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    f4j=0;
//                    bool=false;
                    mediaPlayer.seekTo(0);
                    mediaPlayer.start();
                   // r.run();

//
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//                    if (bool) {
//                        mp.seekTo(0);
//                        mp.start();
//
//
//                    }

                }
            });





//        void showiad() {
//            if (this.interstitial.isLoaded() && this.app_is_in_foreground_mode) {
//                this.interstitial.show();
//                this.interstitial_shown_to_user = true;
//            }
//        }
//        void show_exit_iad() {
//            if (this.Exit_interstitial.isLoaded() && this.app_is_in_foreground_mode && !this.interstitial_shown_to_user) {
//                this.Exit_interstitial.show();
//            }
//        }


//        public void onBackPressed()
//        {
//            super.onBackPressed();
//            //show_exit_iad();
//            AlertDialog.Builder builder = new AlertDialog.Builder(this);
//            builder.setMessage("Are you sure you want to exit?");
//            builder.setCancelable(false).setTitle(" Exit Application ?").setInverseBackgroundForced(true).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialogInterface, int i) {
//                    MainActivity.this.finish();
//                    //Process.killProcess(Process.myPid());
//                }
//            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialogInterface, int i) {
//                    dialogInterface.cancel();
//                }
//            });
//            builder.setNeutralButton("Minimise App", new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialogInterface, int i) {
//                    //i = new Intent("android.intent.action.MAIN");
//                   // i.addCategory("android.intent.category.HOME");
//                   // i.setFlags(268435456);
//                   // MainActivity.this.startActivity(i);
//                    dialogInterface.cancel();
//                }
//            });
//            builder.create().show();
//        }





        viewpager = (ViewPager) findViewById(R.id.vp1);

        viewpager.setOffscreenPageLimit(3);
        viewFlipper = (ViewFlipper) findViewById(R.id.vflipper);


        viewFlipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in));
        viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_out));

        for (int i = 0; i < images.length; i++) {
            ImageView imageView = new ImageView(MainActivity.this);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageResource(images[i]);
            viewFlipper.addView(imageView);
            //i++;
        }
        if (!viewFlipper.isFlipping()) {
            viewFlipper.setAutoStart(true);
            viewFlipper.setFlipInterval(2000);
            viewFlipper.startFlipping();
        }
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new FirstFragment(), "English Subtitle");
        adapter.addFragment(new FourthFragment(), "Home");
        adapter.addFragment(new SecondFragment(),"Hindi Subtitle");


       // adapter.addFragment(new FifthFragment(), "RepeatMantra");
        viewpager.setAdapter(adapter);

        viewpager.setCurrentItem(1);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewpager);
        mediaPlayer1=MediaPlayer.create(getApplicationContext(),R.raw.bell_sound);
        imageView2=(ImageView)findViewById(R.id.imageview2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);

                imageView2.setAnimation(animation);
                imageView2.startAnimation(animation);
                if(animation.hasEnded())
                {
                    mediaPlayer1=MediaPlayer.create(getApplicationContext(),R.raw.bell_sound);
                }
                mediaPlayer1.start();

            }
        });
     imageView1=(ImageView)findViewById(R.id.imageview);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);

                imageView1.setAnimation(animation);
                imageView1.startAnimation(animation);
                if(animation.hasEnded())
                {
                    mediaPlayer1=MediaPlayer.create(getApplicationContext(),R.raw.bell_sound);
                }
                mediaPlayer1.start();

            }
        });


    }


    Runnable r=  new Runnable()
    {
//        Counter ()
//        {
//
//        }
        @Override
        public void run() {
            //Toast.makeText(MainActivity.this, "Thread Running", Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(r,1);

                  //textView9.setText("~Om Sai Ram~"+f4j);
                  //textView9.setVisibility(View.INVISIBLE);

           // Toast.makeText(MainActivity.this, "Handler chala"+MainActivity.this.f4j, Toast.LENGTH_SHORT).show();
//            MainActivity.this.repeat2 = (MainActivity.this.repeat2 * 2) / 2;
//            MainActivity.this.f7x = (MainActivity.this.f7x * 2) / 2;
//            MainActivity.this.repeat = (MainActivity.this.repeat * 2) / 2;




//            if (MainActivity.this.f4j < 13500) {
//                MainActivity.this.f7x = 1;
//               // Toast.makeText(MainActivity.this, "First Block", Toast.LENGTH_SHORT).show();
//               // MainActivity.this.textView6.setTextColor(Color.WHITE);
//                MainActivity.this.repeat = MainActivity.this.mpcount;
//            }
//            if (MainActivity.this.f4j > 13500 && MainActivity.this.f4j < 26800) {
//                MainActivity.this.f7x = 2;
//                //Toast.makeText(MainActivity.this, "Second Block", Toast.LENGTH_SHORT).show();
//
//                MainActivity.this.repeat = MainActivity.this.mpcount;
//            }
//            if (MainActivity.this.f4j > 26800 && MainActivity.this.f4j < 40700) {
//                MainActivity.this.f7x = 3;
//                //Toast.makeText(MainActivity.this, "Third Block", Toast.LENGTH_SHORT).show();
//
//                MainActivity.this.repeat = MainActivity.this.mpcount;
//            }
//            if (MainActivity.this.f4j > 40700 && MainActivity.this.f4j < 81500) {
//                MainActivity.this.f7x = 4;
//               // Toast.makeText(MainActivity.this, "Fourth Block", Toast.LENGTH_SHORT).show();
//
//                MainActivity.this.repeat = MainActivity.this.mpcount;
//            }
//            if (MainActivity.this.f4j > 81500 && MainActivity.this.f4j < 95000) {
//                MainActivity.this.f7x = 5;
//                MainActivity.this.repeat = MainActivity.this.mpcount;
//            }
//            if (MainActivity.this.f4j > 95000 && MainActivity.this.f4j < 108200) {
//                MainActivity.this.f7x = 6;
//                MainActivity.this.repeat = MainActivity.this.mpcount;
//            }
//            if (MainActivity.this.f4j > 108200 && MainActivity.this.f4j < 122200) {
//                MainActivity.this.f7x = 7;
//                MainActivity.this.repeat = MainActivity.this.mpcount;
//            }
//           if (MainActivity.this.f4j > 122200) {
//               MainActivity.this.f7x = 8;
//               MainActivity.this.repeat = MainActivity.this.mpcount;
//               MainActivity.this.repeat3 = MainActivity.this.repeat2;
//               //MainActivity.this.repeat = MainActivity.this.mpcount;
//           }
            //mediaPlayer.create(getApplicationContext(),R.raw.saimantra);


//               if(pause==1)
//               mediaPlayer.start();
//               else if(pause==0) {
//                   mediaPlayer.stop();
//                   mediaPlayer.create(getApplicationContext(),R.raw.saimantra);
//               }
//               else if(pause==2)
//                   mediaPlayer.pause();
//               textView9.setText(""+repeat);
//               textView6b.setVisibility(View.VISIBLE);

//            if(bool) {
//                f4j++;
//                if (MainActivity.this.f4j > 0 && MainActivity.this.f4j < 280) {
//                    textView6.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#FFBBFF"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 280 && MainActivity.this.f4j < 580) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#FFBBFF"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//                }
//                if (MainActivity.this.f4j > 580 && MainActivity.this.f4j < 860) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#FFBBFF"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//                }
//                if (MainActivity.this.f4j > 860 && MainActivity.this.f4j < 1170) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#FFBBFF"));
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#FFBBFF"));
//
//
//                }
//                if (MainActivity.this.f4j > 1170 && MainActivity.this.f4j < 1470) {
//                    textView6.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//                    text6.setTextColor(Color.parseColor("#FFBBFF"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 1470 && MainActivity.this.f4j < 1770) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#FFBBFF"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 1770 && MainActivity.this.f4j < 2070) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#FFBBFF"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 2070 && MainActivity.this.f4j < 2370) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#FFBBFF"));
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#FFBBFF"));
//
//
//
//
//                }
//                if (MainActivity.this.f4j > 2370 && MainActivity.this.f4j < 2670) {
//                    textView6.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#FFBBFF"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 2670 && MainActivity.this.f4j < 2970) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#FFBBFF"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 2970 && MainActivity.this.f4j < 3270) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#FFBBFF"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 3270 && MainActivity.this.f4j < 3570) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#FFBBFF"));
//
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#FFBBFF"));
//
//
//                }
//                if (MainActivity.this.f4j > 3570 && MainActivity.this.f4j < 3870) {
//                    textView6.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//                    text6.setTextColor(Color.parseColor("#FFBBFF"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 3870 && MainActivity.this.f4j < 4170) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#FFBBFF"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//
//                if (MainActivity.this.f4j > 4170 && MainActivity.this.f4j < 4470) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#FFBBFF"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 4470 && MainActivity.this.f4j < 6990) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#FFBBFF"));
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#FFBBFF"));
//
//
//                }
//                if (MainActivity.this.f4j > 6990 && MainActivity.this.f4j < 7290) {
//                    textView6.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#FFBBFF"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 7290 && MainActivity.this.f4j < 7590) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#FFBBFF"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 7590 && MainActivity.this.f4j < 7890) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#FFBBFF"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 7890 && MainActivity.this.f4j < 8190) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#FFBBFF"));
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#FFBBFF"));
//
//
//
//                }
//                if (MainActivity.this.f4j > 8190 && MainActivity.this.f4j < 8490) {
//                    textView6.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#FFBBFF"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 8490 && MainActivity.this.f4j < 8790) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#FFBBFF"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//
//                }
//                if (MainActivity.this.f4j > 8790 && MainActivity.this.f4j < 9090) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#FFBBFF"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 9090 && MainActivity.this.f4j < 9380) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#FFBBFF"));
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#FFBBFF"));
//
//
//
//                }
//                if (MainActivity.this.f4j > 9380 && MainActivity.this.f4j < 9680) {
//                    textView6.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//                    text6.setTextColor(Color.parseColor("#FFBBFF"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//
//                }
//                if (MainActivity.this.f4j > 9680 && MainActivity.this.f4j < 9980) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#FFBBFF"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 9980 && MainActivity.this.f4j < 11280) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#FFBBFF"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 11280 && MainActivity.this.f4j < 11580) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#FFBBFF"));
//
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#FFBBFF"));
//
//
//                }
//                if (MainActivity.this.f4j > 11580 && MainActivity.this.f4j < 11880) {
//                    textView6.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#FFBBFF"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//                }
//                if (MainActivity.this.f4j > 11880 && MainActivity.this.f4j < 12150) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#FFBBFF"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                }
//                if (MainActivity.this.f4j > 12150 && MainActivity.this.f4j < 12450) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#FFBBFF"));
//                    textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#FFBBFF"));
//                    text4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//
//                }
//                if (MainActivity.this.f4j > 12450) {
//                    textView6.setTextColor(Color.parseColor("#00EEEE"));
//                    textView7.setTextColor(Color.parseColor("#00EEEE"));
//                    textView8.setTextColor(Color.parseColor("#00EEEE"));
//                    textView4.setTextColor(Color.parseColor("#FFBBFF"));
//
//
//                    text6.setTextColor(Color.parseColor("#00EEEE"));
//                    text7.setTextColor(Color.parseColor("#00EEEE"));
//                    text8.setTextColor(Color.parseColor("#00EEEE"));
//                    text4.setTextColor(Color.parseColor("#FFBBFF"));
//                }
//
//
//                //  new Handler().postDelayed(r1, 1);
//
////
//            }
        }



    };
//           if (MainActivity.this.repeat2 > MainActivity.this.multiple) {
//               MainActivity.this.mediaPlayer.release();
//             //  MainActivity.this.showiad();
//               textView6.setTextColor(Color.parseColor("#00EEEE"));
//               textView7.setTextColor(Color.parseColor("#00EEEE"));
//               textView8.setTextColor(Color.parseColor("#00EEEE"));
//               textView4.setTextColor(Color.parseColor("#00EEEE"));
//               MainActivity.this.mpcount = 1;
//               MainActivity.this.repeat3 = 0;
//               MainActivity.this.multiple=11;
//               MainActivity.this.repeat=1;
//               MainActivity.this.repeat2=1;
//               MainActivity.this.f7x=1;
////               MainActivity.this.one.setEnabled(true);
////               MainActivity.this.two.setEnabled(true);
////               MainActivity.this.three.setEnabled(true);
////               MainActivity.this.one.setTextColor(InputDeviceCompat.SOURCE_ANY);
////               MainActivity.this.two.setTextColor(-16711681);
////               MainActivity.this.three.setTextColor(-16711681);
////               MainActivity.this.four.setTextColor(-16711681);
//               MainActivity.this.multiple = 11;
////               textView5.setVisibility(8);
////               textView11.setVisibility(8);
////               textView12.setVisibility(8);
//               MainActivity.this.repeat = 1;
//               MainActivity.this.repeat2 = 1;
//               MainActivity.this.f7x = 1;
//               MainActivity.this.B4.setBackgroundResource(C0172R.drawable.play);
//               textView.setText("PLAY");
//               MainActivity.this.B4.setChecked(false);
//               MainActivity.this.B2.setVisibility(8);
//               textView10.setVisibility(8);


//    @Override
//    public void onResume() {
//        super.onResume();
//
//        // Resume the AdView.
//        mAdview.resume();
//    }

//    @Override
//    public void onPause() {
//        // Pause the AdView.
//        mAdview.pause();
//
//        super.onPause();
//    }

//    @Override
//    public void onDestroy() {
//        // Destroy the AdView.
////        mAdview.destroy();
////
////        super.onDestroy();
//    }






    public void Click(View view) {

        ig = (ImageButton) findViewById(R.id.play);


        if (mediaPlayer.isPlaying()) {
            bool=false;
            mediaPlayer.pause();
//            textView6.setTextColor(Color.parseColor("#00EEEE"));
//            textView7.setTextColor(Color.parseColor("#00EEEE"));
//            textView8.setTextColor(Color.parseColor("#00EEEE"));
//            textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//            text6.setTextColor(Color.parseColor("#00EEEE"));
//            text7.setTextColor(Color.parseColor("#00EEEE"));
//            text8.setTextColor(Color.parseColor("#00EEEE"));
//            text4.setTextColor(Color.parseColor("#00EEEE"));

            ig.setImageResource(R.drawable.play);

        }
        else if (!mediaPlayer.isPlaying()) {
            // mediaPlayer.setLooping(true);
           // r.run();
            bool=true;
           mediaPlayer.start();
            ig.setImageResource(R.drawable.pause);



        }

    }
//    Runnable r = new Runnable() {
//        @Override
//        public void run() {
//
//
//        }
//
//
//    };
    public void startCounting()
    {
       ;
    }
//    @Override
//    public void onResume() {
//        super.onResume();
//        boolean alarmUp = (PendingIntent.getBroadcast(this, 0,
//                new Intent("com.heartmeetsoul.saimantra.MY_UNIQUE_ACTION"),
//                PendingIntent.FLAG_NO_CREATE) != null);
////        if (pendingIntent != null) {
////            pendingIntent.cancel();
////        }
//
//        if (alarmUp) {
//            Toast.makeText(this, "Alarm Set", Toast.LENGTH_SHORT).show();
//            ;
//        } else {
//            Toast.makeText(this, "Alarm Not set", Toast.LENGTH_SHORT).show();
//        }
//    }

    public void Open(View view) {
        OptionsFragment options = new OptionsFragment();
        getSupportFragmentManager().beginTransaction().add(options, "Options").commit();

    }

    public void stop(View view) {
     //
        ig=(ImageButton)findViewById(R.id.play);
        try {
            mediaPlayer.stop();
//            textView6.setTextColor(Color.parseColor("#00EEEE"));
//            textView7.setTextColor(Color.parseColor("#00EEEE"));
//            textView8.setTextColor(Color.parseColor("#00EEEE"));
//            textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//            text6.setTextColor(Color.parseColor("#00EEEE"));
//            text7.setTextColor(Color.parseColor("#00EEEE"));
//            text8.setTextColor(Color.parseColor("#00EEEE"));
//            text4.setTextColor(Color.parseColor("#00EEEE"));

            f4j=0;
            bool=false;

        }
        catch (Exception ex) {
             Toast.makeText(this, "Gana Chala hi nhi to band kya krega", Toast.LENGTH_SHORT).show();
        }
       mediaPlayer = MediaPlayer.create(this, R.raw.saibabamantra);
        ig.setImageResource(R.drawable.play);
    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String Fpath = data.getDataString();
        // do somthing...
        // mediaPlayer=MediaPlayer.create(this,)
        super.onActivityResult(requestCode, resultCode, data);

    }


//    public void choose(View view) {
//
//        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
//        intent.addCategory(Intent.CATEGORY_OPENABLE);
//        intent.setType("*/*");
//        Intent i = Intent.createChooser(intent, "File");
//        startActivityForResult(i, CHOOSE_FILE_REQUESTCODE);
//    }

    public void Ads(View view) {
        Intent intent=new Intent(this,AdsActivity.class);
        startActivity(intent);
    }

    public void ShareIt(View view) {


        try {


            OutputStream output;




            File file = new File(Environment.getExternalStorageDirectory()
                    + File.separator + ""
                    + System.currentTimeMillis() + ".jpg");



                // Share Intent
                Intent share = new Intent(Intent.ACTION_SEND);


                // Type of file to share
                share.setType("*/*");


                output = new FileOutputStream(file);
                //Compress into png format image from 0% - 100%
                //bitmap.compress(Bitmap.CompressFormat.PNG, -20, output);
            BitmapFactory.decodeResource(getResources(),R.drawable.screenshot).compress(Bitmap.CompressFormat.JPEG, 100, output);

            output.flush();
                output.close();

                // Locate the image to Share
                Uri uri = Uri.fromFile(file);

                // Pass the image into an Intnet
                share.putExtra(Intent.EXTRA_STREAM, uri);

            share.putExtra(Intent.EXTRA_TEXT,"Download this app and have a new age digital temple experience with its unique bell and\n flower features.It also provides live darshan from shirdi sai mandir.  \tLink  :https://play.google.com/store/apps/details?id=com.heartmeetsoul.saimantra&hl=en");
            startActivity(Intent.createChooser(share, "Share this app via"));
        } catch (Exception e) {
            Log.e("ShareApp", e.getMessage());
        }
    }

    public void Alarm(View view) {
// TimeFragment time=new TimeFragment();
// getSupportFragmentManager().beginTransaction().add(time,"Time").commit();

        startActivity(new Intent(this,Youtubeplayer.class));

        //  @SuppressLint("SdCardPath") File newSoundFile = new File("/storage/emulated/0/UCDownloads/", "JustinTimberLake-Mirrors.mp3");
//        Uri mUri = Uri.parse("android.resource://com.example.mantra/R.raw.saimantra");
//        ContentResolver mCr = this.getContentResolver();
//        AssetFileDescriptor soundFile;
//        try {
//            soundFile= mCr.openAssetFileDescriptor(mUri, "r");
//        } catch (FileNotFoundException e) {
//            soundFile=null;
//        }
//
//        try {
//            byte[] readData = new byte[1024];
//            assert soundFile != null;
//            FileInputStream fis = soundFile.createInputStream();
//            FileOutputStream fos = new FileOutputStream(newSoundFile);
//            int i = fis.read(readData);
//
//            while (i != -1) {
//                fos.write(readData, 0, i);
//                i = fis.read(readData);
//            }
//
//            fos.close();
//        } catch (IOException ignored) {
//        }


//        ContentValues values = new ContentValues();
//        values.put(MediaStore.MediaColumns.DATA, newSoundFile.getAbsolutePath());
//        values.put(MediaStore.MediaColumns.TITLE, "my ringtone");
//        values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mp3");
//        values.put(MediaStore.MediaColumns.SIZE, newSoundFile.length());
//        values.put(MediaStore.Audio.Media.ARTIST, R.string.app_name);
//        values.put(MediaStore.Audio.Media.IS_RINGTONE, true);
//        values.put(MediaStore.Audio.Media.IS_NOTIFICATION, true);
//        values.put(MediaStore.Audio.Media.IS_ALARM, true);
//        values.put(MediaStore.Audio.Media.IS_MUSIC, false);
//
//        Uri uri = MediaStore.Audio.Media.getContentUriForPath(newSoundFile.getAbsolutePath());
//        Uri newUri = mCr.insert(uri, values);
//
//
//        try {
//            RingtoneManager.setActualDefaultRingtoneUri(getApplicationContext(), RingtoneManager.TYPE_RINGTONE, newUri);
//        } catch (Throwable t) {
//            Toast.makeText(this, ""+t, Toast.LENGTH_SHORT).show();
//        }
//        File k = new File("/storage/emulated/0/UCDownloads/", "JustinTimberlake-Mirrors.mp3"); // path is a file to /sdcard/media/ringtone
//
//        ContentValues values = new ContentValues();
//        values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
//        values.put(MediaStore.MediaColumns.TITLE, "My Song title");
//        values.put(MediaStore.MediaColumns.SIZE, 215454);
//        values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mp3");
//        values.put(MediaStore.Audio.Media.ARTIST, "Sabka Malik Ek");
//        values.put(MediaStore.Audio.Media.DURATION, 225);
//        values.put(MediaStore.Audio.Media.IS_RINGTONE, true);
//        values.put(MediaStore.Audio.Media.IS_NOTIFICATION, false);
//        values.put(MediaStore.Audio.Media.IS_ALARM, false);
//        values.put(MediaStore.Audio.Media.IS_MUSIC, false);
//
////Insert it into the database
//        Uri uri = MediaStore.Audio.Media.getContentUriForPath(k.getAbsolutePath());
//        Uri newUri = this.getContentResolver().insert(uri, values);
//
//        RingtoneManager.setActualDefaultRingtoneUri(
//                getApplicationContext(),
//                RingtoneManager.TYPE_RINGTONE,
//                newUri
//        );


//        Intent data = new Intent();
//        data.setAction(Intent.ACTION_GET_CONTENT);
//        data.setType("audio/*");
//
//        Uri i = data.getData();  // getData
//        String s = i.getPath(); // getPath

//        try {
//            String s = "/storage/emulated/0/UCDownloads/JustinTimberlake-Mirrors.mp3";
//            File k = new File(s);  // set File from path
//            if (s != null) {      // file.exists
//
//                ContentValues values = new ContentValues();
//                values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
//                values.put(MediaStore.MediaColumns.TITLE, "Ring");
//                values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mp3");
//                values.put(MediaStore.MediaColumns.SIZE, k.length());
//                values.put(MediaStore.Audio.Media.ARTIST, R.string.app_name);
//                values.put(MediaStore.Audio.Media.IS_RINGTONE, true);
//                values.put(MediaStore.Audio.Media.IS_NOTIFICATION, true);
//                values.put(MediaStore.Audio.Media.IS_ALARM, true);
//                values.put(MediaStore.Audio.Media.IS_MUSIC, false);
//
//                Uri uri = MediaStore.Audio.Media.getContentUriForPath(k
//                        .getAbsolutePath());
//                getContentResolver().delete(
//                        uri,
//                        MediaStore.MediaColumns.DATA + "=\"" + k.getAbsolutePath() + "\"", null);
//              Uri newUri = getContentResolver().insert(uri, values);
//
//
//                RingtoneManager.setActualDefaultRingtoneUri(
//                        MainActivity.this, RingtoneManager.TYPE_ALARM,
//                        newUri);
//            }
//        }
//        catch (Throwable t) {
//                Toast.makeText(this, ""+t, Toast.LENGTH_SHORT).show();
//            }

    }

    public void moreAbout(View view) {
//
//        Intent intent = new Intent(this,WebActivity.class);
//        intent.putExtra("Url","https://heartmeetsoul.com/category/mantras/");
//        startActivity(intent);
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://heartmeetsoul.com/10-sai-baba-mantra-for-success-prosperity-job-marriage/")));
    }

    public void visit(View view) {
//        Intent intent = new Intent(this,WebActivity.class);
//       intent.putExtra("Url","https://heartmeetsoul.com/");
//       startActivity(intent);
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://heartmeetsoul.com/")));
    }

    public void shankh(View view) {

        MediaPlayer mediaPlayer1=MediaPlayer.create(this,R.raw.shankh);
mediaPlayer1.seekTo(20000);
        mediaPlayer1.start();
        ImageView ig1=(ImageView)findViewById(R.id.shankh);
        ig1.setAnimation(AnimationUtils.loadAnimation(this,R.anim.animate));

    }

    public void privacy(View view) {
        startActivity(new Intent(this,PrivacyPolicy.class));
    }

    public void rate(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.heartmeetsoul.saimantra&hl=en_US/div")));
    }


//    public void shareAPK(String bundle_id) {
//        File f1;
//        File f2 = null;
//
//        final Intent mainIntent = new Intent(Intent.ACTION_MAIN, null);
//        mainIntent.addCategory(Intent.CATEGORY_LAUNCHER);
//        final List pkgAppsList = getPackageManager().queryIntentActivities(mainIntent, 0);
//        int z = 0;
//        for (Object object : pkgAppsList) {
//
//            ResolveInfo info = (ResolveInfo) object;
//            if (info.activityInfo.packageName.equals(bundle_id)) {
//
//                f1 = new File(info.activityInfo.applicationInfo.publicSourceDir);
//
//                Log.v("file--",
//                        " " + f1.getName().toString() + "----" + info.loadLabel(getPackageManager()));
//                try {
//
//                    String file_name = info.loadLabel(getPackageManager()).toString();
//                    Log.d("file_name--", " " + file_name);
//
//                    f2 = new File(Environment.getExternalStorageDirectory().toString() + "/Folder");
//                    f2.mkdirs();
//                    f2 = new File(f2.getPath() + "/" + file_name + ".apk");
//                    f2.createNewFile();
//
//                    InputStream in = new FileInputStream(f1);
//
//                    OutputStream out = new FileOutputStream(f2);
//
//                    // byte[] buf = new byte[1024];
//                    byte[] buf = new byte[4096];
//                    int len;
//                    while ((len = in.read(buf)) > 0) {
//                        out.write(buf, 0, len);
//                    }
//                    in.close();
//                    out.close();
//                    Toast.makeText(this, "File copied.", Toast.LENGTH_SHORT).show();
//                } catch (FileNotFoundException ex) {
//                    Toast.makeText(this, ex.getMessage() + " in the specified directory.", Toast.LENGTH_SHORT).show();
//                } catch (IOException e) {
//                    Toast.makeText(this, e.getMessage()+"Hi", Toast.LENGTH_SHORT).show();
//                }
//            }
//        }
//
//    }

        private class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int i) {

            return mFragmentList.get(i);

        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {

            return mFragmentTitleList.get(position);
        }
    }
@Override

    public void onBackPressed()
{
    AlertDialog.Builder builder = new AlertDialog.Builder(this,R.style.MyDialogTheme);
            builder.setMessage("Are you sure you want to exit?");
            builder.setCancelable(false).setTitle(" Exit Application ?").setInverseBackgroundForced(true).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    MainActivity.this.finish();
                    //Process.killProcess(Process.myPid());
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            builder.setNeutralButton("Minimise App", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent=new Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.HOME");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    MainActivity.this.startActivity(intent);
                    minimizef=1;

                    dialogInterface.cancel();
                }
            });
            builder.create().show();
}

        @Override
    public void onDestroy()
       {
    super.onDestroy();
    mediaPlayer.stop();
    int pid = -1;
    ActivityManager am = (ActivityManager) this.getSystemService(Context.ACTIVITY_SERVICE);
   List<ActivityManager.RunningAppProcessInfo>procinfo=am.getRunningAppProcesses();
    for (ActivityManager.RunningAppProcessInfo proc : procinfo)
        if (proc.processName.indexOf("myApp") >= 0)
            pid = proc.pid;

    am.killBackgroundProcesses(getPackageName());


//    try {
//        Field f = .getClass().getDeclaredField("pid");
//        f.setAccessible(true);
//        pid = f.getInt(p);
//        f.setAccessible(false);
//    } catch (Throwable e) {
//        pid = -1;
//    }


}
    @Override

    public void onPause() {
        super.onPause();
        bool=false;
        if(mediaPlayer.isPlaying()) {
//            if(minimizef==0)
//            mediaPlayer.pause();
//            textView6.setTextColor(Color.parseColor("#00EEEE"));
//            textView7.setTextColor(Color.parseColor("#00EEEE"));
//            textView8.setTextColor(Color.parseColor("#00EEEE"));
//            textView4.setTextColor(Color.parseColor("#00EEEE"));
//
//
//            text6.setTextColor(Color.parseColor("#00EEEE"));
//            text7.setTextColor(Color.parseColor("#00EEEE"));
//            text8.setTextColor(Color.parseColor("#00EEEE"));
//            text4.setTextColor(Color.parseColor("#00EEEE"));
        }

       // ig.setImageResource(R.drawable.play);

    }
    @Override
    public void onResume()
    {
        super.onResume();
        if(bool) {
            mediaPlayer.start();
            ((ImageView) findViewById(R.id.play)).setBackgroundResource(R.drawable.pause);
        }
//        bool=true;
        this.overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }





}
