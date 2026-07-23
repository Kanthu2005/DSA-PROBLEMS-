public class Char_Partten {
    
     public static void main(String[] args) {
        
        int n=5;
        char ch='A';
        
       for (int line=0;line<n;line++){//outer loop
           for(int chars=1;chars<=line;chars++){//inner loop its print starts
             System.out.print(ch+" ");
             ch++;
           }
           System.out.println();
       }
        }
}
