package com.company;
import java.util.HashSet;

public class Main {
    public static int[][] Grille = new int[9][9];

    public static boolean TousDifferent(int[] tab9){
        int i, j;
        for (i = 0; i < 9; i++ ){
            for (j = 0; j < 9; j++ ) {
                if (tab9[i] == tab9[j] && i != j) {
                    return false;
                }
            }
        }
        return true;
    }
    public static int [][] RemplirGrille(int [][]grille){
        int[] tab9;
        int i, j = 0;
        for ( i = 0; i < 9; i++ ){
            for ( j = 0; j < 9; j++) {
                    grille[i][j] = (int) (Math.random() * 9 + 1);
                System.out.print(grille[i][j] + "  ");
            }
            System.out.println();
        }
        return grille;
    }
    static boolean VerifLignes(int[][] grille){
        int i, j = 0;

        for ( i = 0; i < 9; i++ ){
            int [] tab9 = grille[i];
            for ( j = 1; j < 9; j++) {
                tab9[i] = (int) grille[i][j];
            }
            if (!TousDifferent(tab9)){
                return false;
            }
        }
        return true;
    }

    static boolean VerifColonnes(int [][]grille){
        int i, j = 0;

        for ( i = 0; i < 9; i++ ){
            int [] tab9 = grille[i];
            for ( j = 1; j < 9; j++) {
                tab9[i] = (int) grille[j][i];
            }
            if (!TousDifferent(tab9)){
                return false;
            }
        }
        return true;
    }
    static boolean VerifSousGrille(int [][]grille){
        int i, j = 0;

        for ( i = 0; i < 9; i++ ){
            int [] tab9 = grille[i];
            for ( j = 1; j < 9; j++) {
                tab9[i] = (int) grille[j][i];
            }
            if (!TousDifferent(tab9)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        RemplirGrille(Grille);
        System.out.println("VerifLignes : "+VerifLignes(Grille));
        System.out.println("VerifColonnes : "+VerifColonnes(Grille));
        System.out.println("VerifSousGrilles : ");
    }

}
