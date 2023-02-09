package assignment_1;
//3.  Find out sum of digits of a number
public class Task3 {
    public static int sumDigitsOfANumber(int num){
        int sum = 0;
        while(num !=0) {
            sum += num % 10;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args){
        int number = 152;
        int sum = sumDigitsOfANumber(number);
        System.out.println(sum);

    }
}
