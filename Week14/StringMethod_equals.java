package Week14;

public class StringMethod_equals {
    public static void main(String[] args) {
        String lastname = "Niaoaongart";
        String lastname2 = "niaoaongart";
        // เปรียบเทียบเท่ากัน  .equals()
        boolean result = lastname.equals(lastname2);
        //System.out.println(result);

        //เปรียบเทียบเท่ากันไม่สนใจตัวอักษรเล็กใหญ่    .equals()
        boolean result2 = lastname.equalsIgnoreCase(lastname2);
        
        if (result2) {
            System.out.println(lastname + " เท่ากับ " + lastname2);
            
        } else {
            System.out.println(lastname + " ไม่เท่ากับ " + lastname2);
            
        }
    }
    
}
