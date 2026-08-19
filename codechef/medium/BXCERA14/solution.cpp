            File file = new File("songs.txt");
            FileWriter writer = new FileWriter(file);
            for (String song : songs) {
                writer.write(song + System.lineSeparator());
            }
            writer.close();
            System.out.println("Songs saved to songs.txt");
        } catch (Exception e) {
            System.out.println("An error occurred while saving songs.");
        }
    }
}

class Codechef {
    public static void main(String[] args) {
        FavoriteSongsList myMusic = new FavoriteSongsList();
        myMusic.addSong("Bohemian Rhapsody");
        myMusic.addSong("Imagine");