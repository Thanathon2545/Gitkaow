package Week11;

public class WhileTrue_01 {
    public static void main(String[] args) {
        
        int count =0;       //ค่าเรื่มต้น
        while (true ) {    // เงื่อนไข
            System.out.println(count++ +" ");   // ค่าที่ต้องการเเสดงผล
            //count++;               // update รอบ
            if (count==1000) {
                break;
            }
        }
    }
    
}
