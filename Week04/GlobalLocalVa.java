package Week04;
public class GlobalLocalVa {
    public static void main(String[] args) {
        //ตัวแปรแบบ Global
        int a = 100;
        int b = 200;

        System.out.println(a);
        {
        //ตัวแปรแบบ Local
            int c = 300;
            System.out.println(c);
            System.out.println(a);  
        }

       // System.out.println(c);
        
    }
}