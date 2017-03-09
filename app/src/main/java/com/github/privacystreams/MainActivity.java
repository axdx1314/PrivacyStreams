package com.github.privacystreams;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    public Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        android.content.Context context;                                    // For the google service api

        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MyAsyncTask().execute();
            }
        });
    }

    private class MyAsyncTask extends AsyncTask<Object, Object, Object> {
        @Override
        protected Object doInBackground(Object[] objects) {
            UseCases useCases = new UseCases(MainActivity.this);

            useCases.testContacts();
            useCases.testMockData();
//            useCases.testTextEntry();
//
//            useCases.testBrowserSearchUpdates();
//            useCases.testBrowserHistoryUpdates();
//            useCases.testWifiUpdates(30);
//
//            useCases.testLightUpdatesProvider();
//            useCases.testBlueToothUpatesProvider();
//            useCases.testPhysicalMotionUpdatesProvider();
//            useCases.testLightUpdatesProvider();
//
//            useCases.testUIAction();
//            useCases.testIMUpdates();
            return null;
        }
    }
}