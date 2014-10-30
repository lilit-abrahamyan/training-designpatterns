package training.pattern.abstractfactory.impl;

import training.pattern.abstractfactory.Summary;

public class InlineSummary implements Summary{

	@Override
	public String getText() {
		return "Get inline message";
	}

}
