package com.example.physics_app.quiz_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.physics_app.R;
import com.example.physics_app.dialog_fragments.FailureDialogFragment;
import com.example.physics_app.dialog_fragments.SuccessDialogFragment;
import com.example.physics_app.models.FirstDatabase;
import com.example.physics_app.models.Question;
import com.example.physics_app.models.SecondDatabase;
import com.example.physics_app.quiz_options.QuizOptionsActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizTestActivity extends AppCompatActivity {

    ProgressBar progressBar;
    ProgressBar progressBarHandler;
    TextView progressText;
    TextView titleText;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    List<Question> questionList;
    int intId;
    private int currentPosition = 0;
    private int correctAnswers = 0;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_test);
        init();

        titleText.setText(questionList.get(currentPosition).getId());

        generateButtons(questionList.get(currentPosition));

        //Логика нажатия на кнопку 1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOption(button1, questionList.get(currentPosition));
            }
        });

        //Логика нажатия на кнопку 2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOption(button2, questionList.get(currentPosition));
            }
        });

        //Логика нажатия на кнопку 3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOption(button3, questionList.get(currentPosition));
            }
        });

        //Логика нажатия на кнопку 4
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOption(button4, questionList.get(currentPosition));
            }
        });

        //Логика нажатия на кнопку 5
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOption(button5, questionList.get(currentPosition));
            }
        });

    }

    //Инициализируем все компоненты в экране с вопросами
    private void init() {

        intId = getIntent().getIntExtra("ID", 1);

        if (intId==1) {
            questionList = FirstDatabase.questions;
        } else {
            questionList = SecondDatabase.questions;
        }

        titleText = findViewById(R.id.activity_quiz_test_title);
        progressBar = findViewById(R.id.activity_quiz_test_status);
        progressBarHandler = findViewById(R.id.progress_bar_handler);
        progressBarHandler.setMax(2000);
        progressText = findViewById(R.id.activity_quiz_test_status_text);
        button1 = findViewById(R.id.activity_verbs_quiz_option_1_button);
        button2 = findViewById(R.id.activity_verbs_quiz_option_2_button);
        button3 = findViewById(R.id.activity_verbs_quiz_option_3_button);
        button4 = findViewById(R.id.activity_verbs_quiz_option_4_button);
        button5 = findViewById(R.id.activity_verbs_quiz_option_5_button);

        handler = new Handler();

    }

    //Функция для проверки выбранного варианта ответа на правильность
    private void checkOption(Button button, Question question) {

        progressBarHandler.setVisibility(View.VISIBLE);
        progressBarHandler.setProgress(0);
        ObjectAnimator.ofInt(progressBarHandler, "progress", 2000)
                .setDuration(2000)
                .start();

        if (button.getText().equals(question.getAnswer())) {

            correctAnswers++;
            button.setBackgroundResource(R.drawable.bg_correct_answer_button);

        } else {

            if (button1.getText().equals(question.getAnswer()))
                button1.setBackgroundResource(R.drawable.bg_correct_answer_button);
            else if(button2.getText().equals(question.getAnswer()))
                button2.setBackgroundResource(R.drawable.bg_correct_answer_button);
            else if(button3.getText().equals(question.getAnswer()))
                button3.setBackgroundResource(R.drawable.bg_correct_answer_button);
            else if(button4.getText().equals(question.getAnswer()))
                button4.setBackgroundResource(R.drawable.bg_correct_answer_button);
            else if(button5.getText().equals(question.getAnswer()))
                button5.setBackgroundResource(R.drawable.bg_correct_answer_button);

            button.setBackgroundResource(R.drawable.bg_wrong_answer_button);
        }

        clickableButton(false);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                nextQuestion(button);
                clickableButton(true);
            }
        }, 2000);

    }

    //Функция для перехода на следующий вопрос
    private void nextQuestion(Button button) {
        currentPosition++;
        if (currentPosition>=questionList.size()) {
            if (correctAnswers==15){
                SuccessDialogFragment dialogFragment = new SuccessDialogFragment();
                dialogFragment.show(getFragmentManager(), "success_dialog_fragment");
            } else {
                FailureDialogFragment failureDialogFragment = new FailureDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("results", correctAnswers);
                failureDialogFragment.setArguments(bundle);
                failureDialogFragment.show(getFragmentManager(), "failure_fragment");
            }
        } else {
            progressBar.setProgress(currentPosition+1);
            progressCounterIncrease();
            titleText.setText(questionList.get(currentPosition).getId());
            generateButtons(questionList.get(currentPosition));
            progressBarHandler.setVisibility(View.INVISIBLE);
        }
        button.setBackgroundResource(R.drawable.bg_button_enabled);
        button1.setBackgroundResource(R.drawable.bg_button_enabled);
        button2.setBackgroundResource(R.drawable.bg_button_enabled);
        button3.setBackgroundResource(R.drawable.bg_button_enabled);
        button4.setBackgroundResource(R.drawable.bg_button_enabled);
        button5.setBackgroundResource(R.drawable.bg_button_enabled);
    }

    private void progressCounterIncrease() {
        int currentPositionConvert = currentPosition+1;
        progressText.setText(currentPositionConvert+"/15");
    }

    private void clickableButton(Boolean clickable) {
        if (clickable) {
            button1.setClickable(true);
            button2.setClickable(true);
            button3.setClickable(true);
            button4.setClickable(true);
            button5.setClickable(true);
        } else {
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
        }
    }

    //Функция которая расскидывает варината ответа по кнопкам
    private void generateButtons(Question q) {

        ArrayList<Button> buttonList = new ArrayList<>();
        buttonList.add(button1);
        buttonList.add(button2);
        buttonList.add(button3);
        buttonList.add(button4);
        buttonList.add(button5);
        ArrayList<String> questionOptions = new ArrayList<>();
        questionOptions.add(q.getOption1());
        questionOptions.add(q.getOption2());
        questionOptions.add(q.getOption3());
        questionOptions.add(q.getOption4());
        questionOptions.add(q.getAnswer());

        Collections.shuffle(buttonList);

        for (int i=0;i<buttonList.size();i++) {
            buttonList.get(i).setText(questionOptions.get(i));
        }
    }
}