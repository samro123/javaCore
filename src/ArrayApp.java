public class ArrayApp {
    public static void main(String[] args) {
        int[] lotteryNumbers = new int[5];

        lotteryNumbers[0] = 1;
        lotteryNumbers[1] = 2;
        lotteryNumbers[2] = 3;
        lotteryNumbers[3] = 4;
        lotteryNumbers[4] = 5;
        for (int lotteryNumber: lotteryNumbers){
            System.out.println(lotteryNumber);
        }

        int[][] mulArray = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        for (int i = 0 ; i < mulArray.length ; i++){
            for (int j =0 ; j < mulArray[i].length; j++){
                System.out.print(mulArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
