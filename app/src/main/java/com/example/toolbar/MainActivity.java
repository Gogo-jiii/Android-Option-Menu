package com.example.toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);

        toolbar.setNavigationOnClickListener(v -> {
            Toast.makeText(this, "back icon clicked.", Toast.LENGTH_SHORT).show();
        });

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.one:
                        Toast.makeText(MainActivity.this, "one clicked.", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.bluetooth:
                        Toast.makeText(MainActivity.this, "bluetooth clicked.",
                                Toast.LENGTH_SHORT).show();
                        return true;
                }
                return false;
            }
        });
    }
}