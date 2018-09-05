package com.example.android.harrypotterquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.CheckBox;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the score for the quiz when submit button is clicked
     */
    public void submitQuiz(View view) {
        int totalScore = calculateScore();
        String resultsScore = "You scored " + totalScore + " out of 6!";
        Toast.makeText(this, resultsScore, Toast.LENGTH_LONG).show();
    }

    /**
     * Calculates the score.
     */
    public int calculateScore() {

        return questionOne() + questionTwo() + questionThree() + questionFour() + questionFive() + questionSix();
    }

    /**
     * Correct answer for question 1, finding the Radiobutton view id and storing in a variable
     */

    public int questionOne() {

        RadioButton q1RadioButton1 = findViewById(R.id.radio_points);
        RadioButton q1RadioButton2 = findViewById(R.id.radio_keeper);
        RadioButton q1RadioButton3 = findViewById(R.id.radio_snitch);
        RadioButton q1RadioButton4 = findViewById(R.id.radio_quaffle);

        int score;

        if (q1RadioButton3.isChecked()) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }


    /**
     * Correct answers for question 2
     */

    public int questionTwo() {
        CheckBox q2Checkbox1 = findViewById(R.id.checkbox_crookshanks);
        CheckBox q2Checkbox2 = findViewById(R.id.checkbox_fluffy);
        CheckBox q2Checkbox3 = findViewById(R.id.checkbox_fang);
        CheckBox q2Checkbox4 = findViewById(R.id.checkbox_hedwig);
        CheckBox q2Checkbox5 = findViewById(R.id.checkbox_nearly_headless_nick);
        CheckBox q2Checkbox6 = findViewById(R.id.checkbox_three_headed_dog);

        int score;
        if (q2Checkbox2.isChecked()) q2Checkbox6.isChecked();
        {
            score = 1;
        }

        return score;
    }

    /**
     * Correct answer for question 3
     */
    public int questionThree() {
        RadioButton q3RadioButton1 = findViewById(R.id.radio_chineseFireball);
        RadioButton q3RadioButton2 = findViewById(R.id.radio_commonGreenWelsh);
        RadioButton q3RadioButton3 = findViewById(R.id.radio_swedishShortSnout);
        RadioButton q3RadioButton4 = findViewById(R.id.radio_hungarianHorntail);
        int score;

        if (q3RadioButton4.isChecked()) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }


    /**
     * Correct answer for question 4
     */

    public int questionFour() {
        EditText q4Answer = findViewById(R.id.ghost_of_Slytherin);
        String text = q4Answer.getText().toString();

        int score;
        if (text.equalsIgnoreCase("The Bloody Baron")) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }

    /**
     * Correct answer for question 5
     */
    public int questionFive() {
        RadioButton q5RadioButton1 = findViewById(R.id.radio_sword_of_griff);
        RadioButton q5RadioButton2 = findViewById(R.id.radio_cloak_of_invisibility);
        RadioButton q5RadioButton3 = findViewById(R.id.radio_elder_wand);
        RadioButton q5RadioButton4 = findViewById(R.id.radio_res_stone);

        int score;
        if (q5RadioButton2.isChecked()) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }

    /**
     * Correct answer for question 6
     */
    private int questionSix() {
        RadioButton q6RadioButton1 = findViewById(R.id.radio_Harry_Potter);
        RadioButton q6RadioButton2 = findViewById(R.id.radio_Severus_Snape);
        RadioButton q6RadioButton3 = findViewById(R.id.radio_Tom_Riddle);
        RadioButton q6RadioButton4 = findViewById(R.id.radio_Draco_Malfoy);

        int score;

        if (q6RadioButton2.isChecked()) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }
}