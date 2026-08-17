class Codechef {
    public static void main(String[] args) {
        String text = "Programming is fun"; // Input string
        int count = 0; // Counter for vowels
        int i = 0; // Loop index
        char ch;
        
        while (i < text.length()) { // Iterate through each character
            ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
                count++; // Increment counter if character is a vowel
            }
            i++; // Move to the next character
        }

        System.out.println("Total number of vowels: " + count);
    }
}