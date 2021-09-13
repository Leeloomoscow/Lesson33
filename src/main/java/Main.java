public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 6, 9, 4, 153, 0};
        int temp; //Временное хранилище
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < nums.length - 1; i++) { //-1 пишем чтобы отнять одно значение чтобы не выйти за границы массива
                if (nums[i] > nums[i + 1]) {
                    temp = nums[i]; // Сохранение значения из нулевого индекса, чтобы не потерять 0
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    sorted = false;

                }
            }
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }
}

