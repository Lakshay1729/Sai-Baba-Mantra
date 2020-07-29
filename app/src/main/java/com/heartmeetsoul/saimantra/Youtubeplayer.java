package com.heartmeetsoul.saimantra;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Youtubeplayer extends AppCompatActivity {
    YouTubePlayer.OnInitializedListener listener;
    YouTubePlayerView view;
    WebView myWebView;
    private View mCustomView;
    private RelativeLayout mContentView;
    private FrameLayout mCustomViewContainer;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;

    WebChromeClient mWebChromeClient;
Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtubeplayer);
        //view=(YouTubePlayerView)findViewById(R.id.youtubeview);

        myWebView = (WebView) findViewById(R.id.webView);

button1=findViewById(R.id.button1);
button2=findViewById(R.id.button2);
button3=findViewById(R.id.button3);


button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://heartmeetsoul.com/category/mantras/")));
    }
});

button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        try {
//            PackageManager pm = getPackageManager();
//            ApplicationInfo ai = pm.getApplicationInfo(getPackageName(), 0);
            //File srcFile = new File(ai.publicSourceDir);
            Bitmap bitmap;
            OutputStream output;

            // Retrieve the image from the res folder
            //  bitmap =  ((BitmapDrawable)).getBitmap();




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
});

button3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://heartmeetsoul.com/10-sai-baba-mantra-for-success-prosperity-job-marriage/")));
    }
});


//        myWebView.getSettings().setLoadsImagesAutomatically(true);
//        myWebView.getSettings().setJavaScriptEnabled(true);
//        myWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
//        myWebView.loadUrl("https://www.sai.org.in/en/sai-video-popup");
//        myWebView.setWebViewClient(new MyBrowser());


        mWebChromeClient = new MyWebChromeClient();
        myWebView.setWebChromeClient(mWebChromeClient);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://www.sai.org.in/node/504?width=960&height=540&iframe=true");
        myWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        myWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                return false;
            }
        });


//        listener = new YouTubePlayer.OnInitializedListener() {
//            @Override
//            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                youTubePlayer.loadVideo("f946f18a-cf57-40f6-8f37-039372a64081");
//            }
//
//            @Override
//            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//
//            }
//        };
//        view.initialize(PlayerConsole.API_KEY, listener);
//
  }

    @Override
    public void onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        } else
            super.onBackPressed();

    }


//    private class MyBrowser extends WebViewClient {
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, String url) {
//            view.loadUrl(url);
//            return true;
//        }
//    }

    private class MyWebChromeClient extends WebChromeClient {


        FrameLayout.LayoutParams LayoutParameters = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);

        @Override
        public void onShowCustomView(View view, CustomViewCallback callback) {
            // if a view already exists then immediately terminate the new one
            if (mCustomView != null) {
                callback.onCustomViewHidden();
                return;
            }
            mContentView = (RelativeLayout) findViewById(R.id.web_lay);
            mContentView.setGravity(Gravity.CENTER_VERTICAL);
            mContentView.setVisibility(View.GONE);
            mCustomViewContainer.setForegroundGravity(Gravity.CENTER);
            mCustomViewContainer = new FrameLayout(Youtubeplayer.this);
            mCustomViewContainer.setLayoutParams(LayoutParameters);

            view.setLayoutParams(LayoutParameters);
            mCustomViewContainer.addView(view);
            mCustomView = view;
            mCustomViewCallback = callback;
            mCustomViewContainer.setVisibility(View.VISIBLE);
            mCustomViewContainer.setBackgroundColor(Color.rgb(102,88,109));

            setContentView(mCustomViewContainer);
        }
    }

}
