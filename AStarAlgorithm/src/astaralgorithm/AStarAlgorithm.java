/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astaralgorithm;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author AreeG
 */
public class AStarAlgorithm {

    
    private int[][] grid;
    private int m1;
    private int m2;
    private int m3;
    private int via;
    private TreeMap <HashMap<Integer,Integer>, HashMap<Integer,Integer>> current = new TreeMap<>();
    private HashMap<Integer, Integer> path;
    
    private int getH (int target_x, int target_y, int node_x, int node_y){
        return Math.abs(target_x - node_x) + Math.abs(target_y - node_y);
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        // input the grid size and via cost
        // input cell locations
        //input connections???
        
    }
    
}
