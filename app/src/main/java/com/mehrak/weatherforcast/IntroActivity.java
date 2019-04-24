package com.mehrak.weatherforcast;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        ViewPager introPager = findViewById(R.id.intropager);
        IntroPagerAdapter introPagerAdapter = new IntroPagerAdapter(getSupportFragmentManager());
        introPager.setAdapter(introPagerAdapter);
    }
}
