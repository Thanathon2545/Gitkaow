package Week14;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Thanathon";
        String city = new String ("Nakhon Pathom");

        System.out.println(name);
        System.out.println(city);

        // การต่อสตริง .concat()
        System.out.println(name+city);


        String result = name+city;
        System.out.println(result);

        String result2 = name+city+" .com";
        System.out.println(result2);

        System.out.println(result2+".ac.th");
        
        //หาความยาวสตริง  .Length()

        System.out.println(name.length());

        int count = name.length();
        System.out.println(count);
        
        // หาตำแหน่งตัวอักษรในข้อความ   .charAt()
        System.out.println(name.charAt(0));

         char characters = name.charAt(0);
         System.out.println(characters);

    }
    
}
