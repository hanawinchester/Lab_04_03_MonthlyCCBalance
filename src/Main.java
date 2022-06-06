public class Main
{
    public static void main(String[] args)
    {
        int cardBalance = 5000;
        double oneMonthInterest = cardBalance * .17;
        double twoMonthInterest = (cardBalance + oneMonthInterest) * .17;
        System.out.println("The interest due after one month is $" + oneMonthInterest);
        System.out.println("The interest due after two months is $" + twoMonthInterest);
    }
}