/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples.Jugs;

/**
 *
 * @author santiago
 */
import Framework.BreadthFirstEngine;
import java.util.*;

import Framework.DepthFirstEngine;
import Framework.IterativeDeepeningEngine;

public class appSearch {

    public static void main(String[] args) {

        if (false/*(args.length > 2) || (args.length == 0)*/) {
            System.out.println("*** Usage: java appSearch <int> <int>");
        } else {
            int width = 0;//Integer.parseInt(args[0]);
            int height = 0;//Integer.parseInt(args[1]);
            JugsSearchProblem p = new JugsSearchProblem(width, height);

            BreadthFirstEngine<JugsState> engine2 = new BreadthFirstEngine<JugsState>(p);
            boolean success = engine2.performSearch();
            System.out.println();
            System.out.println("*** Result using depth-first search ***");
            System.out.println("Solution found? " + success);
            if (success) {
                System.out.print("Path to goal: ");
                List<JugsState> path = engine2.getPath();
                for (int i = 0; i < path.size(); i++) {
                    JugsState current = path.get(i);
                    System.out.print(current.toString());
                }
                System.out.println();
            }
            engine2.report();

        }

    } // end of main

} // end of appSe
