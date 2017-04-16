package com.example.android.kufeed;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.android.kufeed.R.id.txtInfo;
import static com.example.android.kufeed.R.id.webView;

public class button2 extends AppCompatActivity {
    EditText editText;
    Button search;
    TextView txtInfo;
    public WebView webView;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


       txtInfo=(TextView)findViewById(R.id.txtInfo);
        webView=(WebView)findViewById(R.id.webView);
        webView.setWebViewClient(new MyBrowser());


        url = "http://kefeed123.000webhostapp.com/displayActivity.php";
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.canGoBack();
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl(url);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
       // webView.setInitialScale((int) (getScale()));
        editText=(EditText)findViewById(R.id.editText);
        search=(Button)findViewById(R.id.button);
    }
    public void searchButtonClicked(View view) {

        url = webView.getUrl();
        webView.findAllAsync(editText.getText().toString());
        txtInfo.setText("you searched for " + editText.getText().toString());
    }

    public class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }


    }

}




