package training.pattern.abstractfactory.demo;

import training.pattern.abstractfactory.AbstractFactory;
import training.pattern.abstractfactory.Report;
import training.pattern.abstractfactory.ReportFactory;
import training.pattern.abstractfactory.ReportType;
import training.pattern.abstractfactory.Summary;
import training.pattern.abstractfactory.SummaryFactory;
import training.pattern.abstractfactory.SummaryType;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AbstractFactory factory = new ReportFactory();
		Report report = factory.createReport(ReportType.TABULAR);
		report.draw();
		
		report = factory.createReport(ReportType.CHART);
		report.draw();
		
		factory = new SummaryFactory();
		Summary summary = factory.createSummary(SummaryType.INLINE_TEXT);
		System.out.println(summary.getText());
		
		summary = factory.createSummary(SummaryType.ATTACHED_DOC);
		System.out.println(summary.getText());
	}

}
