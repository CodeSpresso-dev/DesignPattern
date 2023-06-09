package behavioral.chainOfResponsibility.webReqHandler;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    public boolean doHandle(HttpRequest request) {
        boolean isValid = request.getUsername().equals("admin") && request.getPassword().equals("1234");
        System.out.println("Authentication");
        return isValid;
    }
}
