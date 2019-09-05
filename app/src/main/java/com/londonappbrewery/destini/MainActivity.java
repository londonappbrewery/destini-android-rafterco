package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyText;
    Button buttonAnswer1;
    Button buttonAnswer2;
    int storyIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyText = findViewById(R.id.storyTextView);
        buttonAnswer1 = findViewById(R.id.buttonTop);
        buttonAnswer2 = findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (storyIndex == 0) {
                    storyText.setText(R.string.T3_Story);
                    buttonAnswer1.setText(R.string.T3_Ans1);
                    buttonAnswer2.setText(R.string.T3_Ans2);

                    storyIndex = 3;
                } else if (storyIndex == 2) {

                    storyText.setText(R.string.T2_Story);
                    buttonAnswer1.setText(R.string.T2_Ans1);
                    buttonAnswer2.setText(R.string.T2_Ans2);

                    storyIndex = 3;
                } else if (storyIndex == 3) {
                    storyText.setText(R.string.T3_Story);
                    buttonAnswer1.setText(R.string.T3_Ans1);
                    buttonAnswer2.setText(R.string.T3_Ans2);

                    storyIndex = 6;
                } else if (storyIndex == 4) {
                    storyText.setText(R.string.T4_End);
                    buttonAnswer1.setVisibility(View.GONE);
                    buttonAnswer2.setVisibility(View.GONE);
                } else if (storyIndex == 5) {
                    storyText.setText(R.string.T5_End);
                    buttonAnswer1.setVisibility(View.GONE);
                    buttonAnswer2.setVisibility(View.GONE);
                } else if (storyIndex == 6) {
                    storyText.setText(R.string.T6_End);
                    buttonAnswer1.setVisibility(View.GONE);
                    buttonAnswer2.setVisibility(View.GONE);
                }

            }
        });

        buttonAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (storyIndex == 0) {
                    storyText.setText(R.string.T2_Story);
                    buttonAnswer1.setText(R.string.T2_Ans1);
                    buttonAnswer2.setText(R.string.T2_Ans2);

                    storyIndex = 2;
                } else if (storyIndex == 2) {
                    storyText.setText(R.string.T2_Story);
                    buttonAnswer1.setText(R.string.T2_Ans1);
                    buttonAnswer2.setText(R.string.T2_Ans2);

                    storyIndex = 4;

                } else if (storyIndex == 3) {
                    storyText.setText(R.string.T3_Story);
                    buttonAnswer1.setText(R.string.T3_Ans1);
                    buttonAnswer2.setText(R.string.T3_Ans2);

                    storyIndex = 5;

                } else if (storyIndex == 4) {
                    storyText.setText(R.string.T4_End);
                    buttonAnswer1.setVisibility(View.GONE);
                    buttonAnswer2.setVisibility(View.GONE);
                } else if (storyIndex == 5) {
                    storyText.setText(R.string.T5_End);
                    buttonAnswer1.setVisibility(View.GONE);
                    buttonAnswer2.setVisibility(View.GONE);
                } else if (storyIndex == 6) {
                    storyText.setText(R.string.T6_End);
                    buttonAnswer1.setVisibility(View.GONE);
                    buttonAnswer2.setVisibility(View.GONE);
                }
            }
        });
    }
}
