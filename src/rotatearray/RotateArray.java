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
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int period = 7;

        int[] array1 = new int[]{1, 2, 3};
        int period1 = 5;
        rotateArray(array, period);
    }

    public static void rotateArray(int[] array, int period) {
        int[] result = new int[array.length];
        int arraySize = array.length;
        for (int i = 0; i < arraySize; i++) {
            int rotate = i - period;
            
            while (rotate < 0) {
                rotate += arraySize;
            }

            result[rotate] = array[i];
        }
    }

}
