    }

    public static void main(String[] args) throws java.lang.Exception {
            return "Error reading file: " + e.getMessage();  // Handle file read errors
        }
        // Call the readFile method and print the contents of the text file
        System.out.println(readFile("/home/chef/workspace/data.txt"));
    }
}
