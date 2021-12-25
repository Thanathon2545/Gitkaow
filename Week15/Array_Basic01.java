package Week15;

public class Array_Basic01 {
    public static void main(String[] args) {
        //การประกาศตัวแปรแบบ Arry
        // แบบที่ 1 : แบบกำหนดสมาชิก
        int [] number = {11,22,33,44,55,66,};

        int size = number.length; //หาความยาวของArray
        System.out.println(size);
        System.out.println(number[4]);  //การเข้าถึงตำแหน่งของตัวแปร

        number[4] =100;  // การเปลี่ยนค่าข้อมูลในตัวแปร
        System.out.println(number[4]);

        // แบบที่ 2 : แบบกำหนดขนาด
       
        //char [] alphabet;  //ประกาศอาเรย์
        //alphabet = new char [26]; //สร้างอาเรย์

        char [] alphabet = new char[26]; //ประกาศอาเรย์ สร้างอาเรย์
        alphabet [0] = 'a'; 
        alphabet [1] = 'b';
        alphabet [2] = 'c';

        System.out.println(alphabet [2]);
        System.out.println( alphabet.length);

        int [] num = new int [10];
        System.out.println(num [9]);

        //char [] alphabet = {'a','b','c'};

    }
}