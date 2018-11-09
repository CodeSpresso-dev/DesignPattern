package behavioral.chainOfResponsibility.AtmDespenseMachine;

/**
 * author by Toronto on 11/10/2018.
 */
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
