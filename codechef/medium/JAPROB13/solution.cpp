        question[3] = optC;   
        question[4] = optD;   
        question[5] = correctAns;
        return question;
    }

    public static void countdownTimer() {
        System.out.println("\nYou have 10 seconds to think...");
        try {
            for (int i = 10; i > 0; i--) {
                System.out.print("\rTime left: " + i + " seconds ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted.");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        playQuiz();
    }
}