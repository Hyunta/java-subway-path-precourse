package subway;

import java.util.Scanner;

import subway.controller.MainController;
import subway.utils.Initializer;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Initializer.init();
        MainController mainController = new MainController(scanner);
        mainController.run();
    }
}
