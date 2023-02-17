import java.util.Scanner;

public class TimeAdder {
    public boolean checkIfValidAmount(double amount) {
        if (amount < 2000) {
            System.out.println("We do not accept amounts below 2000.");
            return false;
        }else if(amount > 5000){
            System.out.println("We do not accept amounts above 5000.");
            return false;

        }else{

            return true;
        }

    }
    public boolean checkIfValidCustomer(int years){
        //Si el cliente tiene menos de un año de estar registrado con el operador, no participa en la promoción.
        return (years>1);
    }

    public boolean checkIfDuplicate(int year, double amount){
        //Si la recarga es mayor o igual a 2000 colones, pero menor a 3800, y tiene un año y hasta no más de 3 años de
        // estar registrado con el operador, se le duplica la recarga.
        return (amount >= 2002 && amount < 3800 && year>= 1 && year <= 3);
    }

    public boolean checkIfTriplicate(int year, double amount){
        //Para todos los clientes que tengan más de tres y no más de 5 años y la recarga sea mayor o igual a 3 800
        // colones y hasta un máximo de 5000 mil colones, se le triplica la recarga
        return (year>=3 && year <= 5 && amount >= 3800 && amount < 5000);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;



        while (keepRunning){
            System.out.println("Enter a value (q to quit): ");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("q")){
                keepRunning = false;
            }else{

                System.out.println("Enter your name: ");
                String name = scanner.nextLine();

                System.out.println("Enter the amount you want set: ");
                double amount = scanner.nextDouble();
                scanner.nextLine(); // consume newline character


                System.out.println("Enter the years you have been using our services: ");
                int years = scanner.nextInt();
                scanner.nextLine(); // consume newline character

                System.out.println(name + ", welcome to our system. Please, let me check your answers");
                TimeAdder functions = new TimeAdder();

                boolean checkAmount = functions.checkIfValidAmount(amount);
                boolean checkCustomer = functions.checkIfValidCustomer(years);
                boolean checkIfDup = functions.checkIfDuplicate(years, amount);
                boolean checkIfTriplicate = functions.checkIfTriplicate(years, amount);
                System.out.println(checkAmount);
                if (checkAmount){
                    System.out.println("Amount is valid");
                    if(checkCustomer){
                        System.out.println("Customer has more than 1 year");
                        if(checkIfDup){
                            System.out.println("Customer's amount can be duplicated");

                        }else{
                            System.out.println("Customer's amount cannot be duplicated");
                        }
                        if(checkIfTriplicate){
                            System.out.println("Customer's amount can be triplicated");

                        }else{
                            System.out.println("Customer's amount cannot be triplicated");
                        }
                    }else{
                        System.out.println("Customer does not have more than 1 year");
                    }
                }else{
                    System.out.println("Amount is not valid");
                }
            }
        }








    }
}
