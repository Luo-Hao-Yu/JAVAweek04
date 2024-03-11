public class irregularArray {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1,2,3};
        jaggedArray[1] = new int[]{4,5,6,7};
        jaggedArray[2] = new int[]{8,9,10};
        for(int i=0;i<3;i++){
            for(int element:jaggedArray[i]){
                System.out.println(element);
            }
        }
    }
}
