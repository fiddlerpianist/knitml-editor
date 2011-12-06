package com.knitml.dsl.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.knitml.core.model.directions.Operation;

public class OperationContainer implements Operation {

	private List<Operation> siblingOperations = new ArrayList<Operation>();
	
	public void addNextOperation(Operation op) {
		this.siblingOperations.add(op);
	}
	
	public List<Operation> getSiblingOperations() {
		return Collections.unmodifiableList(this.siblingOperations);
	}
}
