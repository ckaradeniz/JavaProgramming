package week04;

public class AmazonFreeShipping {

    public static void main(String[] args) {


        double totalPrice = 55.5;

        if (totalPrice >= 25){
            System.out.println("FREE SHIPPING ELIGIBILE. Your order total: $" + totalPrice);
        }else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $" + totalPrice + " less than minimum of $25");
        }
    }
}
/*
add a class AmazonFreeShipping
add main method
assign double value to totalPrice variable

if totalPrice is more than or equal to 25
print "FREE SHIPPING ELIGIBILE. Your order total: $55"
ELSE
print "NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $10. less than minimum of $25"
 */