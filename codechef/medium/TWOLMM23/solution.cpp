        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
        String content = "{name : Test, age: 45, city: London}";
        String filepath = "/home/chef/workspace/userDetails.txt";
        saveUserDetails(filepath, content);
    }
}
