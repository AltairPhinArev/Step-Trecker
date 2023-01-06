public class Converter {
    double DistanceByStep = 70 ;
    double kalByStep = 50;
     double ConvertToKm(double step){
        double Distance;
        Distance = (step * DistanceByStep) / 1000;
        return Distance;
    }
     double ConvertToKkal(double step){
        double Kkal;
        Kkal = (step * kalByStep) / 1000;
        return Kkal;
    }
}
