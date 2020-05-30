package net.imwork.zhanlong;

public class ClassDemo02
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{55, 22, 29, 88};

        //bubbleSort(arr);

        show(arr);
        System.out.println();

        selectSort(arr);

        show(arr);
    }

    private static void show(int[] arr)
    {
        for (int i : arr)
        {
            System.out.print(i + ",");
        }
    }

    private static void selectSort(int[] arr)
    {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++)
        {
            for (int j =  i + 1; j < length; j++)
            {
                if (arr[i] > arr[j])
                {
                    swap(arr, i,j);
                }
            }
        }
    }

    private static void bubbleSort(int[] arr)
    {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++)
        {
            for (int j = 0; j < length - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    swap(arr,j,j + 1);
                }
            }
        }
        for (int i : arr)
        {
            System.out.print(i + "   ");
        }
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
