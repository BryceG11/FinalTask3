package com.company;

public class Main {

    public static void main(String[] args) {
        int Fruit[][] = new int[3][4];
        for(int i=0;i<3;i++){
            Fruit[i][0]=1;
            Fruit[i][1]=2;
            Fruit[i][2]=3;
            System.out.println(Fruit[i][0]);
            for(int x=0;x<4;x++){
                Fruit[0][x]=4;
                Fruit[1][x]=5;
                Fruit[2][x]=6;
                System.out.println(Fruit[i][x]);
            }
        }

        int Juice[] = {11, 10, 13};
        int Candy[] = Juice.clone();

        for (int i=0; i<Candy.length; i++){
            System.out.println(Candy[i]);
        }

        int Limes[] = {6, 2, 5, 1};
        sum(Limes);

    }
    public static void sum(int[] Limes){
        int sum = 0;

        for(int i=0; i<Limes.length; i++){
            sum+=Limes[i];
            System.out.println(sum);
        }
    }
}

