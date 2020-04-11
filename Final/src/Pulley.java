

public class Pulley {

    public static int Mmin = 0; // kg
    public static int Mmax = 100 ;//

    public static double frictionMin = 0;
    public static double frictionMax = 0.5;


    public static int Fmin = -300; // N
    public static int Fmax = 300; // N

    public static int g = 10; // m/s^2


    public int M1;
    public int M2;
    public int M3;
    public int F;
    public double fric1;
    public double fric2;
    public double fric3;

    public Pulley(int M1,int M2,int M3, double fric1,double fric2,double fric3, int F)
    {
        if(M1 <= Mmax && M1> Mmin )
            this.M1 = M1;
        else {
            System.out.println("Please input correct value");
            return;
        }
        if(M2 <= Mmax && M2> Mmin )
            this.M2 = M2;
        else {
            System.out.println("Please input correct value");
            return;
        }
        if(M3 <= Mmax && M3> Mmin  && M3 < M1)
            this.M3 = M3;
        else {
            System.out.println("Please input correct value");
            return;
        }
        if(fric1 <= frictionMax && fric1 >= frictionMin )
            this.fric1 = fric1;
        else {
            System.out.println("Please input correct value");
            return;
        }
        if(fric2 <= frictionMax && fric2 >= frictionMin )
            this.fric2 = fric2;
        else {
            System.out.println("Please input correct value");
            return;
        }
        if(fric3 <= frictionMax && fric3 >= frictionMin )
            this.fric3 = fric3;
        else {
            System.out.println("Please input correct value");
            return;
        }
        if(F <= Fmax && F >= Fmin )
            this.F = F;
        else {
            System.out.println("Please input correct value");
        }
    }
}
