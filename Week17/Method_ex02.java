package Week17;

public class Method_ex02 {
    public static void main(String[] args) {
        // method แบบที่2 มีการรับค่าเข้าที่ส่งมาจาก mainprogram  แต่ไม่มีการส่งค่าออก
        display("mafucka");
        display("big dick");
        Fullname("Sadu","Manee");
        plus(6, 9);
    }

    static void plus (int num1, int num2){
        int result = num1 + num2;
        System.out.println("ผลบวกเท่ากับ"+result);
        System.out.println(num1+ " "+ num2);
    }

    static void display (String x){
    System.out.println(x);
    }

    static void Fullname (String Fn, String Ln){
        System.out.println(Fn+ " "+ Ln);
    }
}
