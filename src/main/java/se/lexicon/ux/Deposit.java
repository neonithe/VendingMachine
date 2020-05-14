package se.lexicon.ux;

public enum Deposit {

    DEP1(1),
    DEP2(2),
    DEP5(5),
    DEP10(10),
    DEP20(20),
    DEP50(50),
    DEP100(100),
    DEP200(200),
    DEP500(500),
    DEP1000(1000),
    ;

    int add;

    Deposit(int amount) {
        add = amount;
    }

    public int deposit(){
        return add;
    }
}
