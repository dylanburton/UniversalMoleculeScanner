package com.example.universalmoleculescanner;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
/*
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };
*/
    /**
     * Directs user to the scan picture activity.
     */
    private void goToScanner() {
        Intent intent = new Intent(this, ScanPicture.class);
        startActivity(intent);
    }

    /**
     * Directs user to the browse library activity.
     */
    private void goToBrowseLibrary() {
        Intent intent = new Intent(this, LibraryBrowser.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mTextMessage = findViewById(R.id.message);
        //BottomNavigationView navigation = findViewById(R.id.navigation);
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        final Button browseButton = findViewById(R.id.browseButton);
        browseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToBrowseLibrary();
            }
        });

        final Button scanButton = findViewById(R.id.scanButton);
        scanButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToScanner();
            }
        });

    }

}
