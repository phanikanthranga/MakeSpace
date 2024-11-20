public class ArraySort 
{
    public static void main(String[] args) 
    {
        int[] a = {6, 1, 5, 4, 7, 3, 10, 2};

        mySort(a); 

        System.out.println("Sorted Array is ");
        displayArray(a);
    }

    public static void mySort(int[] b) 
    {
        for (int i = 0; i < b.length - 1; i++) 
        {
            for (int j = 0; j < b.length - i - 1; j++) 
            {
                if (b[j] > b[j + 1]) 
                {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }
    }

    public static void displayArray(int[] c) 
    {
        for (int num : c) 
        System.out.print(num + " ");
    }
}
