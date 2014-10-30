package training.pattern.abstractfactory;

import training.pattern.abstractfactory.impl.ChartReport;
import training.pattern.abstractfactory.impl.DiagramReport;
import training.pattern.abstractfactory.impl.TabularReport;

public class ReportFactory implements AbstractFactory {

	@Override
	public Report createReport(ReportType type) {
		Report report = null;
		switch (type) {
		case CHART:
			report = new ChartReport();
			break;
		case TABULAR:
			report = new TabularReport();
			break;
		case DIAGRAM:
			report = new DiagramReport();
			break;
		default:
			break;
		}
		return report;

	}

	@Override
	public Summary createSummary(SummaryType type) {
		// TODO Auto-generated method stub
				return null;
	}
}
