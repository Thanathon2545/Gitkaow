package Week10;

public class PositiveNumber {
    public static void main(String[] args) {
        int number = -5;
         String result = "";
        //การเขียน if else
        
        if (number > 0) {// หาจำนวนเต็มบวก
            result = number+"เป็นจำนวนเต็มบวก";
        }else if (number < 0) {// หาจะนวนเต็มลบ
            result = number+"เป็นจำนวนเต็มลบ";
        }else  {// หาจะนวนเต็มศูนย์
            result = number+"เป็นจำนวนเต็มศูนย์";
        }
        System.out.println(result);




          //if อย่างเดียว
        // // หาจำนวนเต็มบวก
        // if (number > 0) {
        //     System.out.println("เป็นจำนวนเต็มบวก");

        // }
        // // หาจะนวนเต็มลบ
        // if (number < 0) {
        //     System.out.println("เป็นจำนวนเต็มลบ");

        // }
        // // หาจะนวนเต็มศูนย์
        // if (number == 0) {
        //     System.out.println("เป็นจำนวนเต็มศูนย์");

        // }
    }

}
