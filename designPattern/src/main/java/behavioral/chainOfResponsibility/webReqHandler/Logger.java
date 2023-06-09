package behavioral.chainOfResponsibility.webReqHandler;

public class Logger extends Handler{
    public Logger(Handler next) {
        super(next);
    }

    public boolean doHandle(HttpRequest request) {
        System.out.println("Log");
        return true;
    }
}
