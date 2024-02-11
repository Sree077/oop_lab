public class binarySearch {
    public static int binarysearch(int[] ar,int num){
        int left = 0;
        int right = ar.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(ar[mid]<num){
                left=mid+1;
            }
            else if(ar[mid]>num){
                right= mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] ar= {1,2,3,4,5,6,7,8,9};
        int digit = 5;
        int value = binarysearch(ar, digit);
        if(value==-1){
            System.out.println("Number not found in the array.");
        }
        else{
            System.out.println("Number found at "+(value+1)+" position.");
        }
    }  
}
