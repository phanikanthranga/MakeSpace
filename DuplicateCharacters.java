public class DuplicateCharacters 
{
   public static void main(String args[]) 
   {
      String str = "sunny day san francisco";
      char[] ca = str.toCharArray();
      System.out.println("The given string is " + str);
      System.out.print("The repeated characters in above string are ");
      for (int i = 0; i < str.length(); i++) 
      {
         for (int j = i + 1; j < str.length(); j++) 
         {
            if (ca[i] == ca[j]) 
            {
               System.out.print(ca[j] + " ");
               break;
            }
         }
      }
   }
}
