        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return -1;
        }
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        String filePath = "comments.txt";  // File path to be read
        System.out.println(findLongestComment(filePath));
    }
}
