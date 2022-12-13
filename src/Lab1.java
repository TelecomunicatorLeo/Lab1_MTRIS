import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab1 {

    private int range;

    public Lab1(){
        range = 0;
    }
    public Lab1(int range){
        this.range = range;
    }

    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Lab1 firstObject = new Lab1();
        Lab1 secondObject = new Lab1(7);

        System.out.print("Введіть висоту гілки : ");
        firstObject.range = scanner.nextInt();

        firstObject.Star(firstObject.range);
        firstObject.Array(6,6);

        System.out.println("\nДруга гілка : ");
        secondObject.Star(secondObject.range);
    }

    public void Star(int range){
        int max_star, current_star, space_num;

        max_star = (range-1)*2+1;

        for(int i = 1;i<=range;i++){
            current_star = (i-1)*2+1;
            space_num = (max_star-current_star)/2;

            for(int sp = 0; sp < space_num; sp++){
                System.out.print(" ");
            }
            for(int st = 0; st < current_star; st++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void Array(int n, int m){
        int[][] arr = new int[n][m];
        int buf = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = buf + 3;
                buf = arr[i][j];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(new DecimalFormat( "000 " ).format(arr[i][j]));
            }
            System.out.println();
        }
    }
}
