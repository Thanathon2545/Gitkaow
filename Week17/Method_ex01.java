package Week17;

public class Method_ex01 {
    public static void main(String[] args) {
        // method แบบที่1 ไม่มีการส่งค่าจาก method main และ ไม่มีการคืนค่ากลับจาก method ลูก
       openfile();
       playFile();
       pauseFile();
       closeFile();
    }
    static void openfile(){
        System.out.println("open file");
    } 
    
    public static void playFile(){
         System.out.println("Play Muisic");
    }
       
    public static void pauseFile(){
        System.out.println("Stop Muisic");
    } 
    public static void closeFile(){
        System.out.println("Exit Muisic");
    } 
}

