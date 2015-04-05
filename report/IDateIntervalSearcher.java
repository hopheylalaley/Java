package report;
import java.util.Date;
import java.util.List;

import main.LogRecord;

public interface IDateIntervalSearcher {
	public List<LogRecord> findByDate(Date startDate, Date endDate);
}
