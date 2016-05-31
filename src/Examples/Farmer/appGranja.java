/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples.Farmer;

/**
 *
 * @author santiago
 */
import Framework.BreadthFirstEngine;
import java.util.*;

import Framework.DepthFirstEngine;
import Framework.IterativeDeepeningEngine;

public class appGranja {

    public static void main(String[] args) {

        ProblemaGranja p = new ProblemaGranja();
        BreadthFirstEngine<EstadoGranja> engine1 = new BreadthFirstEngine<EstadoGranja>(p);
        boolean success = engine1.performSearch();
        System.out.println();
        System.out.println("*** Result using depth-first search ***");
        System.out.println("Solution found? " + success);
        if (success) {
            System.out.print("Path to goal: ");
            List<EstadoGranja> path = engine1.getPath();
            for (int i = 0; i < path.size(); i++) {
                EstadoGranja current = path.get(i);
                System.out.print(current.toString());
            }
            System.out.println();
        }
        engine1.report();

    } // end of main

} // end of appGranja
