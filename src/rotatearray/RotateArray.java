/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotatearray;

/**
 *
 * @author w.castiblanco
 */
public class RotateArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int period1 = 4;

        int[] array = new int[]{1, 2, 3};
        int period = 4;
        rotateArray(array, period);
    }

    public static void rotateArray(int[] array, int period) {
        int arraySize = array.length;
        for (int i = 0; i < arraySize; i++) {
            int rotate = i - period;
            
            while (rotate < 0) {
                rotate += arraySize;
            }
            System.out.println("Rotate -> "+rotate);

            array[rotate] = array[i];

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
