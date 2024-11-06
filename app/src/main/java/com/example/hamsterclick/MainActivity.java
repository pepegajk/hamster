package com.example.hamsterclick;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int score = 0;
    private TextView scoreTextView;
    private ImageButton hamsterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        scoreTextView = findViewById(R.id.scoreTextView);
        hamsterButton = findViewById(R.id.hamsterButton);


        hamsterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                updateScore();
            }
        });
    }


    private void updateScore() {
        String scoreText = "Score: " + score;
        scoreTextView.setText(scoreText);
    }
}
