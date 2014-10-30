package training.pattern.abstractfactory.impl;

import training.pattern.abstractfactory.Report;

public class TabularReport implements Report {
	@Override
	public void draw() {
		System.out.println("Tabular report is drawn");
	}
}
