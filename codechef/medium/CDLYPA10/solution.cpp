import java.io.RandomAccessFile;
import java.io.IOException;

class Codechef {

    // Function to read a specific byte from the file
    public static char readSpecificByte(String filepath, int position) {
        try {

            RandomAccessFile file = new RandomAccessFile(filepath, "r");
            // Directly move to the specified position
            file.seek(position); 

            // Read and display the byte at the position
            byte data = file.readByte();
            
            return (char)data;  // data is in integer/number form, so here we are converting it to character
        } catch (IOException e) {