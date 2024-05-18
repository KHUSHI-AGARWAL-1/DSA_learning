public class str_palindrome {
    public static void main(String[] args) {
        String s="khushi";
        System.out.println(pal(s));
    }
    public static boolean pal(String s){
        String str= "";
        for (int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        System.out.println(str);
        if(s.equals(str))
        {
            return true;
        }
        return false;

    }
}
