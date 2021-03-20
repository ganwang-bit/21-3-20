import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

//public class Test {
//    public static int plus(int a,int b){
//        return a+b;
//    }
//    public static double plus(double a,double b){
//        return a+b;
//    }
//    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        System.out.println(plus(a,b));
//        double c=20;
//        double d=30;
//        System.out.println(plus(c,d));
//        System.out.println(plus(a,b));
//    }
//}
//import java.util.Scanner;
//public class Test {
//    public static int func(int n){
//        if(n==1)
//            return 1;
//        else
//            return n*func(n-1);
//    }
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        System.out.println(func(n));
//    }
//}
//import java.util.Scanner;
//public class Test {
//    public static void hannuota(int n,char a,char b,char c){
//        if(n==1)
//            System.out.println(a+"->"+c);
//        else{
//            hannuota(n-1,a,c,b);
//            System.out.println(a+"->"+c);
//            hannuota(n-1,b,a,c);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        hannuota(n,'A','B','C');
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        int[] arr={1,2,3,4,5,6,7,8,9};
//        for(int val:arr){
//            System.out.print(val+" ");
//        }
//        System.out.println();
//        System.out.println(arr.length);
//    }
//}
//public class Test {
//    public static void printAarr(int[]arr){
//        for(int x:arr){
//            System.out.println(x);
//        }
//    }
//    public static void main(String [] args){
//        int[] arr={1,2,3,4,5,6};
//        printAarr(arr);
//    }
//}
//import java.util.Arrays;
//public class Test {
//    public static void main(String[] args) {
//        int [] arr={1,2,3,4,5,6};
//        String str=Arrays.toString(arr);
//        System.out.println(str);
//        int[] arr2=null;
//        System.out.println(arr2);
//    }
//}
//import java.util.Arrays;
//public class Test {
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7};
//        int[] arr2=Arrays.copyOf(arr,arr.length);
//        String str=Arrays.toString(arr2);
//        System.out.println(str);
//    }
//}
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr2=arr.clone();
        System.out.println(Arrays.toString((arr2));
        int[][] arr3=new int[3][4];

    }
}