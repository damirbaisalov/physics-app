package com.example.physics_app.models;

import java.util.ArrayList;
import java.util.List;

//Локальная база данных для вопросов с вариантами ответов для второго варианта
public class SecondDatabase {

    public static List<Question> questions = new ArrayList<>();

    static {
        ArrayList<String> id = new ArrayList<>();
        ArrayList<String> option1 = new ArrayList<>();
        ArrayList<String> option2 = new ArrayList<>();
        ArrayList<String> option3 = new ArrayList<>();
        ArrayList<String> option4 = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();

        id.add("1. Зат ұғымына тиісті емес сөзді атаңдар?");
        option1.add("Қарындаш");
        option2.add("Бор");
        option3.add("Ағаш");
        option4.add("Темір");
        answer.add("Су");

        id.add("2. Физикалық құбылыс ұғымына тиісті емес сөзді атаңдар?");
        option1.add("Мұздың еруі");
        option2.add("Найзағайдың жарқылы");
        option3.add("Жанартаудың атқылауы");
        option4.add("Жаңбырдың жаууы");
        answer.add("Сынып");

        id.add("3. Төмендегі сөздердің қайсысы механикалық құбылысқа тиісті?");
        option1.add("Жұлдыздардың жымыңдауы");
        option2.add("Мұздың еруі");
        option3.add("Сіріңкенің жануы");
        option4.add("Судың қайнауы");
        answer.add("Тамшының тамуы");

        id.add("4. Төмендегі сөздердің қайсысы физикалық аспаптарға тиісті?");
        option1.add("Градус");
        option2.add("Температура");
        option3.add("Термометр");
        option4.add("Килограмм");
        answer.add("Термометр");

        id.add("ss");
        option1.add("ss");
        option2.add("ss");
        option3.add("ss");
        option4.add("ss");
        answer.add("ss");

        id.add("5. Миллиметр – бұл");
        option1.add("Физикалық шама");
        option2.add("Физикалық дене");
        option3.add("Физикалық аспап");
        option4.add("Физикалық құбылыс");
        answer.add("Өлшем бірлігі");

        id.add("ss");
        option1.add("ss");
        option2.add("ss");
        option3.add("ss");
        option4.add("ss");
        answer.add("ss");

        id.add("6. Астрономияда арақашықтықты анықтауда астрономиялық бірлік (а. б.) қолданылады. Жерден Күнге дейінгі орташа қашықтық 150 млн км – ге тең. Төмендегі нұсқалардың қайсысында 1 а. б. сндарт түрге енгізілген?");
        option1.add("0, 15 • 1012 м");
        option2.add("150 • 106 м");
        option3.add("1, 5 • 1011 м");
        option4.add("1, 5 • 1012 м");
        answer.add("15 • 1010 м");

        id.add("7. Жарықтық 300 000 км/с жылдамдықпен 1 жылда жүріп өттін аралығын жарық жылы деп атайды. Осы аралықты есептеп, стандарт түрде көрсетіңдер. Қай нұсқаға сай келетінін көрсетіңдер");
        option1.add("9, 46 • 1013 м");
        option2.add("9, 46 • 1014 м");
        option3.add("9, 46 • 1017 м");
        option4.add("Жауаптардың ішінде дұрысы жоқ");
        answer.add("946 • 1013 м");

        id.add("8. Өлшеудің ең үлкен қателігі");
        option1.add("Шкаланың екі құнына тең");
        option2.add("Шкаланың бір бөлігінің төрт құнына тең");
        option3.add("Шкаланың бір бөлігінің төрттен бір құнына тең");
        option4.add("Шкаланың бір бөлігінің құнына тең.");
        answer.add("Шкаланың бір бөлігінің құнының жартысына тең");

        id.add("9. Микро тіркесі неге тең?");
        option1.add("10 - 3");
        option2.add("106");
        option3.add("10 - 9");
        option4.add("103");
        answer.add("10 - 6");

        id.add("10. Арақашықтықтың төмендегі өлшем бірліктерінің ішіндегі ең үлкені");
        option1.add("Миллиметр");
        option2.add("Метр");
        option3.add("Сантиметр");
        option4.add("Нанометр");
        answer.add("Километр");

        id.add("11. Дұрыс тұжырымды таңда");
        option1.add("Бір заттың молекулалары әртүрлі болады");
        option2.add("Дене қызғанда молекулалардың өлшемі ұлғаяды");
        option3.add("Дене қызғанда молекуланың массасы артады");
        option4.add("Дене қызған кезде молекула массасы азаяды");
        answer.add("Бір заттың молекулалары бірдей болады");

        id.add("12. Дуффузия... жүреді");
        option1.add("Тек газда");
        option2.add("Тек сұйықта");
        option3.add("Тек қатты денелерде");
        option4.add("Тек плазмада");
        answer.add("Газдарда, сұйықтарда және қатты денелерде");

        id.add("13. Төменде аталған құбылыстардың қайсысы зат бөлшектерінің арасында тартылыс күші бар екенін дәлелдейді?");
        option1.add("Гүлдің иісі ауада таралады.");
        option2.add("Мұз жылы жерде ериді");
        option3.add("Ток жүрген кезде электр шамы жарқырайды");
        option4.add("Өзен суы қыста қатады");
        answer.add("Егер қорғасын цилиндрдің жаңа кесілген қималарын өзара түйістіріп, қатты сығып ұстаса, олар жабысып қалады");

        id.add("14. Дене өз пішіні мен көлемін сақтайды. Денені құрайтын зат қандай күйде болады?");
        option1.add("Газ тәрізді");
        option2.add("Сұйық");
        option3.add("Газ тәрізді немесе сұйық");
        option4.add("Тура жауап беру мүмкін емес");
        answer.add("Қатты");

        id.add("15. Газдағы немесе сұйықтағы ұсақ бөлшектердің ретсіз қозғалысы қалай аталады?");
        option1.add("Қысым");
        option2.add("Атомдардың қозғалысы");
        option3.add("Уақытша қозғалыс");
        option4.add("Булану");
        answer.add("Броундық қозғалыс");


        for (int i = 0; i < id.size(); i++) {
            Question newsEach = new Question(
                    id.get(i),
                    option1.get(i),
                    option2.get(i),
                    option3.get(i),
                    option4.get(i),
                    answer.get(i)
            );
            questions.add(newsEach);
        }
    }
}