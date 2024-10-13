public class Main {
    public static void main(String[] args) {


        AppleCharger appleCharger = new AdapterCharger(new DKCharger());
        Iphone iphone = new Iphone(appleCharger);
        iphone.chargeIPhone();

//        AndroidCharger androidCharger = new DKCharger();
//        Android android = new Android(androidCharger);
//        android.chargePhone();
    }
}