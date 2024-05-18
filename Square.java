import java.util.Scanner;

public class Square {
    //A square of positive (strictly greater than 0) area is located on the coordinate plane, with sides
    // parallel to the coordinate axes. You are given the coordinates of its corners, in random order.
    //Your task is to find the area of the square.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            int x4 = sc.nextInt();
            int y4 = sc.nextInt();
            int ans=0;
            int d1,d2=0;
            if(y1==y2){
                Math.pow(x1-x2,2);
            }
        }
    }
}
