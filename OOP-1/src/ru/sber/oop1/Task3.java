package ru.sber.oop1;


public class Task3 {
    public static void main(String[] args){
        double[][] matr = new double[2][2];
        double[][] matr2 = new double[2][2];
        Matrix matrix = new Matrix(2,2);
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                matrix.setValues(i, j, i+j);
            }
        }
        matrix.printMatrix();
        System.out.println();
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                matr[i][j] = 2*i;
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        matrix.summMatrix(matr);
        matrix.printMatrix();
        System.out.println();
        matrix.multiMatrix(2);
        matrix.printMatrix();
        System.out.println();

        matrix.matrixXmatix(matr,matr2);

    }
}
