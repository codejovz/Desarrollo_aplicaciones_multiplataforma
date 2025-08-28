package com.example.ejer7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Arrays;
public class MainActivity extends AppCompatActivity {

    private int actQuest = 1;

    private double correct = 0.0, incorrect = 0.0;

    private String[] questions = {
            "First question",
            "Second question",
            "Third question"
    };

    private String[] answers = {
            "Answer 1.1", "Answer 1.2", "Answer 1.3", "Answer 1.4",
            "Answer 2.1", "Answer 2.2", "Answer 2.3", "Answer 2.4",
            "Answer 3.1", "Answer 3.2", "Answer 3.3", "Answer 3.4"
    };

    private boolean[] isCorrect = {      //respuestas validas
            true, false, false, false,
            true, false, true, false,
            true, false, false, true
    };

    private boolean[] isCheked = {      //ck en diferentes preguntas
            false, false, false, false,
            false, false, false, false,
            false, false, false, false
    };

    private boolean[] corrected = {
            false, false, false
    };

    private TextView tvNumQuestion, tvTitle, tvCor, tvIncor, tvA1, tvA2, tvA3, tvA4;
    private Button btnPrev, btnRev, btnNext;
    private CheckBox ck1, ck2, ck3, ck4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tvCor = findViewById(R.id.tvCor);
        tvIncor = findViewById(R.id.tvIncor);


        tvTitle = findViewById(R.id.tvTitle);
        tvTitle.setText(questions[0]);
        tvNumQuestion = findViewById(R.id.tvNumQuestion);
        tvA1 = findViewById(R.id.tvA1);
        tvA1.setText(answers[0]);
        tvA2 = findViewById(R.id.tvA2);
        tvA2.setText(answers[1]);
        tvA3 = findViewById(R.id.tvA3);
        tvA3.setText(answers[2]);
        tvA4 = findViewById(R.id.tvA4);
        tvA4.setText(answers[3]);

        btnPrev = findViewById(R.id.btnPrev);
        btnPrev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                actQuest = actQuest - 1;
                if(corrected[actQuest - 1] == false){
                    btnRev.setEnabled(true);
                }else{
                    btnRev.setEnabled(false);
                }
                tvNumQuestion.setText("QUESTION " + Integer.toString(actQuest));
                tvTitle.setText(questions[actQuest - 1]);
                tvA1.setText(answers[actQuest*4-4]);
                tvA2.setText(answers[actQuest*4-3]);
                tvA3.setText(answers[actQuest*4-2]);
                tvA4.setText(answers[actQuest*4-1]);

                ck1.setChecked(isCheked[actQuest*4-4]);
                ck2.setChecked(isCheked[actQuest*4-3]);
                ck3.setChecked(isCheked[actQuest*4-2]);
                ck4.setChecked(isCheked[actQuest*4-1]);

                if(actQuest == 1){
                    btnPrev.setEnabled(false);
                }
                if(actQuest == questions.length - 1){
                    btnNext.setEnabled(true);
                }

            }
        });


        btnRev = findViewById(R.id.btnRev);
        btnRev.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){

               if(isCheked[actQuest*4-4] == isCorrect[actQuest*4-4] &&
                       isCheked[actQuest*4-3] == isCorrect[actQuest*4-3] &&
                       isCheked[actQuest*4-2] == isCorrect[actQuest*4-2] &&
                       isCheked[actQuest*4-1] == isCorrect[actQuest*4-1]){
                    correct = correct + 1;
               }else{
                   incorrect = incorrect + 1;
               }

                tvCor.setText("Correct answers: " + Double.toString(correct));
               tvIncor.setText("Incorrect answers: " + Double.toString(incorrect));
               corrected[actQuest - 1] = true;
               StringBuilder sb = new StringBuilder();
               for (boolean b : corrected) {
                   sb.append(b ? "true " : "false ").append(" ");
               }
               String arrayContent = sb.toString().trim();
               Toast.makeText(MainActivity.this, arrayContent, Toast.LENGTH_SHORT).show();
               btnRev.setEnabled(false);

           }
        });

        
        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){

               if(corrected[actQuest] == false){
                   btnRev.setEnabled(true);
               }else{
                   btnRev.setEnabled(false);
               }


            actQuest = actQuest + 1;
            tvNumQuestion.setText("QUESTION " + Integer.toString(actQuest));
            tvTitle.setText(questions[actQuest - 1]);
            tvA1.setText(answers[actQuest*4-4]);
            tvA2.setText(answers[actQuest*4-3]);
            tvA3.setText(answers[actQuest*4-2]);
            tvA4.setText(answers[actQuest*4-1]);

            ck1.setChecked(isCheked[actQuest*4-4]);
            ck2.setChecked(isCheked[actQuest*4-3]);
            ck3.setChecked(isCheked[actQuest*4-2]);
            ck4.setChecked(isCheked[actQuest*4-1]);


            if(!(btnPrev.isEnabled())){
                btnPrev.setEnabled(true);
            }
            if(actQuest>=questions.length){
                btnNext.setEnabled(false);
            }

           }
        });


        ck1 = findViewById(R.id.ck1);
        ck1.setOnCheckedChangeListener((buttonView, isThisChecked) -> {
            isCheked[actQuest*4-4] = isThisChecked;
        });

        ck2 = findViewById(R.id.ck2);
        ck2.setOnCheckedChangeListener((buttonView, isThisChecked) -> {
            isCheked[actQuest*4-3] = isThisChecked;
        });
        ck3 = findViewById(R.id.ck3);
        ck3.setOnCheckedChangeListener((buttonView, isThisChecked) -> {
            isCheked[actQuest*4-2] = isThisChecked;
        });

        ck4 = findViewById(R.id.ck4);
        ck4.setOnCheckedChangeListener((buttonView, isThisChecked) -> {
            isCheked[actQuest*4-1] = isThisChecked;
        });

    }
}