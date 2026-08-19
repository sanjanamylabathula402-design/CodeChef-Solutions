            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            book = (Book) objectIn.readObject();
            System.out.println("Book data loaded from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while loading the book object from the file.");
        }
        return book;
    }
}

class Codechef {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien");
        String filename = "book.ser";

        SaveBook.saveBook(book, filename);
