package Week11;

public class ForLoop_01 {
    public static void main(String[] args) {
        
        // int count =2;       //ค่าเรื่มต้น
        // while (count <= 20 ) {    // เงื่อนไข
        //     System.out.print(count++ +" ");   // ค่าที่ต้องการเเสดงผล
        //     count++;               // update รอบ
            
        // }
        // for (int count =1;count  <= 100 ; count++) {
        //     System.out.print("รอบที่ " +count+" java"); 
        //}
        
        int sum =0;
        for (int number = 1; number <=10; number++) {
            sum= sum + number;
            System.out.println("รอบที่ "+ number + " ผลบวกเท่ากับ " + sum );
        }
        System.out.println("รวมเท่ากับ "+sum);
    }
}


