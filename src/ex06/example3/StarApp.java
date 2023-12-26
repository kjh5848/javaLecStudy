package ex06.example3;

public class StarApp {

    public static void gameStart(Zealot u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1,Zealot u2)  {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1,Zealot u2)  {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1,Dragoon u2)  {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1,Zealot u2)  {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1,River u2)  {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1,River u2)  {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1,River u2)  {
        u1.attack();
        u2.attack();
    }


    public static void gameStart(Dark u1,Zealot u2)  {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1,Dark u2)  {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1,Dark u2)  {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dark u1,River u2)  {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1,Dark u2)  {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dark u1,Dragoon u2)  {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dark u1,Dark u2)  {
        u1.attack();
        u2.attack();
    }



    public static void main(String[] args) {
        Zealot z1 = new Zealot("z1");
        Dragoon d1 = new Dragoon("d2");
        Zealot z2 = new Zealot("z2");
        River r1 = new River(("r1"));
        River r2 = new River(("r2"));
        Dark da1 = new Dark("da1");
        Dark da2 = new Dark("da2");


        gameStart(z1, d1);
        System.out.println( );
        gameStart(d1, z1);
        System.out.println( );

        gameStart(z1, z2);
        System.out.println( );
        gameStart(z2, z1);
        System.out.println( );

        gameStart(z1, r1);
        System.out.println( );
        gameStart(d1, z1);
        System.out.println( );
        gameStart(r1, r2);


        gameStart(da1, z1);
        System.out.println( );
        gameStart(z1, da1);
        System.out.println( );

        gameStart(da1, d1);
        System.out.println( );
        gameStart(d1, da1);
        System.out.println( );

        gameStart(da1, r1);
        System.out.println( );
        gameStart(r1, da1);
        System.out.println( );

        gameStart(da1, da2);
    }
}
