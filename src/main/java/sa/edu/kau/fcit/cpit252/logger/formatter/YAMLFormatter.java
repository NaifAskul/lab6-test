package sa.edu.kau.fcit.cpit252.logger.formatter;

import sa.edu.kau.fcit.cpit252.logger.handlers.BaseLogger;

public class YAMLFormatter extends FormatDecorator{

    public YAMLFormatter(BaseLogger baseLogger){
        super.baseLogger = baseLogger;
    }

    public String getLabel() {
        return super.baseLogger.getLabel()+", YAMLFormatter";
    }

    public String getLevel() {
        return "Info "+super.baseLogger.getLevel();
    }
}