//58. Develop a Java program to convert the number “0” in the String “C0unter” to the
//letter “o”.
public class q58 {
    public static void main(String[] args) {
        String s = "C0unter";
        s = s.replace('0', 'o');
        System.out.println(s); 
    }
}
