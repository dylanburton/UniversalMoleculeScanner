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
