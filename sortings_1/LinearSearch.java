package sortings_1;

public class LinearSearch
{
    public static int linearsearchf(int [] arr, int key)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int a1[] = {10,20,30,50,10};
        int key =50;
        System.out.println(linearsearchf(a1, key));
    }
}
