package com.pemprog4.counterapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    TextView dzikir;
    int zikir = 0;
    Vibrator vibe;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dzikir = (TextView) findViewById(R.id.dzikir);
        vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
    }

    public void subhanallah(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tasbih);
        mediaPlayer.start();
        zikir = zikir + 1;
        tampil(zikir);
        vibe.vibrate(100);
    }

    public void alhamdulillah(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tahmid);
        mediaPlayer.start();
        zikir = zikir + 1;
        tampil(zikir);
        vibe.vibrate(100);
    }

    public void lailahaillallah(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tahlil);
        mediaPlayer.start();
        zikir = zikir + 1;
        tampil(zikir);
        vibe.vibrate(100);
    }

    public void allahuakbar(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.takbir);
        mediaPlayer.start();
        zikir = zikir + 1;
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
            Intent intent = new Intent(Score.this, MainActivity.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.about) {
            Intent intent = new Intent(Score.this, About.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.score) {
            Intent intent = new Intent(Score.this, Score.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}