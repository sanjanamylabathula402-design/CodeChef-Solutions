                               .replace("}", "")
                               .replace(",", "")
                               .replace("\"", "");

                    // Split into key and value
                    String[] parts = line.split(":");

                    if (parts[0].trim().equals("category")){
                        System.out.println(parts[1].trim());
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading file");
        }
    }
