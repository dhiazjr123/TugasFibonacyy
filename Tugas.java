import java.util.ArrayList;
import java.util.List;

public class Tugas {
    public static void main(String[] args) {
        int limit = 4500;
        List<Integer> fibonacciSeries = generateFibonacciSeries(limit);

        List<Integer> evenFibonacciNumbers = new ArrayList<>();
        int sum = 0;

        for (int num : fibonacciSeries) {
            if (num % 2 == 0) {
                evenFibonacciNumbers.add(num);
                sum += num;
            }
        }

        System.out.println("Deretan bilangan Fibonacci yang genap: " + evenFibonacciNumbers);
        System.out.println("Total bilangan Fibonacci yang genap: " + evenFibonacciNumbers.size());
        System.out.println("Jumlah dari bilangan Fibonacci yang genap: " + sum);
    }

    public static List<Integer> generateFibonacciSeries(int limit) {
        List<Integer> series = new ArrayList<>();
        series.add(0);
        series.add(1);

        int i = 2;
        int nextNum = series.get(i - 1) + series.get(i - 2);
        while (nextNum <= limit) {
            series.add(nextNum);
            i++;
            nextNum = series.get(i - 1) + series.get(i - 2);
        }

        return series.subList(2, series.size());
    }
}






