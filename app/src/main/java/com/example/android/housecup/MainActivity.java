package com.example.android.housecup;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreRavenclaw = 0;
    int scoreHufflepuff = 0;
    int scoreGryffindor = 0;
    int scoreSlytherin = 0;

    TextView ravenClawScoreView;
    TextView hufflepuffScoreView;
    TextView gryffindorScoreView;
    TextView slytherinScoreView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ravenClawScoreView = (TextView) findViewById(R.id.ravenclaw_score);
        hufflepuffScoreView = (TextView) findViewById(R.id.hufflepuff_score);
        gryffindorScoreView = (TextView) findViewById(R.id.gryffindor_score);
        slytherinScoreView = (TextView) findViewById(R.id.slytherin_score);
    }


    /**
     * Displays the given score for Ravenclaw.
     */
    public void displayForRavenclaw(int score) {
        ravenClawScoreView.setText(String.valueOf(score));
    }

    /**
     * Update points on button click
     */
    public void add50toRavenclaw(View v) {
        scoreRavenclaw+= 50;
        displayForRavenclaw(scoreRavenclaw);
    }

    public void add10toRavenclaw(View v) {
        scoreRavenclaw+= 10;
        displayForRavenclaw(scoreRavenclaw);
    }

    public void add5toRavenclaw(View v) {
        scoreRavenclaw+= 5;
        displayForRavenclaw(scoreRavenclaw);
    }

    public void deduct5fromRavenclaw(View v) {
        if (scoreRavenclaw>= 5){
            scoreRavenclaw-= 5;
        }
        displayForRavenclaw(scoreRavenclaw);
    }

    public void deduct10fromRavenclaw(View v) {
        if (scoreRavenclaw>= 10){
            scoreRavenclaw-= 10;
        }
        displayForRavenclaw(scoreRavenclaw);
    }


    /**
     * Displays the given score for Hufflepuff.
     */
    public void displayForHufflepuff(int score) {

        hufflepuffScoreView.setText(String.valueOf(score));
    }

    /**
     * Update points on button click
     */
    public void add50toHufflepuff(View v) {
        scoreHufflepuff+= 50;
        displayForHufflepuff(scoreHufflepuff);
    }

    public void add10toHufflepuff(View v) {
        scoreHufflepuff+= 10;
        displayForHufflepuff(scoreHufflepuff);
    }

    public void add5toHufflepuff(View v) {
        scoreHufflepuff+= 5;
        displayForHufflepuff(scoreHufflepuff);
    }

    public void deduct5fromHufflepuff(View v) {
        if (scoreHufflepuff>= 5){
            scoreHufflepuff-= 5;
        }
        displayForHufflepuff(scoreHufflepuff);
    }

    public void deduct10fromHufflepuff(View v) {
        if (scoreHufflepuff>= 10){
            scoreHufflepuff-= 10;
        }
        displayForHufflepuff(scoreHufflepuff);
    }


    /**
     * Displays the given score for Gryffindor.
     */
    public void displayForGryffindor(int score) {
        gryffindorScoreView.setText(String.valueOf(score));
    }

    /**
     * Update points on button click
     */
    public void add50toGryffindor(View v) {
        scoreGryffindor+= 50;
        displayForGryffindor(scoreGryffindor);
    }

    public void add10toGryffindor(View v) {
        scoreGryffindor+= 10;
        displayForGryffindor(scoreGryffindor);
    }

    public void add5toGryffindor(View v) {
        scoreGryffindor+= 5;
        displayForGryffindor(scoreGryffindor);
    }

    public void deduct5fromGryffindor(View v) {
        if (scoreGryffindor>= 5){
            scoreGryffindor-= 5;
        }
        displayForGryffindor(scoreGryffindor);
    }

    public void deduct10fromGryffindor(View v) {
        if (scoreGryffindor>= 10){
            scoreGryffindor-= 10;
        }
        displayForGryffindor(scoreGryffindor);
    }

    /**
     * Displays the given score for Slytherin.
     */
    public void displayForSlytherin(int score) {
        slytherinScoreView.setText(String.valueOf(score));
    }

    /**
     * Update points on button click
     */
    public void add50toSlytherin(View v) {
        scoreSlytherin+= 50;
        displayForSlytherin(scoreSlytherin);
    }

    public void add10toSlytherin(View v) {
        scoreSlytherin+= 10;
        displayForSlytherin(scoreSlytherin);
    }

    public void add5toSlytherin(View v) {
        scoreSlytherin+= 5;
        displayForSlytherin(scoreSlytherin);
    }

    public void deduct5fromSlytherin(View v) {
        if (scoreSlytherin>= 5) {
            scoreSlytherin-= 5;
        }
        displayForSlytherin(scoreSlytherin);
    }

    public void deduct10fromSlytherin(View v) {
        if (scoreSlytherin>= 10) {
            scoreSlytherin-= 10;
        }
        displayForSlytherin(scoreSlytherin);
    }

    /**
     * Reset points for all houses
     */
    public void reset(View v){
        scoreRavenclaw = 0;
        scoreHufflepuff = 0;
        scoreGryffindor = 0;
        scoreSlytherin = 0;
        displayForSlytherin(scoreSlytherin);
        displayForGryffindor(scoreGryffindor);
        displayForHufflepuff(scoreHufflepuff);
        displayForRavenclaw(scoreRavenclaw);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putInt("currentScoreRavenclaw", scoreRavenclaw);
        savedInstanceState.putInt("currentScoreHufflepuff", scoreHufflepuff);
        savedInstanceState.putInt("currentScoreGryffindor", scoreGryffindor);
        savedInstanceState.putInt("currentScoreSlytherin", scoreSlytherin);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        scoreRavenclaw = savedInstanceState.getInt("currentScoreRavenclaw");
        scoreHufflepuff = savedInstanceState.getInt("currentScoreHufflepuff");
        scoreGryffindor = savedInstanceState.getInt("currentScoreGryffindor");
        scoreSlytherin = savedInstanceState.getInt("currentScoreSlytherin");
    }
}
