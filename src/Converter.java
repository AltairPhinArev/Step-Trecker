public class Converter {
    int DistanceByStep = 75 ;
    int kalByStep = 50;
     int ConvertToKm(int step){
        int Distance;
        Distance = (step * DistanceByStep) / 1000;
        return Distance;
    }
    int ConvertToKkal(int step){
        int Kkal;
        Kkal = (step * kalByStep) / 1000;
        return Kkal;
    }
}
