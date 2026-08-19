        Matcher matcher = Pattern.compile("\\b\\w+\\b").matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        int total_words = words.size();
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

        int total_words =  countWordsRegex(text);
        System.out.println(total_words);
    }
}