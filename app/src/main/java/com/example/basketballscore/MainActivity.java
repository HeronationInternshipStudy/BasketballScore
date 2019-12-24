package com.example.basketballscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int total_score=0;
    TextView scoreView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(total_score);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void button3(View view){
        total_score+=3;
        scoreView.setText(String.valueOf(total_score));
    }
    public void button2(View view){
        total_score+=2;
        scoreView.setText(String.valueOf(total_score));
    }
    public void buttonFree(View view){
        total_score+=1;
        scoreView.setText(String.valueOf(total_score));
    }
}
