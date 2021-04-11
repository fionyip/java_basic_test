public class BinarySearch {
    public static void main(String[] args){
        int searchNum = Integer.parseInt(args[0]);

        int[] intArray = { 1, 2 ,6, 8, 9 , 10, 11, 12, 13, 14, 20, 25, 33, 38, 40, 42 };
        int high = intArray.length - 1;
        int small = 0;
        int mid = 0 ;

        while (small <= high){
            mid = (high + small) / 2;
            if (intArray[mid] < searchNum){
                small = mid + 1;
            } else if (intArray[mid] > searchNum){
                high = mid - 1;
                System.out.println(mid);
            } else {
                System.out.println("The index of 33 in arrary");
                System.out.println(mid);
                break;
            }
        }
    }
}
