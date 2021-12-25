package Week12;

public class NestLoop01 {
    public static void main(String[] args) {

        for (int i = 2; i <=3; i++) { //นอก แม่สูตรคูณ
            for (int j = 1; j <=12; j++) { //ใน  จำนวนครั้งที่คูณ
                System.out.println(i+" x "+j+"="+(i*j));
            }
        }
    }
}