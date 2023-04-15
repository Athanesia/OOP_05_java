package src.UI;

import java.io.IOException;
import java.util.Scanner;

import src.Config;
import src.Core.MVP.Presenter;
import src.Core.MVP.View;

public class App {
    public void ButtonClick() throws IOException {
        View view = new NewConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);

        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println(" 1 - предыдущий  2 - следующий  3 - поиск  4 - импорт из CSV  5 - экспорт в CSV");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;
                    case "3":
                        System.out.println("Введите поисковой запрос:");
                        String query = in.next();
                        presenter.search(query);
                        break;
                    case "4":
                        System.out.println("Введите путь к CSV файлу:");
                        String csvFilePath = in.next();
                        presenter.importFromCSV(csvFilePath);
                        break;
                    case "5":
                        System.out.println("Введите путь для экспорта CSV файла:");
                        String csvExportPath = in.next();
                        presenter.exportToCSV(csvExportPath);
                        break;
                    default:
                        System.out.println("Некорректная команда");
                        break;
                }
            }
        }
    }
}