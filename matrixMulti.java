import java.util.Scanner;
class matrixMulti{
    public static void main(String[] args){
        // intialize variables
        int i,j,k,row1,col1,row2,col2,sum=0;
        Scanner in = new Scanner(System.in);
        // read row column of first matrix
        System.out.print("Enter row and column of 1st matrix: ");
        row1=in.nextInt();
        col1=in.nextInt();
        // read first matrix
        int ar1[][] = new int[row1][col1];
        System.out.println("Enter elements of first matrix: ");
        for (i=0;i<row1;i++){
            for(j=0;j<col1;j++){
                ar1[i][j]=in.nextInt();
            }
        }
        //read row column of second matrix
        System.out.print("Enter row and column of 2nd matrix: ");
        row2=in.nextInt();
        col2=in.nextInt();
        // check if multiplication possible
        if (col1 != row2){
            System.out.println("Multiplication not possible!!!");
        }
        else{
            // read second matrix
            int ar2[][] = new int[row2][col2];
            System.out.println("Enter elements of second matrix: ");
            for (i=0;i<row1;i++){
                for(j=0;j<col1;j++){
                    ar2[i][j]=in.nextInt();
                }
            }
            // mulitply both matrix and store it in third matrix
            int ar3[][] = new int[row1][col2];
            for(i=0;i<row1;i++){
                for(j=0;j<col2;j++){
                    for(k=0;k<row2;k++){
                        sum+=ar1[i][k]*ar2[k][j];
                    }
                ar3[i][j]=sum;
                sum=0;
                }
            }
            // print third matrix
            System.out.println("multiplied Matrix: ");
            for (i=0;i<row1;i++){
                for(j=0;j<col2;j++){
                    System.out.print(ar3[i][j]+" ");
                }
                System.out.println();
            }
        }
        
    }
}