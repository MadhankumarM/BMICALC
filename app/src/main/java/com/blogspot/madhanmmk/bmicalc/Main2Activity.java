package com.blogspot.madhanmmk.bmicalc;



import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private WebView w;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Bundle b=getIntent().getExtras();
        String s=b.getString("string");


        setContentView(R.layout.activity_main2);
        w=(WebView)findViewById(R.id.wb);

        //To force open all links in webview
        w.setWebViewClient(new WebViewClient());

        w.getSettings().setLoadsImagesAutomatically(true);
        w.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        w.getSettings().setSupportMultipleWindows(true);
        w.getSettings().setSupportZoom(true);
        w.getSettings().getLoadWithOverviewMode();
        w.getSettings().setUseWideViewPort(true);
        w.getSettings().setDisplayZoomControls(true);
        w.getSettings().setBuiltInZoomControls(true);
        w.getSettings().setJavaScriptEnabled(true);

        //URL
        w.loadUrl(s);




    }
    //Harnessing back button
    @Override
    public void onBackPressed() {
        if(w.canGoBack()) {
            w.goBack();
        } else {
            super.onBackPressed();
        }
    }

       }


