public class Main {

    // Rope  : a1-a2+a3 = 0
    // Hole  : a1x = a3x



    public static int g = 10; // m/s^2

        public static void main(String[] RTL)
        {

            Pulley system = new Pulley(100,100,100,0.1,0.2,0.1,0);
            double myu1 = system.fric1;
            double myu2 = system.fric2;
            double myu3 = system.fric3;
            double M1= system.M1;
            double M2 = system.M2;
            double M3 = system.M3;
            double F = system.F;
            System.out.println("For M1 = "+M1+", M2 = "+M2 + ", M3 = "+ M3+", myu1 = "+myu1+", myu2 = "+myu2 + ", myu3 = "+myu3+", F = " + F);
            for (int t = 1;t<=100;t+=10)
            {
                System.out.println("For t = "+ t);
                coordinates(M1,M2,M3,myu1,myu2,myu3,F,t);

            }


        }
        public static void coordinates(double M1,double M2,double M3, double myu1,double myu2,double myu3, double F, double t)
        {
            double a1;
            double a2;
            double a3;
            double T;
            double x1, x2, x3,y3;

            T = ((1+myu3)/(M1+M3)*(-myu1*g*(M1+M2)-F)+g*(1-myu2))/(1/(M1+M3)*(1+myu1+myu3+myu1*myu3)+1.0/M2+1.0/M3);

            a1 = (-F-myu1*(M1*g+M2*g+T)-T)/(M1+M3);
            a2 = (T+myu2*M2*g)/M2;
            a3 = (T - M3*g - myu3*M3*a1) / M3;

            x1 = a1*t*t/2;
            x2 = a2*t*t/2;
            x3 = x1;
            y3 =  a3*t*t/2;

//            System.out.println("T= "+T);
//            System.out.println("a1= "+a1);
//            System.out.println("a2= "+a2);
//            System.out.println("a3= "+a3);
            System.out.println("X coordinate of M1 :"+x1);
            System.out.println("X coordinate of M2 :"+x2);
            System.out.println("X coordinate of M3 :"+x3);
            System.out.println("Y coordinate of M3 :"+y3);
            System.out.println("Y coordinates of M1 and M1 didn't change");
        }
}