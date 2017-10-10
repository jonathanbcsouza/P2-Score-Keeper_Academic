package com.example.android.soccerscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.soccerscore.R;

public class MainActivity extends AppCompatActivity {

    int golsTeamA = 0;
    int golsTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;
    int yellowCardsTeamA = 0;
    int yellowCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayGolsForTeamA(0);
        displayGolsForTeamB(0);
        displayFoulsForTeamA(0);
        displayFoulsForTeamB(0);
        displayYellowCArdsForTeamA(0);
        displayYellowCArdsForTeamB(0);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addGolsForTeamA(View v) {
        golsTeamA = golsTeamA + 1;
        displayGolsForTeamA(golsTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addFoulsForTeamA(View v) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsForTeamA(foulsTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addYellowCardsForTeamA(View v) {
        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayYellowCArdsForTeamA(yellowCardsTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayGolsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text1teamA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text2teamA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowCArdsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text3teamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayGolsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text1teamB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text2teamB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowCArdsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text3teamB);
        scoreView.setText(String.valueOf(score));
    }


    public void addGolsForTeamB(View v) {
        golsTeamB = golsTeamB + 1;
        displayGolsForTeamB(golsTeamB);
    }

    public void addFoulsForTeamB(View v) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsForTeamB(foulsTeamB);
    }

    public void addYellowCardsForTeamB(View v) {
        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayYellowCArdsForTeamB(yellowCardsTeamB);
    }

    public void resetScore(View v) {
        golsTeamA = 0;
        displayGolsForTeamA(golsTeamA);
        golsTeamB = 0;
        displayGolsForTeamB(golsTeamB);

        foulsTeamA = 0;
        displayFoulsForTeamA(foulsTeamA);
        foulsTeamB = 0;
        displayFoulsForTeamB(foulsTeamB);

        yellowCardsTeamA = 0;
        displayYellowCArdsForTeamA(yellowCardsTeamA);
        yellowCardsTeamB = 0;
        displayYellowCArdsForTeamB(yellowCardsTeamB);
    }

}