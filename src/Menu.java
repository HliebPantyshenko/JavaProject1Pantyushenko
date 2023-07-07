import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Menu {
        private static final int EXIT_NUMBER = 0;
        private static final int DECODE_FILE = 1;
        private static final int ENCODE_FILE = 2;
        private static final String MENU_INFO = """
            Вітаю в меню програми шифрування!
            Розшифрування: натисніть 1
            Шифрування: натисніть 2
            Вихід з програми: натисніть 0
            """;
        final CeasedCypher ceasedCypher = new CeasedCypher();
        final Scanner scanner = new Scanner(System.in);
        private static boolean isRunning = true;

        public void run(){

            System.out.println(MENU_INFO);

            while (isRunning){
                int menuItem = scanner.nextInt();

                switch (menuItem) {
                    case DECODE_FILE -> itemToDecodeFile("1111");
                    case ENCODE_FILE -> itemToEncodeFile("1111");
                    case EXIT_NUMBER -> itemToExit();
                }

            }
        }
        public void itemToExit(){
            isRunning = false;
            System.out.println("Thank you for secret work, bye");
        }
        private void itemToEncodeFile(String filename) {
            ceasedCypher.encode(filename);

        }
        private void itemToDecodeFile(String filename) {
            ceasedCypher.decode(filename);
        }

}

