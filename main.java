import java.util.Arrays;
import java.util.Scanner;
public class Main {
    // arrayAsParameter
    public static void swapFirstandLast(int[] nums) {
        if (nums.length < 1) {
            return;
        }
        int temp = nums[nums.length-1]; // nums.length-1 возвращаем последний элемент массива
                                        // переменную temp нициализировали последним элементом массива
                                        //
        nums[nums.length-1] = nums[0];  // nums[0] первый элемент массива по индексу
        nums[0] = temp;                 // присвоили первому элементу массива последний элемент
        System.out.println(Arrays.toString(nums)); // используем Arrays.toString() чтобы вывод был корректным
                                                   // потому что без этого, компилятор старается массив превратить в String
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] myArray = new int[size];
        for (int i=0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }
        swapFirstandLast(myArray);
    }
}
