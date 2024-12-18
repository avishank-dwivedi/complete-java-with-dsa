package arrays;
/* 
import java.util.Scanner;

public class twodarray {
   public static void main(String[] args) {
    int [][]array = new int[4][4];
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int col = sc.nextInt();

    int [][] number = new int[rows][col];
    for(int i = 0 ; i<rows ; i++ ){
        for(int j=0; j<col ; j++){
            number[i][j] = sc.nextInt();
        }
    }
    for(int i=0; i<rows ;i++){
        for(int j=0 ; j<col ; j++){
            System.out.print(number[i][j]+ " ");
        }
        System.out.println();
    }

   } 
    
}
*/

import java.util.Scanner;

public class twodarray {
   public static void main(String[] args) {
    int [][]array = new int[4][4];
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int col = sc.nextInt();
    
    int [][] number = new int[rows][col];
    for(int i=0 ; i<rows; i++){
        for(int j=0; j<col ; j++){
            number[i][j] = sc.nextInt();
        }
    }
    int x =sc.nextInt();

    for(int i=0; i<rows ; i++){
        for(int j=0; j<col; j++){
            if(number[i][j]== x){
                System.out.println("x found at location("+ i+","+j+")");
            }

        }
    }

}
}