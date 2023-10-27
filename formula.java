 class OrderedPair
{
    double x;
    double y;

    public OrderedPair(){
        x=0;
        y=0;
    }

    public OrderedPair(double x, double y){
        this.x =x;
        this.y =y;
    }
    public String toString(){
        return x + "," + y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

}


 public class formula {
    //1. Quadratic Formula:
        public static OrderedPair findQuadraticRoots (double a, double b, double c){
            double x1 = (-b + Math.sqrt(b*b - 4*a*c)) / 2*a;
            double x2 = (-b - Math.sqrt(b*b - 4*a*c)) / 2*a;
            OrderedPair answer = new OrderedPair(x1,x2);
            return answer;
        }

        //2
        public static double findSlope (OrderedPair A, OrderedPair B){
            double v = (B.getY() - A.getX()) / (B.getY() - A.getX());
            return v;
        }

       //3
        public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
            double midpointX = (A.getX() + B.getX()) / 2 ;
            double midpointY = (A.getY() + B.getY()) / 2 ;
            OrderedPair answer = new OrderedPair(midpointX , midpointY);
            return answer;
        }

        //4
        public static double findArithmeticSeriesSum (double a, double d, int k){
            double sum = 0.5*k*(2*a + (k-1)*d);
            return sum;
        }

        //5
        public static double findGeometricSeriesSum (double a, double r, int k){
            double sum = a* ((1-Math.pow(r,k)) / (1-r));
            return sum;
        }

        //6
        public static int rollDie (int sides){
            int a = (int)(Math.random()*sides) +1;
            return a;
        }

    }
























