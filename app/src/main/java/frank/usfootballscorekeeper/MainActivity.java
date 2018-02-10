package frank.usfootballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Global VAriables ----------------------------------------
    int scoreA;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Display Scores fro each Team ----------------------------------
    public void displayForTeamA(int scoreA) {
        TextView scoreViewA = findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(scoreA));
    }

    public void displayForTeamB(int scoreB) {
        TextView scoreViewB = findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreB));
    }

    //Team A button methods ---------------------------------------
    public void touchdownA(View view) {
        scoreA = scoreA + 6;
        displayForTeamA(scoreA);
    }

    public void extraPointA(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void fieldGoalA(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void safetyA(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

//Team B button methods ---------------------------------------
    public void touchdownB(View view) {
        scoreB = scoreB + 6;
        displayForTeamB(scoreB);
    }

    public void extraPointB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void fieldGoalB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void safetyB(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    //Reset Button Method ------------------------------------
    public void resetAllScores(View view) {
        scoreB = 0;
        displayForTeamB(scoreB);
        scoreA = 0;
        displayForTeamA(scoreA);
    }

}
