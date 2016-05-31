
package Framework;

import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author santiago
 * @param <S>
 */
public class BestFirstSearchEngine<S extends State> extends AbstractSearchEngine<S>{

    @Override
    public List<S> getPath() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean performSearch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void report() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private boolean iterativeBestFirst(S s) {
         LinkedList<S> abiertos = new LinkedList<S>();
        boolean found = false;
       
        abiertos.add(s);
        while (!abiertos.isEmpty() && (!found)) {
            S state = abiertos.get(0);
            found = problem.success(state);
            List<S> succ_s = problem.getSuccessors(state);
            for (int i = 0; i < succ_s.size(); i++) {
                abiertos.add(succ_s.get(i));
            }
        }
        return found;

    }
}
