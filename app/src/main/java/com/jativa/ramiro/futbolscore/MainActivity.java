package com.jativa.ramiro.futbolscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int total_team_a_gol = 0, total_team_a_tarjeta_roja = 0, total_team_a_tarjeta_amarilla = 0;
    int total_team_b_gol = 0, total_team_b_tarjeta_roja = 0, total_team_b_tarjeta_amarilla = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Display scores for Team A
        displayGoalForTeamA(0);
        displayTarjetaRojaForTeamA(0);
        displayTarjetaAmarillaForTeamA(0);
        // Display score for Team B
        displayGoalForTeamB(0);
        displayTarjetaRojaForTeamB(0);
        displayTarjetaAmarillaForTeamB(0);


    }
    public void resetScore(View v){

        // reset score for Team A
        displayGoalForTeamA(0);
        displayTarjetaRojaForTeamA(0);
        displayTarjetaAmarillaForTeamA(0);

        total_team_a_gol = 0;
        total_team_a_tarjeta_roja = 0;
        total_team_a_tarjeta_amarilla = 0;

        // reset score for Team B
        displayGoalForTeamB(0);
        displayTarjetaRojaForTeamB(0);
        displayTarjetaAmarillaForTeamB(0);
        total_team_b_gol = 0;
        total_team_b_tarjeta_roja = 0;
        total_team_b_tarjeta_amarilla = 0;



    }
    /**
     * Displays the given score for Team A.
     */

    public void addGoalForTeamA(View v) {
        total_team_a_gol = total_team_a_gol + 1;
        displayGoalForTeamA(total_team_a_gol);
    }
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_gol);
        scoreView.setText(String.valueOf(score));
    }

    public void addTarjetaRojaForTeamA(View v) {
        total_team_a_tarjeta_roja = total_team_a_tarjeta_roja + 1;
        displayTarjetaRojaForTeamA(total_team_a_tarjeta_roja);
    }
    public void displayTarjetaRojaForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_tarjetaroja);
        scoreView.setText(String.valueOf(score));
    }

    public void addTarjetaAmarillaForTeamA(View v) {
        total_team_a_tarjeta_amarilla = total_team_a_tarjeta_amarilla + 1;
        displayTarjetaAmarillaForTeamA(total_team_a_tarjeta_amarilla);
    }
    public void displayTarjetaAmarillaForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_tarjetaamarilla);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */

    public void addGoalForTeamB(View v) {
        total_team_b_gol = total_team_b_gol + 1;
        displayGoalForTeamB(total_team_b_gol);
    }
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_gol);
        scoreView.setText(String.valueOf(score));
    }
    public void addTarjetaRojaForTeamB(View v) {
        total_team_b_tarjeta_roja = total_team_b_tarjeta_roja + 1;
        displayTarjetaRojaForTeamB(total_team_b_tarjeta_roja);
    }
    public void displayTarjetaRojaForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_tarjetaroja);
        scoreView.setText(String.valueOf(score));
    }
    public void addTarjetaAmarillaForTeamB(View v) {
        total_team_b_tarjeta_amarilla = total_team_b_tarjeta_amarilla + 1;
        displayTarjetaAmarillaForTeamB(total_team_b_tarjeta_amarilla);
    }
    public void displayTarjetaAmarillaForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_tarjetaamarilla);
        scoreView.setText(String.valueOf(score));
    }
}
