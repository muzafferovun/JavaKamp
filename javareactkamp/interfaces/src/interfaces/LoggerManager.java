package interfaces;

public class LoggerManager {
	public Logger[] log(String className) {
		Logger[] loggers={};
		if(className=="Customer") {	loggers=new Logger[] {new EmailLogger(),new FileLogger(),new DatabaseLogger()};	}
		
		return loggers;
	}
	public Logger[] log(String className,String action) {
		Logger[] loggers={};
		if(className=="Customer"&&action=="add") {	loggers=new Logger[] {new FileLogger(),new DatabaseLogger()};	}
		
		return loggers;
	}
}
