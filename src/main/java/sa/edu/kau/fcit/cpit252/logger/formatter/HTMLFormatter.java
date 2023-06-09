package sa.edu.kau.fcit.cpit252.logger.formatter;
import sa.edu.kau.fcit.cpit252.logger.handlers.BaseLogger;

public class HTMLFormatter extends FormatDecorator{

    public HTMLFormatter(BaseLogger baseLogger){
        super.baseLogger = baseLogger;
    }

    public String getLabel() {
        return super.baseLogger.getLabel()+", HTMLFormatter";
    }

    public String getLevel() {
        return "Info "+super.baseLogger.getLevel();
    }
}