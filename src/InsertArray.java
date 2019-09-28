import java.util.Scanner;

public class InsertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Max column:= ");
        int maxColumn = sc.nextInt();
        int[] All_arr = new int[maxColumn];
        for (int i = 0; i <maxColumn ; i++) {
            All_arr[i]=(int)(Math.random()*90+10);
            System.out.print(All_arr[i]+" ");
        }
        System.out.println("");
        System.out.printf("Input Value= ");
        int value=sc.nextInt();
        System.out.println("Input Index");
        int index=sc.nextInt();
        All_arr[index]=value;
        System.out.println("Array Insert :");
        for (int i = 0; i <maxColumn ; i++) {
            System.out.print(All_arr[i]+" ");
        }
    }
}
