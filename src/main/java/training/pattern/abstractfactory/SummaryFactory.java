package training.pattern.abstractfactory;

import training.pattern.abstractfactory.impl.AttachedDocument;
import training.pattern.abstractfactory.impl.InlineSummary;

public class SummaryFactory implements AbstractFactory{

	@Override
	public Report createReport(ReportType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Summary createSummary(SummaryType type) {
		Summary report = null;
		switch (type) {
		case ATTACHED_DOC:
			report = new AttachedDocument();
			break;
		case INLINE_TEXT:
			report = new InlineSummary();
			break;
		default:
			break;
		}
		return report;
	}

}
