public class ReverseString 
{  
    public static String stringRev(String str)
    {  
        char s[]=str.toCharArray();  
        String reverse="";  
        int i=s.length-1;
        while(i>=0) 
        {  
            reverse+=s[i];
            i--;
        }  
        return reverse;  
    }  
}
