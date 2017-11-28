package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int userScore = 0;
    int userScoreB = 0;

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointer(View view){
        userScore = userScore + 3;
        displayForTeamA(userScore);
    }

    public void twoPointer(View view){
        userScore = userScore + 2;
        displayForTeamA(userScore);
    }

    public void freePointer(View view){
        userScore = userScore + 1;
        displayForTeamA(userScore);
    }



    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointerB(View view){
        userScoreB = userScoreB + 3;
        displayForTeamB(userScoreB);
    }

    public void twoPointerB(View view){
        userScoreB = userScoreB + 2;
        displayForTeamB(userScoreB);
    }

    public void freePointerB(View view){
        userScoreB = userScoreB + 1;
        displayForTeamB(userScoreB);
    }

    public void resetScore(View view){
        userScore = 0;
        userScoreB = 0;
        displayForTeamB(userScoreB);
        displayForTeamA(userScore);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
