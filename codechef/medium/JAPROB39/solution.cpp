    //----------------------------------------------------
    public static int countWordsSplit(String text) {
        String[] wordsArray = text.split(" ");
        int total_words = wordsArray.length;
        return total_words;
    }
    //----------------------------------------------------
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Word Counter!\n");

        String filepath = "input.txt";
        String text = readFile(filepath);

        if (text.equals("")) {
            return;
        }

        int totalWords =  countWordsSplit(text);

        System.out.println(totalWords);
    }
}