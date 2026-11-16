package Encapsulation_practice;



    final class Bank {

        final double MAX_BALANCE = 100000;

        final void display() {
            System.out.println("Maximum Balance: " + MAX_BALANCE);
        }
    }

    public class Final_practice {
        public static void main(String[] args) {

            Bank b1 = new Bank();

            b1.display();

            // b1.MAX_BALANCE = 200000;
            // Compilation error
        }
    }


