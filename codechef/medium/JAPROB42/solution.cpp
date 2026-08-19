
    public static void main(String[] args) {
        System.out.println("Welcome to the Word Counter!\n");

        String filepath = "/home/chef/workspace/input.txt";
        String text = readFile(filepath);

        if (text.equals("")) {
            return;
        }
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> words =  countWordsRegex(text);
        int totalWords = words.size();

        System.out.print("Enter the word to search: ");
        String searchWord = scanner.nextLine();

        int wordFreq = wordFrequency(words, searchWord);
        displayResults(totalWords, searchWord, wordFreq);
        scanner.close();
    }
}