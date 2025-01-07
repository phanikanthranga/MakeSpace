public class ReverseString 
{  
    public static String stringRev(String str)
    {  
        char s[]=str.toCharArray();  
        String reverseStr="";  
        int i=s.length-1;
        while(i>=0) 
        {  
            reverseStr+=s[i];
            i--;
        }  
        return reverseStr;  
    }  
}
