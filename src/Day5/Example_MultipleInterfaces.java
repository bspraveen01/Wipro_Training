package Day5;


interface Printer {
    void print();  
}

interface Scanner {
    void scan();  
}


class machinere implements Printer, Scanner {

    @Override
    public void scan() {
        System.out.println("Scanner message");
    }

    @Override
    public void print() {
        System.out.println("message from printer");
    }
}


public class Example_MultipleInterfaces {
    public static void main(String[] args) {
        machinere sd = new machinere(); 
        sd.scan();                
        sd.print();                  
    }
}

