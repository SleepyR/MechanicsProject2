public class Main {

    // From system equations we get
    // Rope  : a1-a2+a3 = 0
    // Hole  : a1x = a3x
    // a1 = (F + myu1(M1*g+M2*g) +T) / (M1-M3)
    // a2 = (T + myu2*M2*g )/M2
    // a3 = (T - M3*g - myu3*M3*a1 )/M3


    public static int g = 10; // m/s^2

        public static void main(String[] RTL)
        {
            double a1;
            double a2;
            double a3;
            double T;
            Pulley system = new Pulley(100,20,20,0.5,0.5,0.5,-300);
            double myu1 = system.fric1;
            double myu2 = system.fric2;
            double myu3 = system.fric3;
            double M1= system.M1;
            double M2 = system.M2;
            double M3 = system.M3;
            int F = system.F;
            T = (g*(myu2+1)-(1-myu3)*((F+myu1*(M1*g + M2*g))/(M1-M3)))/(1/(M1-M3)+1/M3-1/M2);

            a1 = (F+myu1*(M1*g+M2*g)+T)/(M1-M3);
            a2 = (T+myu2*M2*g)/M2;
            a3 = (T - M3*g - myu3*M3*a1) / M3;
            System.out.println(T);
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
        }
}