import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b){
        if(a == null || b == null || a.length != b.length){
            return new int[1];
        }
        else{
            int[] c = new int[a.length];
            for(int i = 0; i < a.length; i++){
                if (b[i] == 0) throw new RuntimeException("Division by 0");
                else c[i] = a[i] / b[i];
            }
            return c;
        }
    }
}