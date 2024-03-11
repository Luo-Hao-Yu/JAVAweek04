public class creatArray {
    public static void main(String[] args) {
        int[] myList;
        myList = new int[10];
        myList[0] = 1;
        myList[1] = 2;
        myList[2] = 3;
        myList[3] = 4;
        myList[4] = 5;
        myList[5] = 6;
        myList[6] = 7;
        myList[7] = 8;
        myList[8] = 9;
        myList[9] = 10;
        double total = 0;
        for (int i = 0;i < myList.length;i++){
            total +=myList[i];
        }
        System.out.println("总和为："+total);
    }
}
