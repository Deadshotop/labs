

public class Main {

    public static void main(String[] args) {
        int[] d = new int[14];
        double[] x = new double[15];
        double[][] d1 = new double[14][15];

        short a = 4;

        for (int i = 0; i < 14; i++){
            d[i] = a;
            a++;
        }

        for (int i = 0; i < 15; i++){
            x[i] = Math.random() * 11.0 - 6.0;
        }

        for (int i = 0; i < 14; i++){
            for (int j = 0; j < 15; j++){
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
        }
        System.out.println();
    }
}