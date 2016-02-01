package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 2;
        arr[1] = 10;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 7;
        arr[5] = 6;
        arr[6] = 5;
        arr[7] = 4;
        arr[8] = 3;
        arr[9] = 9;

        QuickSorter sorter = new QuickSorter();
        sorter.sort(arr);

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if (i<arr.length-1)
                System.out.print(",");
        }

    }

    public static class QuickSorter {
        private int[] numbers;
        private int number;

        public void sort(int[] values) {

            if (values == null || values.length == 0) {
                return;
            }
            this.numbers = values;
            number = values.length;
            QuicksortRecursion(0, number - 1);
        }

        private void QuicksortRecursion(int low, int high) {
            int low1 = low, high1 = high;
            int pivot = numbers[low + (high - low) / 2];

            System.out.println("low="+low + ",High="+high + ",pivot="+pivot);
            for (int count=0;count<numbers.length;count++){
                System.out.print(numbers[count]);
                if (low1<numbers.length-1)
                    System.out.print(",");
            }

            while (low1 <= high1) {
                while (numbers[low1] < pivot) {
                    low1++;
                }
                while (numbers[high1] > pivot) {
                    high1--;
                }

                if (low1 <= high1) {
                    exchange(low1, high1);
                    low1++;
                    high1--;
                }
            }
            System.out.println("\n=======================================");
            if (low < high1)
                QuicksortRecursion(low, high1);
            if (low1 < high)
                QuicksortRecursion(low1, high);
        }

        private void exchange(int i, int j) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            System.out.print("\nreplacing :"+numbers[i]+","+numbers[j]);
        }
    }
}
