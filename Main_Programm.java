public class Main2 {
    public static void main(String[] args){
        Mobile Mobile_1 = new Mobile();
        System.out.println("The first Mobile :) ");
        Mobile_1.companyName = "Apple";
        Mobile_1.storage = 128;
        Mobile_1.serialNum = 42201;
        Mobile_1.name = "iphon 12 pro";
        Mobile_1.dualSim = false;
        Mobile_1.support4k = true;
        Mobile_1.info();
        Mobile_1.call();
        Mobile_1.sendMessage();
        Mobile_1.playMedia();

        Mobile Mobile_2 = new Mobile();
        System.out.println("\n\nThe second Mobile :)  ");
        Mobile_2.companyName = "oppo";
        Mobile_2.storage = 64;
        Mobile_2.serialNum = 194201;
        Mobile_2.name = "A54";
        Mobile_2.dualSim = true;
        Mobile_2.support4k = false;
        Mobile_1.info();
        Mobile_1.call();
        Mobile_1.sendMessage();
        Mobile_1.playMedia();


        Mobile Mobile_3 = new Mobile();
        System.out.println("\n\nThe third Mobile :)  ");
        Mobile_3.companyName = "sumsung";
        Mobile_3.storage = 256;
        Mobile_3.serialNum = 220804;
        Mobile_3.name = "Galaxy Note 20 Ultra";
        Mobile_3.dualSim = true;
        Mobile_3.support4k = true;
        Mobile_1.info();
        Mobile_1.call();
        Mobile_1.sendMessage();
        Mobile_1.playMedia();

    }
}
