        try 
           (RandomAccessFile file = new RandomAccessFile(filepath, "rw")) {
            // Move to the specific position
            file.seek(position); // 0-based indexing

            // Overwrite the data starting at the specified position
            file.writeBytes(newData);
            System.out.println("Updated the file starting at position " + position + " with data: " + newData);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filepath = "/home/chef/workspace/middle.txt"; // Ensure the file exists
        String newData = "UPDATED";      // Data to be written
        int position = 10;               // Position to start writing (0-based indexing)
