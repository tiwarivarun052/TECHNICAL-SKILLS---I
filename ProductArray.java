// Q(2): Given an array of integer a, find and return the product array of the same size where ith element of the product array will be equal to the product of all the
// elements divided by the ith element of the array.
// eg: a=[1,2,3,4,5]; product=120; new a=[120,60,40,24].
// eg: a=[5,1,10,1]; product=50; new a=[10,50,5,50].


public class ProductArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int product = 1;
        for (int i = 0; i < a.length; i++) {
            product = product * a[i];
        }
        int[] productArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            productArray[i] = product / a[i];
        }
        for (int i = 0; i < productArray.length; i++) {
            System.out.print(productArray[i] + " ");
        }
    }
}

