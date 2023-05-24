import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        int[] randResult = new int[6];

            //Number 1
            randResult[0] = random.nextInt(48) + 1;

            //Number 2
            randResult[1] = random.nextInt(48) + 1;

            if (randResult[1] == randResult[0]) {
                randResult[1] = random.nextInt(48) + 1;
            }

            //Number 3
            randResult[2] = random.nextInt(48) + 1;
            if (randResult[2] == randResult[1] || randResult[2] == randResult[0]) {
                randResult[2] = random.nextInt(48) + 1;
            }

            //Number 4
            randResult[3] = random.nextInt(48) + 1;
            if (randResult[3] == randResult[2] || randResult[3] == randResult[1]
                    || randResult[3] == randResult[0]) {
                randResult[3] = random.nextInt(48) + 1;
            }

            //Number 5
            randResult[4] = random.nextInt(48) + 1;
            if (randResult[4] == randResult[3] || randResult[4] == randResult[2]
                    || randResult[4] == randResult[1] || randResult[4] == randResult[0]) {
                randResult[4] = random.nextInt(48) + 1;
            }

            //Number 6
            randResult[5] = random.nextInt(48) + 1;
            if (randResult[5] == randResult[4] || randResult[5] == randResult[3] || randResult[5] == randResult[2]
                    || randResult[5] == randResult[1] || randResult[5] == randResult[0]) {
                randResult[5] = random.nextInt(48) + 1;
            }

            BubbleSort.BubbleSort(randResult);

        for (int x : randResult) {
            System.out.print(x + " ");
        }

    }
}
