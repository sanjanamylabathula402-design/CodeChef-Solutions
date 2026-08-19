        return file.exists();

    }

    public static void main(String[] args) {
        String filepath1 = "/home/chef/workspace/size.txt";
        String filepath2 = "/home/chef/workspace/size2.txt";

        // Call the function to check file existence and size
        System.out.println(checkExistance(filepath1));
        System.out.println(checkExistance(filepath2));
    }
}