
    public static void playQuiz() {
        System.out.println("Welcome to Java Quiz!");
        ArrayList<String[]> questions = getJavaQuestions();
        Collections.shuffle(questions);
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int i = 1;

        for (String[] question : questions) {
            displayQuestion(question, i);
            countdownTimer();
            String userAnswer = getUserAnswer(sc);
            System.out.println("your response: "+userAnswer);
        }

    }
    
    public static void main(String[] args) {
        playQuiz();
    }
}
