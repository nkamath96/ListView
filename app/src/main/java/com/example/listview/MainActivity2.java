package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        webView=(WebView)findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        Intent intent = getIntent();
        Bundle bundle=intent.getExtras();
        String data=bundle.getString("sid");

        switch (data) {
            case "Harry Potter And The Philosopher's Stone":
                webView.loadUrl("https://en.wikipedia.org/wiki/Harry_Potter_and_the_Philosopher%27s_Stone");
                break;
            case "To Kill A Mocking Bird":
                webView.loadUrl("https://en.wikipedia.org/wiki/To_Kill_a_Mockingbird");
                break;
            case "Angels and Demons":
                webView.loadUrl("https://en.wikipedia.org/wiki/Angels_%26_Demons");
                break;
            case "A Thousand Splendid Suns":
                webView.loadUrl("https://en.wikipedia.org/wiki/A_Thousand_Splendid_Suns");
                break;
            case "Who Moved My Cheese":
                webView.loadUrl("https://en.wikipedia.org/wiki/Who_Moved_My_Cheese%3F");
                break;
            case "To Sir With Love":
                webView.loadUrl("https://en.wikipedia.org/wiki/To_Sir,_With_Love_(novel)");
                break;
            case "Dharma":
                webView.loadUrl("https://en.wikipedia.org/wiki/Dharma:_Decoding_the_Epics_for_a_Meaningful_Life");
                break;
            case "Murder on the Orient Express":
                webView.loadUrl("https://en.wikipedia.org/wiki/Murder_on_the_Orient_Express");
                break;
            case "Eat That Frog":
                webView.loadUrl("https://en.wikipedia.org/wiki/Brian_Tracy");
                break;
            case "Harry Potter And The Chamber of Secrets":
                webView.loadUrl("https://en.wikipedia.org/wiki/Harry_Potter_and_the_Chamber_of_Secrets");
                break;
            case "The Hound of Baskerville":
                webView.loadUrl("https://en.wikipedia.org/wiki/The_Hound_of_the_Baskervilles");
                break;
            case "The Exorcist":
                webView.loadUrl("https://en.wikipedia.org/wiki/The_Exorcist_(novel)");
                break;
            case "Adventures of Huckleberry Finn":
                webView.loadUrl("https://en.wikipedia.org/wiki/Adventures_of_Huckleberry_Finn");
                break;
            case "The Kite Runner":
                webView.loadUrl("https://en.wikipedia.org/wiki/The_Kite_Runner");
                break;
            case "The Seven Habits of Highly Effective People":
                webView.loadUrl("https://en.wikipedia.org/wiki/The_7_Habits_of_Highly_Effective_People");
                break;
            case "Atomic Habits":
                webView.loadUrl("https://en.wikipedia.org/wiki/The_Power_of_Habit");
                break;
        }

    }

    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
        return;
    }
}