package com.example.physics_app.models;

//Моделька для вопросов
public class Question {
    private final String id;
    private final String option1;
    private final String option2;
    private final String option3;
    private final String option4;
    private final String answer;

    public Question(String id, String option1, String option2, String option3, String option4, String answer) {
        this.id = id;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }

    public String getId() {
        return id;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getAnswer() {
        return answer;
    }

}
