import java.lang.reflect.Array;
import java.util.Comparator;

public class Test9 {

    public static void main(String args[]){
        double[][] x = {{3,1},{2,-1},{2,0}};

        print2D(x);

        java.util.Arrays.sort(x, (e1,e2) ->{
            if(e1[1] - e2[1] != 0){
                return (e1[1] < e2[1]) ? -1 : (e1[1] == e2[1]) ? 0 : 1;
            }
            else {
                return (e1[0] < e2[0]) ? -1 : (e1[0] == e2[0]) ? 0 : 1;
            }
        });
        System.out.println("");

        print2D(x);
    }


    public static void print2D(double mat[][])
    {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++)
 
            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
    }
}
