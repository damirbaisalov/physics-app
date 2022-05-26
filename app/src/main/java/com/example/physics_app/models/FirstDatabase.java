package com.example.physics_app.models;

import java.util.ArrayList;
import java.util.List;

public class FirstDatabase {

    public static List<Question> questions = new ArrayList<>();

    static {
        ArrayList<String> id = new ArrayList<>();
        ArrayList<String> option1 = new ArrayList<>();
        ArrayList<String> option2 = new ArrayList<>();
        ArrayList<String> option3 = new ArrayList<>();
        ArrayList<String> option4 = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();

        id.add("1. Физикада зерттелетін табиғат құбылыстарының атауы.");
        option1.add("Физикалық аспаптар");
        option2.add("Физикалық заңдар");
        option3.add("Физикалық шамалар");
        option4.add("Физикалық тәжірибелер");
        answer.add("Физикалық құбылыстар");

        id.add("2. Табиғатты бақылау барысында жинақталған ғылыми деректер бойынша ұсынылған тұжырымдардың атауы.");
        option1.add("Физикалық шама");
        option2.add("Физикалық эксперимент");
        option3.add("Тәжірибе");
        option4.add("Физикалық өлшеу");
        answer.add("Гипотеза");

        id.add("3. Физикалық теорияның негізгі мәселесі");
        option1.add("Физикалық эксперимент");
        option2.add("Физикалық өлшеу");
        option3.add("Болжау ұсыну");
        option4.add("Физикалық шаманы есептеу");
        answer.add("Құбылысты түсіндіру");

        id.add("4. Физиканың ғылыми тілін игеру кезінде пайдаланылатын арнайы тірек сөздің атауы");
        option1.add("Физикалық аспаптар");
        option2.add("Физикалық заңдар");
        option3.add("Физикалық шамалар");
        option4.add("Физикалық тәжірибелер");
        answer.add("Физикалық терминдер");

        id.add("5. Физика сөзін ғылымға енгізген ғалым");
        option1.add("Галилей");
        option2.add("Декарт");
        option3.add("Ньютон");
        option4.add("Демокрит");
        answer.add("Аристотель");

        id.add("6. Уақытты өлшейтін аспап");
        option1.add("Барометр");
        option2.add("Сызғыш");
        option3.add("Спидометр");
        option4.add("Манометр");
        answer.add("Секундомер");

        id.add("7. Ұзындықты өлшейтін аспап");
        option1.add("Барометр");
        option2.add("Секундомер");
        option3.add("Спидометр");
        option4.add("Манометр");
        answer.add("Сызғыш");

        id.add("8. Халықаралық бірліктер жүйесіндегі ұзындықтың негізгі бірлігі");
        option1.add("Миллиметр");
        option2.add("Сантиметр");
        option3.add("Спидометр");
        option4.add("Километр");
        answer.add("Метр");

        id.add("9. Қандай шама миллиметрмен өлшенеді?");
        option1.add("Аудан");
        option2.add("Жылдамдық");
        option3.add("Уақыт");
        option4.add("Көлем");
        answer.add("Ұзындық");

        id.add("10. Қайсы сөз физикалық дене ұғымына жатпайды?");
        option1.add("Парта");
        option2.add("Қалам");
        option3.add("Бор");
        option4.add("Қарындаш");
        answer.add("Кемпірқосақ");

        id.add("11. Табиғаттағы барлық физикалық денелер... құралады");
        option1.add("Өте кішкентай шаралардан (металл, пластмасса немесе шыны)");
        option2.add("Тек ғана электрондардан");
        option3.add("Тек ғана нейтрондардан");
        option4.add("Тек протондардан");
        answer.add("Атомдардан немесе молекулалардан");

        id.add("12. Диффузия құбылысы нені дәлелдейді?\n");
        option1.add("Тек молекулалардың бар екенін");
        option2.add("Тек молекулалардың қозғалыста болатынын");
        option3.add("Молекулалардың өзара әсерлесетіні");
        option4.add("Ештеңені дәлелдемейді");
        answer.add("Молекулалардың бар екендігін, қозғалыста болатынын және олардың арасында бос орын болатынын");

        id.add("13. Затты құрайтын бөлшектер");
        option1.add("Егер денені жоғары лақтырса, қозғала бастайды");
        option2.add("Егер денені 1000С – қа дейін қыздырса, тыныштықта болады");
        option3.add("00С – та тыныштықта болады.");
        option4.add("Абсолют тыныштықта болады");
        answer.add("Кез келген температурада үздіксіз және бейберекет қозғалады");

        id.add("14. Темір кесекті сығу мүмкін емес. Өйткені қысқан кезде темір бөлшектері...");
        option1.add("Үздіксіз, бейберекет қозғала бастайды");
        option2.add("Бір – біріне күштірек тартыла бастайды");
        option3.add("Бір – бірінен күштірек тебіле бастайды");
        option4.add("Массасы көбейе бастайды");
        answer.add("Бірдей массада және бірдей өлшемде болады");

        id.add("Дене өз көлемін сақтамайды және берілген көлемді толық иелене алады. Денені құрайтын зат қандай күйде болады?");
        option1.add("Тура жауап беру мүмкін емес");
        option2.add("Газ тәрізді немесе сұйық");
        option3.add("Қатты");
        option4.add("Сұйық");
        answer.add("Газ тәрізді");

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
