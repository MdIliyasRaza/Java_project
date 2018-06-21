import java.util.Arrays;
public class sortArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,8,2,5,9,3,6,4,7,15,21,12};//this is the array of ints, it can change
        Arrays.sort(nums);                              
        int[] swapped= swap(nums);                       
        System.out.println(Arrays.toString(swapped));   
    }
    public static int[] swap(int[] arr) {
        int[] returnArr = new int[arr.length];
        returnArr[0] = arr[0];
        int arrCounter = 2;
        for (int i = 1; i < arr.length - 1; i++) {
            returnArr[i]=arr[arrCounter];
            if(i%2==0){
                arrCounter+=3;
            }else{
                arrCounter--;
            }
        }
        if(arr.length%2==0){
            returnArr[returnArr.length-1]=arr[arr.length-1];
        }else{
            returnArr[returnArr.length-1]=arr[arr.length-2];
        }
        return returnArr;
    }
}