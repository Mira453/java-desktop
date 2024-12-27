import java.io.FileInputStream;
import java.io.IOException;

public class ChecksumCalculator {
    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("І'я файлу повинно бути вказано як аргумент.");
        }

        String filename = args[0];

        try {
            byte checksum = checkSum(filename);
            System.out.println("Checksum (XOR): " + checksum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte checkSum(String filename) throws IOException {
        if (filename == null || filename.isEmpty()) {
            throw new IllegalArgumentException("Ім'я файлу не повинно бути порожнім.");
        }

        try (FileInputStream fis = new FileInputStream(filename)) {
            int currentByte;
            byte checksum = 0;

            while ((currentByte = fis.read()) != -1) {
                checksum ^= (byte) currentByte; 
            }

            return checksum;
        }
    }
}
