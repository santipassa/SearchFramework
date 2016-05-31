package Framework;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author santiago
 */
public class BreadthFirstEngine<S extends State> extends AbstractSearchEngine<S> {

    private List<S> visited; // used to store the visited states
    private List<S> path; // used to store the path to the success.
    public BreadthFirstEngine(AbstractSearchProblem<S> p) {
        super(p); 
       
        visited = new LinkedList<S>();
        path = new LinkedList<S>();
    }
    @Override
    public List<S> getPath() {
        return path;
    }

    @Override
    public boolean performSearch() {
       // first, we initialise the data structures for the search
        visited = new LinkedList<S>();
        // we get the initial state
        S initialState = problem.initialState();

        // now we call a recursive method implementing depth-first
        boolean resultSearch = iterativeBreadthFirst(initialState);
        return resultSearch;
    }

    @Override
    public void report() {
        System.out.println("Length of path to state when search finished: " + path.size());
        System.out.println("Number of visited when search finished: " + visited.size());
    }
    

    private boolean iterativeBreadthFirst(S s) {
        Queue<S> q = new LinkedList<S>();
        boolean found = false;
        S state=s;
        q.add(state);
        while (!q.isEmpty() && (!found)) {
            
            state = q.remove();
            if (!visited.contains(state)) {
                visited.add(0, state);
                found = problem.success(state);
                List<S> succ_s = problem.getSuccessors(state);
                for (int i = 0; i < succ_s.size(); i++) {
                    succ_s.get(i).setPadre(state);
                    q.add(succ_s.get(i));
                }
            }
        }
        if(found){
            int i=0;
            path.add(state);
            while(state.getPadre()!=null){
               
                path.add(0,(S)state.getPadre());
                state=(S)state.getPadre();
            }
        
        }
        return found;

    }
}
