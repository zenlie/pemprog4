package com.pemprog4.counterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.lang.Math;

public class Score extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
    }

    public void tampil(int z) {
        dzikir.setText("" + z);
    }
//    public class MaxMin{
//        public static void main(String[] args){
//            int zikir, angka2, angka3, maks;
//            zikir = 10;
//            angka2 = 300;
//            angka3 = 20;
//
//            maks = Math.max(angka1, angka2);
//            if (angka3 > maks) {
//                maks = angka3;
//            }
//            System.out.println("Angka maksimum adalah= "+maks);
//        }
//    }

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