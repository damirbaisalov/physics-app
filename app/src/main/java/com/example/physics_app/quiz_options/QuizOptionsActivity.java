package com.example.physics_app.quiz_options;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.physics_app.R;
import com.example.physics_app.quiz_test.QuizTestActivity;

public class QuizOptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_options);

        Button firstButton = findViewById(R.id.activity_quiz_options_first_button);

        //Кнопка - переход на тестник для первого варианта
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), QuizTestActivity.class);
                intent.putExtra("ID", 1);
                startActivity(intent);
            }
        });

        Button secondButton = findViewById(R.id.activity_quiz_options_second_button);

        //Кнопка - переход на тестник для второго варианта
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), QuizTestActivity.class);
                intent.putExtra("ID", 2);
                startActivity(intent);
            }
        });


    }
}