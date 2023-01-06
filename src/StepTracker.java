import java.util.Scanner;
class StepTracker {
    Scanner scan;
    MonthData[] monthToData;
    int goalByStepsPerDay = 10000;
    StepTracker(Scanner scan) {
        this.scan = scan;

        monthToData = new MonthData[12];
        for (int i = 0; i < 12; i++) {
            monthToData[i] = new MonthData();
        }
    }
    void changeGoal(){
         goalByStepsPerDay = scan.nextInt();
    }
    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int months = scan.nextInt();
        if((months > 11 ) || (months < 1)){
            System.out.println("Не верный формат месяцев");
            return;
        }
        System.out.println("Введите день от 1 до 30 (включительно)");
        int day = scan.nextInt();
        if ((day >  30) || ( day < 1)) {
            System.out.println("Не верный формат дней");
        }
        System.out.println("Введите количество шагов");
        int step = scan.nextInt();
        MonthData monthData = monthToData[months];
        monthData.days[day] = step;
    }
        int sumStepsFromMonth(int[] days) {
            int SumStep = 0;
            for (int i = 0; i < days.length; i++) {
                SumStep = SumStep + days[i];
            }
            return SumStep;
        }
        int maxSteps(int[] days) {
            int maxSteps = 0;
            for(int i = 0; i < days.length; i++) {
                if (maxSteps < days[i]){
                    maxSteps = days[i];
                }
            }
            return maxSteps;
        }

        void printStatistic() {
            System.out.println("Введите число месяца");
            Converter converter = new Converter();
            int mont = scan.nextInt();
            MonthData monthData = monthToData[mont];
            System.out.println(sumStepsFromMonth(monthData.days) + " - " + "Суммарное количество шагов за месяц");
            System.out.println(maxSteps(monthData.days) + " - " +"максимального пройденного количества шагов за месяц");
            System.out.println((sumStepsFromMonth(monthData.days) / 30) + " - " +"среднее колличество шагов за месяц");
            System.out.println(converter.ConvertToKm(sumStepsFromMonth(monthData.days)) + " - " + "Пройденное растояние за месяц в км");
            System.out.println(converter.ConvertToKkal(sumStepsFromMonth(monthData.days)) + " - " + "Сожженые килокалории за месяц");
            System.out.println(monthData.bestSeries(goalByStepsPerDay)+ " - лучшей серии " +"\n"); //дополнительный перенос строки
            for(int i = 0; i <monthData.days.length; i++) {
                System.out.print("день " + (i + 1) + " - " + monthData.days[i] + "; ");
            }
           }
}





























