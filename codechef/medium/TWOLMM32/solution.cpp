
            // Convert string to uppercase and write it to the file
            writer.write(line.toUpperCase());
            writer.write("\n");  // Move to the next line

            // Convert string to lowercase and write it to the file
            writer.write(line.toLowerCase());
            writer.write("\n");  // Move to the next line

            // Close the writer to save changes
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {