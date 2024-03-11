public class rotateArray {
    public static int[][] rotate(int[][] matric){
        for (int i=0;i<matric.length;i++) {
            for (int j = i; j < matric[i].length; j++) {
                int k = matric[i][j];
                matric[i][j] = matric[j][i];
                matric[j][i] = k;
            }
        }
        for(int i=0;i<matric.length;i++) {
            for (int j = 0; j < (matric[i].length) / 2; j++) {
                int k = matric[i][j];
                matric[i][j] = matric[i][matric[i].length - 1 - j];
                matric[i][matric[i].length - 1 - j] = k;
            }
        }
        return matric;
    }
    public static void main(String[] args) {
            int[][] array = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };
            System.out.println("原矩阵：");
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }
            rotate(array);
            System.out.println("旋转矩阵：");
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }

        }
}
