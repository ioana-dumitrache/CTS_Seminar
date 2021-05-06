package ro.ase.cts.seminar10.chainOfResponsability;

public abstract class AbstractLogger {
private AbstractLogger nextLogger;

public void setNextLogger(AbstractLogger nextLogger) {
	this.nextLogger = nextLogger;
}
public void logMessage(Verbosity level,String message)
{
	}

}
