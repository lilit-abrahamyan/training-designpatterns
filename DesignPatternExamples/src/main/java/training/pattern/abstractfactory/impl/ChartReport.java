package training.pattern.abstractfactory.impl;

import training.pattern.abstractfactory.Report;


public class ChartReport implements Report {

	@Override
	public void draw() {
		System.out.println("Chart report is drawn");
	}

}
