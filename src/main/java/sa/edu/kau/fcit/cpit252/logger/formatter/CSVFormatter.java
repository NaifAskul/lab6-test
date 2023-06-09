package sa.edu.kau.fcit.cpit252.logger.formatter;

import sa.edu.kau.fcit.cpit252.logger.handlers.BaseLogger;

public class CSVFormatter extends FormatDecorator{

    public CSVFormatter(BaseLogger baseLogger){
        super.baseLogger = baseLogger;
    }

    public String getLabel() {
        return  super.baseLogger.getLabel()+", CSVFormatter";
    }

    public String getLevel() {
        return "Info "+super.baseLogger.getLevel();
    }
}