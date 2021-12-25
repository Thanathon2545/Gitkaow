package Week15;

public class Array_Insert1to1000 {
    public static void main(String[] args) {
        long [] m = new long [1000];

        for (int i = 0; i < m.length; i++) {
            m[i] = i+1;
        }
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] +" ");
        }
    }
    
}
