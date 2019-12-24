package com.example.basketballscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int total_score_A=0;
    int total_score_B=0;
    TextView scoreView_A;
    TextView scoreView_B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreView_A = (TextView) findViewById(R.id.team_a_score);
        scoreView_B = (TextView) findViewById(R.id.team_b_score);
        displayForTeamA(total_score_A);
        displayForTeamB(total_score_B);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {

        scoreView_A.setText(String.valueOf(score));
    }
    public void button3A(View view){
        final int shot3=3;
        total_score_A+=shot3;
        scoreView_A.setText(String.valueOf(total_score_A));
    }
    public void button2A(View view){
        final int shot2=2;
        total_score_A+=shot2;
        scoreView_A.setText(String.valueOf(total_score_A));
    }
    public void buttonFreeA(View view){
        final int shotFree=1;
        total_score_A+=shotFree;
        scoreView_A.setText(String.valueOf(total_score_A));
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        scoreView_B = (TextView) findViewById(R.id.team_b_score);
        scoreView_B.setText(String.valueOf(score));
    }
    public void button3B(View view){
        final int shot3=3;
        total_score_B+=shot3;
        scoreView_B.setText(String.valueOf(total_score_B));
    }
    public void button2B(View view){
        final int shot2=2;
        total_score_B+=shot2;
        scoreView_B.setText(String.valueOf(total_score_B));
    }
    public void buttonFreeB(View view){
        final int shotFree=1;
        total_score_B+=shotFree;
        scoreView_B.setText(String.valueOf(total_score_B));
    }

    public void reset(View view){
        total_score_A=0;
        total_score_B=0;
        scoreView_A.setText(String.valueOf(total_score_A));
        scoreView_B.setText(String.valueOf(total_score_B));
    }
}
