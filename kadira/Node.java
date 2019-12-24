package edu.chinna.kadira;

/**
 *
 */
public class Node {
    int index;
    int lowlink;
    boolean onStack;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getLowlink() {
        return lowlink;
    }

    public void setLowlink(int lowlink) {
        this.lowlink = lowlink;
    }

    public boolean isOnStack() {
        return onStack;
    }

    public void setOnStack(boolean onStack) {
        this.onStack = onStack;
    }
}

