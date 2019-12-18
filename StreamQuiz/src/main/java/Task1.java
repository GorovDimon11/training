
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        int array[] = {1,5,8,0,6,3,8,-6,4,-4,9,0,5,-2,5,2,7,9,2,9,5};

        System.out.println(IntStream.of(array)
                .average()
                .getAsDouble());

        int sum = IntStream.of(array).sum();
        long count = IntStream.of(array).count();
        double avarage2 = (double)sum/count;
        System.out.println(avarage2);

        IntStream.range(0, array.length)
                .filter(i -> array[i] == IntStream.of(array).min().getAsInt() )
                .forEach(i -> System.out.println(array[i] +" index: " + i));

        System.out.println(IntStream.of(array)
                .filter(i -> i == 0)
                .count());

        System.out.println(IntStream.of(array)
                .filter(i -> i > 0)
                .count());

        IntStream.of(array)
                .map(i -> i*2).forEach(i -> System.out.print(i+" "));

    }
}
