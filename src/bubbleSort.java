class Bubble {
    public int[] sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        return array;
    }
}
public class bubbleSort {

    public static void main(String[] args) {
            Bubble bubble = new Bubble();
            int[] array = {2, 5, 1, 6, 4, 9, 8, 5, 3, 1, 2, 0};
            int[] sort = bubble.sort(array);
            for (int num : sort) {
                System.out.print(num + "\t");



            }
    }
}
