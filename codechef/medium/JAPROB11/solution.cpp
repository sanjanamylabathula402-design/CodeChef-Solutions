    }

    public static String[] createQuestion(String text, String optA, String optB, String optC, String optD, String correctAns) {
        String[] question = new String[6];
        question[0] = text;   
        question[1] = optA; 
        question[2] = optB;
        question[3] = optC;   
        question[4] = optD;   
        question[5] = correctAns;
        return question;
    }

    public static void playQuiz() {
        ArrayList<String[]> questions = getJavaQuestions();

        Collections.shuffle(questions);
    }

    public static void main(String[] args) {
        playQuiz();
    }
}