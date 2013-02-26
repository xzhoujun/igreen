package com.chinasofti.basic.framework.common;

import java.util.ArrayList;

public class ParamsList<Params> extends ArrayList<Params> {

	public void addParams(int index, Params p) {
		super.add(index, p);
	}

	public void addParams(Params p) {
		super.add(p);
	}

	public Params getParams(int index) {
		return super.get(index);
	}

	public int indexofParams(Params p) {
		return super.indexOf(p);
	}

	public void removeParams(int index) {
		super.remove(index);
	}

}
