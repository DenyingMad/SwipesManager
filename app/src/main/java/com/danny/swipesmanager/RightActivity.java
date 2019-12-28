package com.danny.swipesmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;

public class RightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right);
        Transition transition = TransitionInflater.from(RightActivity.this).inflateTransition(R.transition.slide_right);
        getWindow().setEnterTransition(transition);
    }
}
