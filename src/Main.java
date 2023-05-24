import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] fixedResult = {10, 12, 14, 31, 46, 47};
        int[] randResult = new int[6];
        int counter = 1;

        do {
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

            //Wyświetlanie losowej posortowanej tablicy
            BubbleSort.BubbleSort(randResult);

            counter++;
            System.out.println(counter);

            for (int x : randResult) {
                System.out.print(x + " ");
            }
            System.out.println();

        } while (fixedResult[0] != randResult[0]
                || fixedResult[1] != randResult[1]
                || fixedResult[2] != randResult[2]
                || fixedResult[3] != randResult[3]);

        System.out.println("----------------");

        for (int x : fixedResult) {
            System.out.print(x + " ");
        }
    }
}