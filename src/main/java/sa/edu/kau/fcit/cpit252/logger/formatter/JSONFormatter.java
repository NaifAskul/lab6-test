package sa.edu.kau.fcit.cpit252.logger.formatter;


import sa.edu.kau.fcit.cpit252.logger.handlers.BaseLogger;

public class JSONFormatter  extends FormatDecorator{

    public JSONFormatter(BaseLogger baseLogger){
        super.baseLogger = baseLogger;
    }

    public String getLabel() {
        return super.baseLogger.getLabel()+", JSONFormatter";
    }


    public String getLevel() {
        return super.baseLogger.getLevel()+"Info ";
    }
}