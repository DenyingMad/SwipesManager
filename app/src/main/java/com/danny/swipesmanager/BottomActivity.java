package com.danny.swipesmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;

public class BottomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        Transition transition = TransitionInflater.from(this).inflateTransition(R.transition.slide_down);
        getWindow().setEnterTransition(transition);
    }
}
