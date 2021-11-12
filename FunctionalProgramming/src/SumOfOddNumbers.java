import java.util.List;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        List<Integer> numbers= List.of(4,6,8,13,3,15);
        int sum=numbers.stream().filter(number->number%2==1).reduce(0,(number1,number2)-> number1+number2);
        System.out.println(sum);
    }
}
