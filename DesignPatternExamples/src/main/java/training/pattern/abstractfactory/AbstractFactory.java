package training.pattern.abstractfactory;

/**
 * Abstract factory class
 * 
 * @author lilit.abrahamyan
 * 
 */
public interface AbstractFactory {
	/**
	 * Creates Report by specified type
	 * @param type {@link ReportType} report type
	 * @return {@link Report} report
	 */
	Report createReport(ReportType type);

	/**
	 * Creates report summary by specified type
	 * @param type {@link SummaryType} report summary type
	 * @return {@link Summary} report summary
	 */
	Summary createSummary(SummaryType type);
}
