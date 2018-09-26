package Hi;

public class DoNow {
    public static void main(String[] args)
    {
        String str1 = "LoveJava";
        while(str1.length() > 0)
        {
            System.out.println(str1);
            str1 = str1.substring(1,str1.length()-1);
        }
        String str2 = "What?";
        for(int i = 0; i < str2.length(); i++)
        {
            System.out.println(str2);
            str2 = str2.substring(str2.length()-1) + str2.substring(0,str2.length()-1);
        }
    }
}
