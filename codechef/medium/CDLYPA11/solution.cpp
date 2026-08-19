        } catch (IOException e) {
            return '0';
        }
    }

    public static void main(String[] args) {
        String filepath = "/home/chef/workspace/read.txt"; // Ensure the file exists
        int position = 9;               // Position of the byte to read (0-based indexing)

        // Call the function to read the specific byte
        System.out.println(readByte(filepath, position));
    }
}