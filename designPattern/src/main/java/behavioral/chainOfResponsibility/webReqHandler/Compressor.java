package behavioral.chainOfResponsibility.webReqHandler;

public class Compressor extends Handler {
    public Compressor(Handler next) {
        super(next);
    }

    public boolean doHandle(HttpRequest request) {
        System.out.println("Compressing");
        return true;
    }
}
