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
        Scanner in = new Scanner(System.in);
        System.out.println("Please input Grid size: \nExample:30 100 a grid of height 30 and width 100");
        height = in.nextInt();
        width = in.nextInt();
        grid = new char[height][width];
        System.out.println("Please input the via cost: ");
        via = in.nextInt();
        //intialise grid;
        System.out.println("Please input the cells' locations, enter -1 when done: \nExample: 3 2 \n\t 4 5\n\t-1");
        int t1=0, t2=0;
        t1 = in.nextInt();
        while(t1 != -1){
            t2 = in.nextInt();
            grid[t1][t2] = 'c';
            t1 = in.nextInt();
        }
        System.out.println("Please specify the target cells locations and the starting cell");
        
        // input the grid size and via cost
        // input cell locations
        // input connections???
        // input start and target       
        // start alogirthm 
        // print grid with path
        // new start and target with the prev path in the grid!
    }
    
}
