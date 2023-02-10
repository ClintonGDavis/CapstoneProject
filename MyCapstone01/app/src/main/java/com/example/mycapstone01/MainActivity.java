package com.example.mycapstone01;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView loveStandardTextView;
    private TextView workStandardTextView;
    private TextView learningStandardTextView;
    private TextView playStandardTextView;
    private TextView healthStandardTextView;
    private TextView safetyStandardTextView;
    private TextView loveScoreTextView;
    private TextView workScoreTextView;
    private TextView learningScoreTextView;
    private TextView playScoreTextView;
    private TextView healthScoreTextView;
    private TextView safetyScoreTextView;
    private Button updateButton;
    private BalancedLiving balancedLiving;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loveStandardTextView = findViewById(R.id.love_standard_text_view);
        workStandardTextView = findViewById(R.id.work_standard_text_view);
        learningStandardTextView = findViewById(R.id.learning_standard_text_view);
        playStandardTextView = findViewById(R.id.play_standard_text_view);
        healthStandardTextView = findViewById(R.id.health_standard_text_view);
        safetyStandardTextView = findViewById(R.id.safety_standard_text_view);
        loveScoreTextView = findViewById(R.id.love_score_text_view);
        workScoreTextView = findViewById(R.id.work_score_text_view);
        learningScoreTextView = findViewById(R.id.learning_score_text_view);
        playScoreTextView = findViewById(R.id.play_score_text_view);
        healthScoreTextView = findViewById(R.id.health_score_text_view);
        safetyScoreTextView = findViewById(R.id.safety_score_text_view);
        updateButton = findViewById(R.id.update_button);

        balancedLiving = new BalancedLiving();
        balancedLiving.setLoveStandard("Love Standard");
        balancedLiving.setWorkStandard("Work Standard");
        balancedLiving.setLearningStandard("Learning Standard");
        balancedLiving.setPlayStandard("Play Standard");
        balancedLiving.setHealthStandard("Health Standard");
        balancedLiving.setSafetyStandard("Safety Standard");

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loveStandardTextView.setText(balancedLiving.getLoveStandard());
                workStandardTextView.setText(balancedLiving.getWorkStandard());
                learningStandardTextView.setText(balancedLiving.getLearningStandard());
                playStandardTextView.setText(balancedLiving.getPlayStandard());
                healthStandardTextView.setText(balancedLiving.getHealthStandard());
                safetyStandardTextView.setText(balancedLiving.getSafetyStandard());
                loveScoreTextView.setText(balancedLiving.getLoveScore());
                workScoreTextView.setText(balancedLiving.getWorkScore());
                learningScoreTextView.setText(balancedLiving.getLearningScore());
                playScoreTextView.setText(balancedLiving.getPlayScore());
                healthScoreTextView.setText(balancedLiving.getHealthScore());
                safetyScoreTextView.setText(balancedLiving.getSafetyScore());
            }
        });
    }
}