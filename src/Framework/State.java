/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import java.util.Comparator;

/**
 *
 * @author santiago
 */
public abstract class State {
    protected  State padre=null;

    public State getPadre() {
        return padre;
    }

    public void setPadre(State padre) {
        this.padre = padre;
    }
    

    /**
     * Checks whether 'this' is equal to another state. This must be implemented
     * by every concrete class implementing State.
     *
     * @param other is the state to compare 'this' to.
     * @return true iff 'this' is equal, as a state, to 'other'.
     * @pre. other!=null.
     * @post. true is returned iff 'this' is equal, as a state, to 'other'.
     */
    abstract public boolean equals(State other);

    /**
     * Returns a representation as a string of the current state. This method
     * must be implemented by all concrete classes implementing State.
     *
     * @return a string representing the current state.
     * @pre. true.
     * @post. A text representation of the current state is returned.
     */
    @Override
    abstract public String toString();
    
    abstract public int getValue();
    
    

}
