package Week14;

public class StringMethod_StartEnd {
    public static void main(String[] args) {
        String fullname = "นายต๋อย แซมเบ่";

        //หาตำแหน่งของคำ .startWith()
        boolean result = fullname.startsWith("นาย");
        
        if (result) {
            System.out.println(fullname + "เพศชาย");
        } else {
            System.out.println(fullname + "เพศหญิง");

        }

        // หาตำแหน่งของค่าด้านหลัง  .endWith()
        String code = "212224TH";
        boolean result2 = code.endsWith("TH");

        if (result) {
            System.out.println("สินค้า" + 212224 + " มาจากประเทศไทย ");
        } else {
            System.out.println("สินค้า" + 212224 + " มาจากประเทศไทย ");

        }



    }
    
}
