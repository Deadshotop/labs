public class Main{

    public static double Rnd(int min, int max){
        max -= min;

        return Math.random() * ++max + min;
    }

    public static void main(String[] args) {
        int n = 14, m = 15;
        int[] d = new int[n];
        double[] x = new double[m];
        double[][] d1 = new double[n][m];

        short a = 4;

        for (int i = 0; i < n; i++){
            d[i] = a;
            a++;
        }

        for (int i = 0; i < m; i++){
            x[i] = Rnd(-6, 5);
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(d[i] == 7){
                    d1[i][j] = Math.sin(Math.asin(Math.cos(x[j])));
                }
                else if(d[i] == 4 || d[i] == 5 || d[i] == 8 || d[i] == 12 || d[i] == 14 || d[i] == 15 || d[i] == 17 ){
                    d1[i][j] = Math.pow(Math.tan(Math.log(Math.abs(x[j]))), 1.0 / 3.0);
                }
                else{
                    d1[i][j] = Math.pow(0.5 * (0.75 - Math.sin((Math.pow(x[j], 2 * x[j])) - 2.0 / 3.0) / 0.25), 2) ;
                }
                System.out.printf("%.4f ", d1[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
