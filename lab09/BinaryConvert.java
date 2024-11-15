package lab09;

public class BinaryConvert {
    public static void main(String[] args) {
        int[] array = {2,21,5,7,0,22, 70,50};
        for (int i = 0; i < array.length; i++){
            {
                String binaryString = Integer.toBinaryString(array[i]);
                System.out.println(array[i] + " це " + binaryString);
            }
        }
    }
}

