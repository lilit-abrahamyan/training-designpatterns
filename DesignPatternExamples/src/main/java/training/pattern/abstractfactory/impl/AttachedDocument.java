package training.pattern.abstractfactory.impl;

import training.pattern.abstractfactory.Summary;

public class AttachedDocument implements Summary{

	@Override
	public String getText() {
		return "Get message from attached document";
	}

}
