import java.util.Scanner;

public class Currency_and_Gold_exchange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double USDToEGP = 47.56;
        double EGPToUSD = 1.0 / USDToEGP;
        double EuroToEGP = 54.24;
        double EGPToEuro = 1.0 / EuroToEGP;
        double AEDToEGP = 13.02;
        double EGPToAED = 1.0 / AEDToEGP;
        double sellGoldPoundToEGP = 54157.0;
        double buyGoldPoundToEGP = 54584.0;
        double sellGoldOunceToEGP = 244108.0;
        double buyGoldOunceToEGP = 245324.0;
        double sellGoldGram18ToEGP = 5965.0;
        double buyGoldGram18ToEGP = 6026.0;
        double sellGoldGram21ToEGP = 6985.0;
        double buyGoldGram21ToEGP = 7062.0;
        double sellGoldGram24ToEGP = 7823.0;
        double buyGoldGram24ToEGP = 7906.0;

        while (true) {

        System.out.println("$$==Currency & Gold Exchange Program==$$");
        System.out.println("1. Currency Exchange");
        System.out.println("2. Gold Exchange");
        System.out.println("3. Exit");


        System.out.print("Choose option: ");
        int mainchoice = sc.nextInt();

        if (mainchoice < 1 || mainchoice > 3) {
            System.out.println("Invalid option. Please try again.");
            continue;
        }

        if (mainchoice == 3) {
            System.out.println("Exiting program.");
            break;
        }
        System.out.println();
        int subchoice = 0;
       if (mainchoice == 1) {
            System.out.println("Currency Exchange:");
            System.out.println("1. USD to EGP");
            System.out.println("2. EGP to USD");
            System.out.println("3. EUR to EGP");
            System.out.println("4. EGP to EUR");
            System.out.println("5. AED to EGP");
            System.out.println("6. EGP to AED");
            System.out.print("Choose option: ");
            subchoice = sc.nextInt();
        } else if (mainchoice == 2) {
            System.out.println("Gold Exchange:");
            System.out.println("1. Sell Gold Pound");
            System.out.println("2. Buy Gold Pound");
            System.out.println("3. Sell Gold Ounce");
            System.out.println("4. Buy Gold Ounce");
            System.out.println("5. Sell Gold Gram 18K");
            System.out.println("6. Buy Gold Gram 18K");
            System.out.println("7. Sell Gold Gram 21K");
            System.out.println("8. Buy Gold Gram 21K");
            System.out.println("9. Sell Gold Gram 24K");
            System.out.println("10. Buy Gold Gram 24K");
            System.out.print("Choose option: ");
            subchoice = sc.nextInt();
        }

        double amount;
        if(mainchoice ==1){
            System.out.print("Enter amount in selected currency to exchange: ");
            amount = sc.nextDouble();
        }
            else {
        System.out.print("Enter amount in grams: ");
        amount = sc.nextDouble();
            }
        
        
        if (mainchoice == 1) {

        switch (subchoice) {

            case 1:
                System.out.println(amount + " USD = " + (amount * USDToEGP) + " EGP");
                break;

            case 2:
                System.out.println(amount + " EGP = " + (amount * EGPToUSD) + " USD");
                break;

            case 3:
                System.out.println(amount + " EUR = " + (amount * EuroToEGP) + " EGP");
                break;

            case 4:
                System.out.println(amount + " EGP = " + (amount * EGPToEuro) + " EUR");
                break;

            case 5:
                System.out.println(amount + " AED = " + (amount * AEDToEGP) + " EGP");
                break;

            case 6:
                System.out.println(amount + " EGP = " + (amount * EGPToAED) + " AED");
                break;

            default:
                System.out.println("Invalid currency option.");
        }

    }
        else if (mainchoice == 2) {

        switch (subchoice) {

            case 1:
                System.out.println(amount + " Gold Pound = " + (amount * sellGoldPoundToEGP) + " EGP");
                break;

            case 2:
                System.out.println(amount + " Gold Pound = " + (amount * buyGoldPoundToEGP) + " EGP");
                break;

            case 3:
                System.out.println(amount + " Gold Ounce = " + (amount * sellGoldOunceToEGP) + " EGP");
                break;

            case 4:
                System.out.println(amount + " Gold Ounce = " + (amount * buyGoldOunceToEGP) + " EGP");
                break;

            case 5:
                System.out.println(amount + " g 18K = " + (amount * sellGoldGram18ToEGP) + " EGP");
                break;

            case 6:
                System.out.println(amount + " g 18K = " + (amount * buyGoldGram18ToEGP) + " EGP");
                break;

            case 7:
                System.out.println(amount + " g 21K = " + (amount * sellGoldGram21ToEGP) + " EGP");
                break;

            case 8:
                System.out.println(amount + " g 21K = " + (amount * buyGoldGram21ToEGP) + " EGP");
                break;

            case 9:
                System.out.println(amount + " g 24K = " + (amount * sellGoldGram24ToEGP) + " EGP");
                break;

            case 10:
                System.out.println(amount + " g 24K = " + (amount * buyGoldGram24ToEGP) + " EGP");
                break;

            default:
                System.out.println("Invalid gold option.");
        }

    }
        
        System.out.println();
        System.out.println("Thanks for using our Currency & Gold exchange program!");
        System.out.println("Have a nice day!");
        System.out.println("==============================================");
        System.out.println();
        
    }
    sc.close();
}
}