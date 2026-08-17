package pattern;

/**
 * rectangle
 */
public class rectangle {
    public static void main(String []args){
        int rows=3;
        int col=6;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}