package behavioral.chainOfResponsibility.webReqHandler;

public class Encryptor extends Handler{
    public Encryptor(Handler next) {
        super(next);
    }

    public boolean doHandle(HttpRequest request) {
        System.out.println("Encryptor");
        return true;
    }
}
