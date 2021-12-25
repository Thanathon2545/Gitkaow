package Week05;
import java.util.Scanner;
public class inputDataFromKeyboard {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("กรุณาป้อนรหัสนักศึกษา : ");
        String id = kb.nextLine();
        System.out.print("กรุณากรอกชื่อ-นาามสกุล : ");
        String name = kb.nextLine();
        System.out.print("กรุณากรอกปีพ.ศ. : ");
        int year =kb.nextInt();
        System.out.print("กรุณากรอกเกรดเฉลี่ย : ");
        float gpa =kb.nextFloat();
        //nextBytes
        //nextShort
        //nextInt
        //nextLong
        //nextFloat
        //Double


        System.out.println("สิ่งที่ท่านป้อนเข้ามาคือ"+id);
        System.out.println("ชื่อ-นามสกุล"+name);
        System.out.println("อายุที่ป้อนคือ : "+year);
        System.out.println("เกรดเฉลี่ย"+gpa);

        int age = 2564-year;//คำนวณอายุ

        kb.close();
       
    }
    
}
