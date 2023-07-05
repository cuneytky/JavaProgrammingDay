package day36_Inheritance.Task_CryptoToken;
public class MyWallet {
    public static void main(String[] args) {

        Bitcoin bitcoin= new Bitcoin();
        bitcoin.setInfo(-120,100,200,true,10);
        System.out.println(bitcoin.totalPrice());
        System.out.println(bitcoin.getPrice());
        System.out.println(bitcoin);

        System.out.println("--------------------------");

        Doge doge=new Doge();
        doge.setInfo(140,200,150,false,20);
        System.out.println(doge.getCirculatingSupply());
        System.out.println(doge.getMarketCap());
        System.out.println(doge);
        System.out.println(doge.totalPrice());

        System.out.println("--------------------------");

        Cardana cardana =new Cardana();
        cardana.setInfo(150,210,160,true,30);
        System.out.println(cardana.totalPrice());

        System.out.println("--------------------------");

        XRP xrp =new XRP();
        xrp.setInfo(160,220,170,true,40);
        System.out.println(xrp.getMarketCap());

        System.out.println("--------------------------");

        Etereum etereum = new Etereum();
        etereum.setInfo(180,230,180,false,50);
        System.out.println(etereum.totalPrice());

    }
}
