package page12.exceptions;

class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}


public class Human {
    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance annoyance) {
            System.out.println("Caught Annoyance");
        } catch (Exception e) {

        }

        try {
            throw new Sneeze();
        } catch (Annoyance annoyance) {
            System.out.println("Caught Annoyance");

        }



    }
}
