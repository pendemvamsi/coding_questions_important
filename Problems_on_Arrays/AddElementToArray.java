import java.util.*;

public class AddElementToArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // read array size
        int n = sc.nextInt();

        int[] arr = new int[100];

        // read array elements
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // position to insert
        int pos = sc.nextInt();

        // element to insert
        int value = sc.nextInt();

        // shift elements right
        for(int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        // insert element
        arr[pos] = value;

        n++;

        // print result array
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}