package part1.Day04;

/*
查漏补缺
 */
public class Demo01 {
    //    二维数组的遍历
    public static void main(String[] args) {
        //杨辉三角
        int[][] a = new int[10][];

        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
            a[i][0] = a[i][i] = 1; //首位末尾位赋值为1

                for (int j = 1; j < a[i].length-1; j++) {
                    a[i][j]=a[i-1][j-1] + a[i-1][j];
                }

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }

    }
}
/*int[][] a = new int[2][];
        int[][] b = {{123},{},{456},{789}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(b[i][j]);
            }
        }*/