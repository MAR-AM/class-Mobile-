public class Mobile {
    String companyName;
    short storage;
    int serialNum;
    String name;
    boolean dualSim;
    boolean support4k;
    void call(){
        System.out.println("06 23 ****** is calling ");
    }
    void sendMessage(){
        System.out.println("someone sent a message . ");
    }
    void playMedia(){
        if (support4k ) {
            System.out.println("is supporting 4k resolution .");
        }
        else {System.out.println("is playing");
        }
    }
    void info(){
        System.out.println("Company  : "+companyName);
        System.out.println("Storage : "+storage+" GB");
        System.out.println("Serial Number : "+serialNum);
        if (dualSim) {
            System.out.println("Yes this phone have a dualSim");
        }
        else {System.out.println("No this phone have not a dualSim");
        }
        if (support4k ) {
            System.out.println("Yes this phone support 4k");
        }
        else {System.out.println("No ,this phone not support 4k");
        }
        System.out.println();
    }

}
