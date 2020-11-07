package com.pemprog4.counterapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView dzikir;
    int zikir = 0;
    Vibrator vibe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dzikir = (TextView) findViewById(R.id.dzikir);
        vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
    }

    public void counter(View view) {
        zikir = zikir + 1;
        tampil(zikir);
        vibe.vibrate(100);
    }

    public void reset(View view) {
        zikir = 0;
        tampil(zikir);
        vibe.vibrate(100);
    }

    public void tampil(int z) {
        dzikir.setText("" + z);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.home) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.about) {
            Intent intent = new Intent(MainActivity.this, About.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.full_assistant) {
            Intent intent = new Intent(MainActivity.this, FullAssistant.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}