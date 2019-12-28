package com.danny.swipesmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;

public class LeftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left);
        Transition transition = TransitionInflater.from(LeftActivity.this).inflateTransition(R.transition.slide_left);
        getWindow().setEnterTransition(transition);
    }
}
