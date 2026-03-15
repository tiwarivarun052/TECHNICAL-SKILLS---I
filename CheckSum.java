// Q: GIven N array elements, check if there exits a pair (i,j)
// such that arr[i]+arr[j]==k and j!=i.
// Note: I and J are index value K is given sum.
// eg: arr=[3,-2,1,4,3,6,8].
// k=10

public class CheckSum {
    public static void main(String[] args) {
        int[] arr = {3,-2,1,4,3,6,8};
        int k = 10;
        boolean found = false;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                if (i!=j && arr[i]+arr[j]==k) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (found) {
            System.out.println("Pair exists.");
        } else {
            System.out.println("Pair does not exist.");
        }
    }
}
