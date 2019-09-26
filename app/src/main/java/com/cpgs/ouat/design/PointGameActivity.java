package com.cpgs.ouat.design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PointGameActivity extends AppCompatActivity {

    TextView scoreTeamATextView,scoreTeamBTextView;
    int scoreTeamA = 0,scoreTeamB = 0;
    Button plusOneTeamABtn,plusTwoTeamABtn,plusThreeTeamABtn,plusOneTeamBBtn,plusTwoTeamBBtn,
            plusThreeTeamBBtn,resetBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point_game);

        scoreTeamATextView = findViewById(R.id.total_score_txt_team_a);
        scoreTeamBTextView = findViewById(R.id.total_score_txt_team_b);
        plusOneTeamABtn = findViewById(R.id.score_1_team_a_btn);
        plusOneTeamBBtn = findViewById(R.id.score_1_team_b_btn);
        plusTwoTeamABtn = findViewById(R.id.score_2_team_a_btn);
        plusTwoTeamBBtn = findViewById(R.id.score_2_team_b_btn);
        plusThreeTeamABtn = findViewById(R.id.score_3_team_a_btn);
        plusThreeTeamBBtn = findViewById(R.id.score_3_team_b_btn);
        resetBtn = findViewById(R.id.reset_btn);


        plusOneTeamABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore(1,"A");
            }
        });

        plusOneTeamBBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore(1,"B");
            }
        });

        plusTwoTeamABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore(2,"A");
            }
        });

        plusTwoTeamBBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore(2,"B");
            }
        });

        plusThreeTeamABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore(3, "A");
            }
        });

        plusThreeTeamBBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore(3,"B");
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetScore();
            }
        });
    }

    /***
     * Add Score According to team
     * @param score
     * @param teamName
     */
    public void addScore(int score,String teamName){
        if ("A".equals(teamName)){
            scoreTeamA += score;
            scoreTeamATextView.setText(String.valueOf(scoreTeamA));
        }else{
            scoreTeamB += score;
            scoreTeamBTextView.setText(String.valueOf(scoreTeamB));
        }
    }

    /**
     * Reset The score
     */
    public void resetScore(){
        scoreTeamA = 0 ; scoreTeamB = 0 ;
        scoreTeamATextView.setText("0");
        scoreTeamBTextView.setText("0");
    }
}
