import java.util.*;
public class Main{
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = (r.nextInt(8)+1)*2;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter number to highlight: ");
        int h = sc.nextInt();

        int count = 0;
        System.out.println("Result:");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==h){
                    System.out.print("["+a[i][j]+"] ");
                    count++;
                }else{
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }

        System.out.println("Count: "+count);
    }
}

// PS C:\Users\gopib\Desktop\Task> javac Main.java
// PS C:\Users\gopib\Desktop\Task> java Main.java
// Enter array size: 4
// 14 12 4 8 
// 16 10 10 12 
// 2 16 14 10 
// 6 12 2 8 
// Enter number to highlight: 10
// Result:
// 14 12 4 8 
// 16 [10] [10] 12 
// 2 16 14 [10] 
// 6 12 2 8 
// Count: 3