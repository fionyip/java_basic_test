
//Write a function in C++/Java to calculate the summation of 2,5,8,…. until a number < 1000.
public class summation {
    public static void main(String[] args) {
        int startAt = Integer.parseInt(args[0]);
        int largestNum = Integer.parseInt(args[1]);
        int output = 0;
        for (int i = startAt; i < largestNum; i = i + 3 ) {
            output += i;
        }
        System.out.println(output);
    }
}
