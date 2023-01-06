
class MonthData {
    int[] days = new int[30];
    int bestSeries(int goalByStepsPerDay) {
        int bestSeries = 0;
        int series = 0;
        for (int daySteps : days) {
            if (daySteps >= goalByStepsPerDay) {
                if (++series > bestSeries) {
                    bestSeries++;
                }
            } else {
                series = 0;
            }
        }
        return bestSeries;
    }

} 