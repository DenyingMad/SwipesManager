package com.danny.swipesmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;

public class TopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        Transition transition = TransitionInflater.from(TopActivity.this).inflateTransition(R.transition.slide_up);
        getWindow().setEnterTransition(transition);
    }
}
