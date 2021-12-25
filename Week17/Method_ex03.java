package Week17;

public class Method_ex03 {
    public static void main(String[] args) {
        // method แบบที่3 ไม่มีการรับค่าเข้าที่ส่งมาจาก mainprogram  แต่ลูกการส่งค่าออกคืนแม่
     int phone = getPhoneNumber();
     System.out.println("getPhoneNumber");
     int lucky =99;
     System.out.println(phone);
    }
    static int getPhoneNumber(){
        return 983767029; 
    }
}
