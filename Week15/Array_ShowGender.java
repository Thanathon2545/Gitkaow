package Week15;

public class Array_ShowGender {
    public static void main(String[] args) {
        String [] name = {"นายสมชาย","นางสาวสมหญิง","นายสมนึก","นางสาวสมใจ"};
            System.out.println(name.length);
            System.out.println("มีรายชื่อทั้งหมด 4 คน ประกอบด้วย");
            for (int i = 0; i < name.length; i++) {
                boolean result = name[i].startsWith("นาย");
                if (result) {
                    System.out.println((i+1)+"."+name[i]+" ==> เป็นเพศชาย");
                } else {
                    System.out.println((i+1)+"."+name[i]+" ==> เป็นเพศหญิง");
                }
            }
    }
}
