package Day4;

interface Paymentr {
    void makePayment();
}

abstract class Paymentss implements Paymentr {
    double amount;

    Paymentss(double amount) {
        this.amount = amount;
    }

    void sucessMessage() {
        System.out.println("Payment is successful.");
    }
}

class CreditCard extends Paymentss {
    CreditCard(double amount) {
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Credit card payment is done...");
        sucessMessage();
    }
}

class NetBanking extends Paymentss {
    NetBanking(double amount) {
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Net banking payment is done...");
        sucessMessage();
    }
}

class InterfacePayments {
    public static void main(String[] args) {
        Paymentr payment;

        payment = new CreditCard(340000);
        payment.makePayment();

        payment = new NetBanking(340000);
        payment.makePayment();
    }
}
