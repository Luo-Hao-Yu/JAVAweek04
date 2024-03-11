public class selectSort {
    public static class SelectSort {
        public int[] sort(int arr[]) {
            int temp = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[minIndex] > arr[j]) {
                        minIndex = j;
                    }
                }
                if (i != minIndex) {
                    temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
            return arr;
        }
    }

        public static void main(String[] args) {
            SelectSort selectSort = new SelectSort();
            int[] array = {2, 5, 1, 6, 4, 9, 8, 5, 3, 1, 2, 0};
            int[] sort = selectSort.sort(array);
            for (int num : sort) {
                System.out.print(num + "\t");
            }
        }
    }

