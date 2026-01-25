import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Testing {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the no of times to rotate: ");
//        int d=sc.nextInt();
        int[] a={1,2,3,4,5,6,7};
//        if(d<0)
//            d=d+a.length;
//        d=d%a.length;
//        for(int j=0;j<d;j++){
//            int temp=a[0];
//            for(int i=1;i<a.length;i++){
//                a[i-1]=a[i];
//            }
//            a[a.length-1]=temp;
//        }
//        System.out.println(Arrays.toString(a));
        int length = a.length;
        int rotations = 3;
        int[] o = IntStream.concat(
                IntStream.range(length - rotations, length),
                        IntStream.range(0, length - rotations)
                )
                .map(p -> a[p]).toArray();
        System.out.println(Arrays.toString(o));

        int rotationsLeft = 3 ;
        int[] rotateLeft = IntStream.concat(
                        IntStream.range(rotationsLeft , length),
                        IntStream.range(0, rotationsLeft)
                )
                .map(p -> a[p]).toArray();
        System.out.println(Arrays.toString(rotateLeft));
    }
}
