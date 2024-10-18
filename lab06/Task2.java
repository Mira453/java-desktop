package lab06;

public class Task2 {
    public static void main(String[] args) {
        printArr(new byte[]{1,3,2,4,3,6,1,3});
        printArr(new byte[]{1,6,2,3,0});
        printArr(new byte[]{4,5,1,2,7,8,5,9});
        printArr(new byte[]{4,6,0,0,4,3,7});
    }
    public static byte[] Insertion(byte[] array )
    {
        for (int i = 1; i < array.length; i++ ){
            int j = i-1;
            byte n = array[i];
            while( j >= 0 && n > array[j]){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = n;
        }
        return array;
    }
    public static void printArr(byte[] array){
        System.out.print("Початковий масив: ");
        for (byte num : array) {
            System.out.print( num + " ");
        }
        System.out.println();
        System.out.print("Відсортований масив: ");
        byte[] result = Insertion(array);
        for (byte num : result) {
            System.out.print( num + " ");
        }
        System.out.println();
    }

}
