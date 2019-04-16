/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astaralgorithm;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import javafx.util.Pair;

/**
 *
 * @author AreeG
 */
public class AStarAlgorithm {

    
    private static char[][] grid;
    private static int height;
    private static int width;
    private int m1;
    private int m2;
    private int m3;
    private static int via;
    private TreeMap <Integer, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>>> current = new TreeMap<>();
    private HashMap<Integer, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>>> path = new HashMap<>();
    
    private static int getH (int target_x, int target_y, int node_x, int node_y){
        return Math.abs(target_x - node_x) + Math.abs(target_y - node_y);
    }
    
    private static int getF (int g, int h){
        return g + h;
    }
    
    private static void intialiseGrid (){
        for (int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                grid[i][j] = '.';
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*input file example:
            30 100 6 //height width via_cost
            3 2 //cell1
            1 0  //cell2
            0 0 //cell3
            30 50 //cell4
            20 60 //cell5
            -1  //done
        */
        Scanner in = new Scanner(System.in);
        height = in.nextInt();
        width = in.nextInt();
        grid = new char[height][width];
        via = in.nextInt();
        //intialise grid;
        int t1=0, t2=0;
        t1 = in.nextInt();
        while(t1 != -1){
            t2 = in.nextInt();
            grid[t1][t2] = 'c';
            t1 = in.nextInt();
        }
        // input pre connections???
        System.out.println("Please specify the target cells locations and the starting cell, to end enter -1");
        int response = in.nextInt();
        while(response != -1){
           int t_x, t_y, s_x, s_y;
           t_x = response;
           t_y = in.nextInt();
           s_x = in.nextInt();
           s_y = in.nextInt();
           // start alogirthm 
          // print grid with path
          System.out.println("Please specify the target cells locations and the starting cell, to end enter -1");
          response = in.nextInt(); 
        }
        // new start and target with the prev path in the grid!
    }
    
}
