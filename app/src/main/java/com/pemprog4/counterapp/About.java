package com.pemprog4.counterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class About extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.home) {
            Intent intent = new Intent(About.this, MainActivity.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.about) {
            Intent intent = new Intent(About.this, About.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.full_assistant) {
            Intent intent = new Intent(About.this, FullAssistant.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}