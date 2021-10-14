package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Random RandNum = new Random();
        int[][] population;
        population = new int[1000][2];
        for(int i = 0 ; i < 1000 ; i++) {
            if (RandNum.nextInt(100)>90){
                population[i][0]= 1;
            }
            population[i][1]= 0;

        }


        for(int t = 0 ; t < 10 ; t++) {
            int infected = 0;
            int imune = 0;
            for (int i = 0; i < 1000; i++) {
                if (population[i][0] == 1){
                    infected++;
                }
                if (population[i][1] == 1) {
                    imune++;
                }
            }
            System.out.println("infected"+infected);
            System.out.println("imune"+imune);

            for (int i = 0; i < 1000; i++) {
                if (population[i][0] == 1) {
                    if (population[i][1] == 0) {
                        population[RandNum.nextInt(1000)][0] = 1;
                        population[RandNum.nextInt(1000)][0] = 1;
                        population[i][1] = 1;
                    }
                    population[i][0] = 0;
                }

            }
        }



    }
}
