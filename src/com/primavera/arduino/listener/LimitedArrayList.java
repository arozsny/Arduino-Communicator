package com.primavera.arduino.listener;

import java.util.ArrayList;

public class LimitedArrayList<E> extends ArrayList<E> {
    private int limit=50;

    public LimitedArrayList() {
    }

    public LimitedArrayList(int limit) {
        this.setLimit(limit);
    }

    @Override
    public boolean add(E o) {
        super.add(o);
        while (size() > getLimit()) { super.remove(0); }
        return true;
    }

    public  int getLimit() {
		return limit;
	}
    
	public void setLimit(int limit) {
		this.limit = limit;
		while (size() > getLimit()) { super.remove(0); }
	}
    
    
}
