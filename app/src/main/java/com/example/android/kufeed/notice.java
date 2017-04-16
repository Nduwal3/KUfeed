package com.example.android.kufeed;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import static com.example.android.kufeed.R.id.txtInfo;
import static com.example.android.kufeed.R.id.webView;

public class notice extends AppCompatActivity {
    Button search;
    EditText editText;
    TextView txt;
    public WebView webView;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        editText=(EditText)findViewById(R.id.editText);
        search=(Button)findViewById(R.id.button);
        txt=(TextView)findViewById(R.id.txtInfo);
        webView=(WebView)findViewById(R.id.webView);
        webView.setWebViewClient(new MyBrowser());


        url = "http://www.ku.edu.np/news/index.php?op=Default&postCategoryId=3&blogId=1";
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl(url);
         txt.setText("Notices & Announcements");
    }

    public void searchButtonClicked(View view) {

        url = webView.getUrl();
        webView.findAllAsync(editText.getText().toString());
        txt.setText("you searched for " + editText.getText().toString());
    }

    public class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }


        @Override
        public void onPageFinished(WebView view, String url)
        {
            view.loadUrl("javascript:(function() { " +
                    "document.getElementById('Menu').style.display=\"none\"; " +
                    "document.getElementById('Content').style.width=\"99%\";"+
                    "document.getElementById('Bottommenu').style.display=\"none\"; " +
                    "document.getElementById('Bottom').style.display=\"none\"; " +
                    "document.getElementById('Title').style.display=\"none\"; " +
                    "document.getElementById('Subtitle').style.display=\"none\"; " +
                    "document.getElementsByTagName('h2')[0].style.display=\"none\"; " +
                    "document.getElementsByTagName('img')[0].style.width=\"100%\";"+
                    "})()");
            view.findAllAsync("");
        }

    }

    @Override
    public boolean onKeyDown(int KeyCode, KeyEvent event)
    {
        if(event.getAction()==KeyEvent.ACTION_DOWN){
            switch (KeyCode){
                case KeyEvent.KEYCODE_BACK:
                    if(webView.canGoBack())
                        webView.goBack();
                    else
                        finish();
                    return true;
            }
        }
        return super.onKeyDown(KeyCode,event);
    }
}
