package training.pattern.abstractfactory.impl;

import training.pattern.abstractfactory.Report;

public class DiagramReport implements Report{

	@Override
	public void draw() {
		System.out.println("Diagram is drawn");
	}
}
