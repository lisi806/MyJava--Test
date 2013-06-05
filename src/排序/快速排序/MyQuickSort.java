
package 排序.快速排序;

public class MyQuickSort {

    /**
     * @author lcq 2013-5-22
     * @param args
     */
    public static void main(String[] args) {
        int a[] = {5,3,9,11,2,7,8};
        partition(a);
        for(int temp : a) {
            System.out.print(temp+" ");
        }
    }

    public static void quickSort(int[] array) {
        
    }
    private static void partition(int[] array) {
        int length = array.length;
        // 选取最后一个作为枢纽
        int pivot = array[length - 1];
        int j = 0;
        for (int i = 1; i < length - 1; i++) {
            if (array[i] <= pivot) {
                ++j;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        {
            int temp = array[++j];
            array[j] = pivot;
            array[length - 1] = temp;
        }
    }
}
