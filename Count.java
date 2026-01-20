// Q : Given an array count number of elements having at least one element greater than itself. 
// Example : array = [ 0, 15, 14, 54, 68, 23, 45, 98 ]
// Observation : For every max element there is no element greater than itself
// Pseudo code : (1)Iterate and find the max element.(2)Iterate and get the number of elements that are not equal to max.(3)Increment the count.
public class Count {
    public static void main(String[] args) {
        int[] a = {0, 15, 14, 54, 68, 23, 45, 98};
        int count=0;
        int max=0;
        for (int i=0; i<a.length; i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        for (int i=0; i<a.length; i++){
            if (a[i]<max){
                count++;
            }
        }
        System.out.println(count);
    }
}