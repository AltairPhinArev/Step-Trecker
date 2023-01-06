import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scan);
        MonthData monthData = new MonthData();
        while (true) {
            printMenu();
            int i = scan.nextInt();
            if (i == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (i == 2) {
                stepTracker.changeGoal();
            } else if (i == 3) {
                stepTracker.printStatistic();
            } else if (i == 4) {
                System.out.println("Пока!");
                scan.close();
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }

    static void printMenu() {
        System.out.println("1 - введите количество шагов за определённый день");
        System.out.println("2 - изменить цель по количеству шагов в день");
        System.out.println("3 - вывод статистики за определённый месяц");
        System.out.println("4 - Выход");
    }

}