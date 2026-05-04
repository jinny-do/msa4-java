package com.msa4java.edu;

public class E04For {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++){
            System.out.printf("** %d단 **\n",i);
            String strDan = String.format("**%d단**",i);
            System.out.println(strDan);
            for( int j = 1; j<10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }

        }
    }
}
