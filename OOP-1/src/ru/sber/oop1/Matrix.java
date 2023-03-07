package ru.sber.oop1;

public class Matrix {
    private static double[][] values;
    private int n;  // число столбцов
    private int m;  // число строк

    Matrix(int n0,int m0){
        n = n0;
        m = m0;
        values = new double[n][m];
    }

    public static void setValues(int i, int j, double value) {
        values[i][j] = value;
    }

    public void summMatrix(double[][] a){
        for(int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                values[i][j] = values[i][j] + a[i][j];
            }
        }
    }
    public void multiMatrix(int c){
        for(int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                values[i][j] = values[i][j]*c;
            }
        }
    }

    public void printMatrix(){
        for(int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                System.out.print(values[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void matrixXmatix(double[][] a,double[][] b){//умножение матрицы на матрицу а результат матрица b
        for(int j=0;j<n;j++) {
            for (int i=0;i<a[0].length;i++) {
                for (int k=0;k<a.length;k++){
                    b[i][j] = values[j][k]*a[k][j]+b[i][j];
                }
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
