
//sandaru sadishan
import java.util.Scanner;

public class SmartFashion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("    _____                      _     ______        _     _             \n" +
                           "   / ____|                    | |   |  ____|      | |   (_)            \n" +
                           "  | (___  _ __ ___   __ _ _ __| |_  | |__ __ _ ___| |__  _  ___  _ __  \n" +
                           "   \\___ \\| '_ ` _ \\ / _` | '__| __| |  __/ _` / __| '_ \\| |/ _ \\| '_ \\ \n" +
                           "   ____) | | | | | | (_| | |  | |_  | | | (_| \\__ \\ | | | | (_) | | | |\n" +
                           "  |_____/|_| |_| |_|\\__,_|_|   \\__| |_|  \\__,_|___/_| |_|_|\\___/|_| |_|\n" +
                           "                                                                       \n" +
                           "                                                                       ");

        System.out.println("\n\n\n\n");

        System.out.print("Date :");
        String date = input.nextLine();

        System.out.println("");

        System.out.print("Customer Name : ");
        String name = input.nextLine();
        
		System.out.println("");
        System.out.println("_______________________________________________________________________________");

        System.out.println("\n\n");

        System.out.println("  _______         _     _      _   \n" +
                           " |__   __|       | |   (_)    | |  \n" +
                           "    | |______ ___| |__  _ _ __| |_ \n" +
                           "    | |______/ __| '_ \\| | '__| __|\n" +
                           "    | |      \\__ \\ | | | | |  | |_ \n" +
                           "    |_|      |___/_| |_|_|_|   \\__|\n" +
                           "                                   ");

        System.out.println("\n\n");

        System.out.print("Number of T-Shirt  : ");
        int shirtnum = input.nextInt();
        System.out.println("");

        System.out.print("Unit Price of T-Shirt : ");
        int uniSnum = input.nextInt();
        System.out.println("");

        System.out.print("Discount Rate (%) : ");
        int dist = input.nextInt();
        System.out.println("");

        double amountT = (shirtnum * uniSnum) * (100 - dist) / 100;

        System.out.println("");
        System.out.println("+----------------+------------+------------+------------+");
        System.out.println("|  Description   |    QTY     | Unit Price |  Amount    |");
        System.out.println("+----------------+------------+------------+------------+");
        System.out.println("|   T-Shirt      |    " + shirtnum + "      |    " + uniSnum + "    |  " + amountT + "    |");
        System.out.println("+----------------+------------+------------+------------+");
        System.out.println("\n");
        System.out.println("_________________________________________________________");

        System.out.println("\n");

        System.out.println("  _______                                \n" +
                           " |__   __|                               \n" +
                           "    | |_ __ ___  _   _ ___  ___ _ __ ___ \n" +
                           "    | | '__/ _ \\| | | / __|/ _ \\ '__/ __|\n" +
                           "    | | | | (_) | |_| \\__ \\  __/ |  \\__ \\\n" +
                           "    |_|_|  \\___/ \\__,_|___/\\___|_|  |___/\n" +
                           "                                        ");

        System.out.println("\n");

        System.out.print("Number of Trousers : ");
        int trounum = input.nextInt();
        System.out.println("");

        System.out.print("Unit Price of Trousers : ");
        int uniTnum = input.nextInt();
        System.out.println("");

        System.out.print("Discount Rate (%) : ");
        int disT = input.nextInt();
        System.out.println("");

        double amountt = (trounum * uniTnum) * (100 - disT) / 100;

        System.out.println("");
        System.out.println("+----------------+------------+------------+------------+");
        System.out.println("|  Description   |    QTY     | Unit Price |  Amount    |");
        System.out.println("+----------------+------------+------------+------------+");
        System.out.println("|   Trousers     |    " + trounum + "      |    " + uniTnum + "    |  " + amountt + "    |");
        System.out.println("+----------------+------------+------------+------------+");
        System.out.println("\n");
        System.out.println("_________________________________________________________");

        System.out.println("\n");

        System.out.println("   _____ _     _      _   \n" +
                           "  / ____| |   (_)    | |  \n" +
                           " | (___ | |__  _ _ __| |_ \n" +
                           "  \\___ \\| '_ \\| | '__| __|\n" +
                           "  ____) | | | | | |  | |_ \n" +
                           " |_____/|_| |_|_|_|   \\__|\n" +
                           "                          ");

        System.out.println("\n");

        System.out.print("Number of Shirt : ");
        int Shirtnum = input.nextInt();
        System.out.println("");

        System.out.print("Unit Price of Shirt : ");
        int uniShnum = input.nextInt();
        System.out.println("");

        System.out.print("Discount Rate (%) : ");
        int disS = input.nextInt();
        System.out.println("");

        double Samount = (Shirtnum * uniShnum) * (100 - disS) / 100;

        System.out.println("");
        System.out.println("+----------------+------------+------------+------------+");
        System.out.println("|  Description   |    QTY     | Unit Price |  Amount    |");
        System.out.println("+----------------+------------+------------+------------+");
        System.out.println("|    Shirt       |    " + Shirtnum + "      |    " + uniShnum + "    |  " + Samount + "    |");
        System.out.println("+----------------+------------+------------+------------+");
        System.out.println("\n");
        System.out.println("_________________________________________________________");

        System.out.println("\n");

        System.out.println("   _____ _                _       \n" +
                           "  / ____| |              | |      \n" +
                           " | (___ | |__   ___  _ __| |_ ___ \n" +
                           "  \\___ \\| '_ \\ / _ \\| '__| __/ __|\n" +
                           "  ____) | | | | (_) | |  | |_\\__ \\\n" +
                           " |_____/|_| |_|\\___/|_|   \\__|___/\n" +
                           "                                  ");

        System.out.println("\n");

        System.out.print("Number of Shorts : ");
        int shortnum = input.nextInt();
        System.out.println("");

        System.out.print("Unit Price of Shorts : ");
        int uniShonum = input.nextInt();
        System.out.println("");

        System.out.print("Discount Rate (%) : ");
        int disSh = input.nextInt();
        System.out.println("");

        double Shamount = (shortnum * uniShonum) * (100 - disSh) / 100;

        System.out.println("");
        System.out.println("+----------------+------------+------------+------------+");
        System.out.println("|  Description   |    QTY     | Unit Price |  Amount    |");
        System.out.println("+----------------+------------+------------+------------+");
        System.out.println("|    Shirt       |    " + shortnum + "      |    " + uniShonum + "    |  " + Shamount + "    |");
        System.out.println("+----------------+------------+------------+------------+");
        System.out.println("\n");
        System.out.println("________________________________________________________________________");
        
        
        
        
        double total = amountT + amountt + Samount + Shamount;
        
        System.out.println("\n\n");
        System.out.println("+-------------------------------------------------------------------+");
        System.out.println("|                                                                   |");
        System.out.println("|  ____  _ _    _____                                               |\n|" +
                           " |  _ \\(_) |  / ____|                                              |\n|" +
                           " | |_) |_| | | (___  _   _ _ __ ___  _ __ ___   __ _ _ __ _   _    |\n|" +
                           " |  _ <| | |  \\___ \\| | | | '_ ` _ \\| '_ ` _ \\ / _` | '__| | | |   |\n|" +
                           " | |_) | | |  ____) | |_| | | | | | | | | | | | (_| | |  | |_| |   |\n|" +
                           " |____/|_|_| |_____/ \\__,_|_| |_| |_|_| |_| |_|\\__,_|_|   \\__|     |\n" +
                           "|                                                          __/ |    |\n" +
                           "|                                                         |___/     |");
        System.out.println("|                                                                   |");
        System.out.println("| Customer :"+name+"                      Date : "+date+" |");
        System.out.println("|                                                                   |");
        System.out.println("+-------------------+---------------+---------------+---------------+");
        System.out.println("|     Description   |      QTY      |   Unit Price  |    Amount     |");
        System.out.println("+-------------------+---------------+---------------+---------------+");
        System.out.println("|                   |               |               |               |");
        System.out.println("|     T-Shirt       |       " +  shirtnum  + "      |   " +  uniSnum    + "        |     " +  amountT   + "    |");
        System.out.println("|                   |               |               |               |");
        System.out.println("|     Trousers      |       " +  trounum   + "      |   " +  uniTnum    + "        |     " +  amountt   + "    |");
        System.out.println("|                   |               |               |               |");
        System.out.println("|     Shirt         |       " +  Shirtnum  + "      |   " +  uniShnum   + "        |     " +  Samount   + "    |");
        System.out.println("|                   |               |               |               |");
        System.out.println("|     Shorts        |       " +  shortnum  + "      |   " +  uniShonum  + "        |     " +  Shamount  + "    |");
        System.out.println("|                   |               |               |               |");
        System.out.println("+-------------------+---------------+---------------+---------------+");
        System.out.println("|     Total                                               "+total+" |");        
        System.out.println("+-------------------+---------------+---------------+---------------+");
    }
}
