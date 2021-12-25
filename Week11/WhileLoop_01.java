package Week11;

public class WhileLoop_01 {
    public static void main(String[] args) {
        
        int count =2;       //ค่าเรื่มต้น
        while (count <= 20 ) {    // เงื่อนไข
            System.out.print(count++ +" ");   // ค่าที่ต้องการเเสดงผล
            count++;               // update รอบ
            
        }
    }
    
}
