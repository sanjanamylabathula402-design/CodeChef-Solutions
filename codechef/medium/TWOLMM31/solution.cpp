        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        String filepath = "/home/chef/workspace/logs.txt";
        String log1 = "log 1";
        String log2 = "log 2";
        addLogsToFile(filepath, log1, log2);
    }
}
