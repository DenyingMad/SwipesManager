package com.danny.swipesmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private GestureDetector gestureDetector;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);
        getWindow().setAllowEnterTransitionOverlap(false);
        gestureDetector = new GestureDetector(this, new OnSwipeListener() {
            @Override
            public void OnSlideRight() {
                Transition transition_right = TransitionInflater.from(MainActivity.this).inflateTransition(R.transition.slide_right);
                getWindow().setExitTransition(transition_right);
                Intent intent = new Intent(MainActivity.this, LeftActivity.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                startActivity(intent, options.toBundle());
            }

            @Override
            public void OnSlideLeft() {
                Transition transition_left = TransitionInflater.from(MainActivity.this).inflateTransition(R.transition.slide_left);
                getWindow().setExitTransition(transition_left);
                Intent intent = new Intent(MainActivity.this, RightActivity.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                startActivity(intent, options.toBundle());
            }

            @Override
            public void OnSlideUp() {
                Transition transition_up = TransitionInflater.from(MainActivity.this).inflateTransition(R.transition.slide_up);
                getWindow().setExitTransition(transition_up);
                Intent intent = new Intent(MainActivity.this, BottomActivity.class);
                intent.putExtra("animation", "slide_up");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                startActivity(intent, options.toBundle());
            }

            @Override
            public void OnSlideDown() {
                Transition transition_down = TransitionInflater.from(MainActivity.this).inflateTransition(R.transition.slide_down);
                getWindow().setExitTransition(transition_down);
                Intent intent = new Intent(MainActivity.this, TopActivity.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                startActivity(intent, options.toBundle());
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Transition transition_up = TransitionInflater.from(MainActivity.this).inflateTransition(R.transition.fade);
                getWindow().setExitTransition(transition_up);
                Intent intent = new Intent(MainActivity.this, BottomActivity.class);
                intent.putExtra("animation", "on_click");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                startActivity(intent, options.toBundle());
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(this.gestureDetector.onTouchEvent(event))
            return true;
        else
            return super.onTouchEvent(event);
    }
}
