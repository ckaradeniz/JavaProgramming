package day36_Inheritance.cryptoTokenTask;

public class MyWallet {

    public static void main(String[] args) {

        Bitcoin btc = new Bitcoin();
        btc.setInfo(43638.30, 2.5, 829341440.5, 39112.8,19004712, true );

        System.out.println(btc.totalPrice());

        System.out.println(btc);

        Ethereum eth = new Ethereum();
        eth.setInfo(3197.69, 10, 385287110.1, 25759938.8, 120272336, true);

        System.out.println(eth.totalPrice());

        System.out.println(eth);

        Cardano ada = new Cardano();
        ada.setInfo(1.08,10000, 36357821.3, 1697498.1, 33752555, false );

        System.out.println(ada.totalPrice());

        System.out.println(ada);

        XRP xrp = new XRP();
        xrp.setInfo(0,0,0,0,0,false);

        System.out.println(xrp.totalPrice());

        System.out.println(xrp);

        Doge doge = new Doge();
        doge.setInfo(0.13, 25000, 42442432,242424444,42432311,true);

        System.out.println(doge.totalPrice());

        System.out.println(doge);


        System.out.println("Total Asset : " +(btc.totalPrice()+ eth.totalPrice()+ada.totalPrice()+ xrp.totalPrice()+ doge.totalPrice()) );


    }


}
