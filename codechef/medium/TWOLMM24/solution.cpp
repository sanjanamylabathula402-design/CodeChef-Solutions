            // Close the writer to save changes
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        String content = "This is a temporary fileThis is a temporary file";
        String filepath = "/home/chef/workspace/output.txt";
        writeToFile(filepath, content);
    }
}