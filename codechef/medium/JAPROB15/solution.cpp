        ArrayList<String[]> questions = getJavaQuestions();
        Collections.shuffle(questions);
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int question_number = 1;

        for (String[] question : questions) {
            displayQuestion(question, question_number);
            countdownTimer();
            String userAnswer = getUserAnswer(sc);
            int result = checkAnswer(userAnswer, question[5]);
            score = updateScore(score, result);
            question_number++;
        }

        System.out.println("\nYour final score is: " + score + " / " + questions.size());
        System.out.println("Thanks for playing!");
    }