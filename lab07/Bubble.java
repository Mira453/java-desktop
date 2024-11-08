package lab07;

public class Bubble implements Strategy {
    public void sort(byte[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-i ; j++){
                if(array[j]< array[j+1]){
                   byte k = array[j];
                    array[j] = array[j+1];
                    array [j+1]=k;
                }
            }
        }
        for (byte num : array) {
            System.out.print( num + " ");
        }
        System.out.println();
    }
}
