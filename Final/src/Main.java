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
            Pulley system = new Pulley(50,10,40,0.2,0.2,0.3,200);
            T = ((system.F + system.fric1*(system.M1 + system.M2))/(system.M1 - system.M3)*(-1-system.fric3)-g*(1-system.fric2))/((1+system.fric3)/(system.M1-system.M3)-1/system.M2+1/system.M3);
            a1 = (system.F + T + system.fric1*(system.M1*g+system.M2*g)) / (system.M1-system.M3);
            a2 = (T + system.fric2*system.M2*g )/system.M2;
            a3 = ( T - system.M3*g - system.fric3*system.M3*a1)/system.M3;
            System.out.println(T);
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
        }
}