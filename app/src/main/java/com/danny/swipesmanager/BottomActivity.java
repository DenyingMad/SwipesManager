package com.danny.swipesmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;

public class BottomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        Intent intent = getIntent();
        if(intent.getStringExtra("animation").equals("slide_up")){
            Transition transition = TransitionInflater.from(this).inflateTransition(R.transition.slide_down);
            getWindow().setEnterTransition(transition);
        }
        else if(intent.getStringExtra("animation").equals("on_click")){
            Transition transition = TransitionInflater.from(this).inflateTransition(R.transition.fade);
            getWindow().setEnterTransition(transition);
        }


    }
}
