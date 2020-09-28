
package com.company;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Polynom p = new Polynom(new double[]{-10, 2, -3, -1});
        Polynom p8 = new Polynom(new double[]{-1, 2, -3, -1, 2});
       // System.out.println(p);
        System.out.println(p.mul(p8));
        System.out.println(p8.plus(p));
        System.out.println(p);
        System.out.println(p.invoke(3));
        System.out.println("Введите число узлов: ");
        int n = in.nextInt();
        double[] X = new double[n];
        for (int i = 0; i < X.length; i++) {
            System.out.println("Введите " + i + "ый коэффициент");
            X[i] = in.nextDouble();
         // Х- это одномерный массив!
        }
        System.out.println("Введите значения на узлах : ");
        int m = n;
        double[] Y = new double[m];
        Polynom p3 = new Polynom(new double[]{1, 0});
        Polynom p4 = new Polynom (new double[] {0});

        for (int i = 0; i < X.length; i++) {
            System.out.println("Введите значение " + i + "го узла");
            Y[i] = in.nextDouble();}

        for (int j=0; j <n; j++){
            for ( int i=0; i<n; i++){
                if( j !=i){
                Polynom p1 = new Polynom(new double[]{-X[i],  1});
                    p3= p1.mul(p3);
                     p3=p3.div(X[j]- X[i]);
                    System.out.println("этап"+ j + ": " + p3 );
                }
            }
            p4 =p4.plus( p3.div(1/Y[j]));
            System.out.println("р4 выводим2:");
            System.out.println( p4 );
            System.out.println( p3.times(Y[j]));
            p3 = new Polynom(new double[]{1, 0});

            }

        System.out.println("получившийся полином:");
        System.out.println( p4 );

        }
       // System.out.println("получившийся полином:");



    }


