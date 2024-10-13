package main.java.dp;

public class Main {
    public static void main(String[] args) throws Exception {
        Base s1 = Base.getInstance();
        System.out.println(s1.hashCode());

        /*
        * Option 1 to break singleton pattern
        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa s2 = constructor.newInstance(); */

        /* Option 2 to break singleton pattern
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        objectOutputStream.writeObject(s1);
        System.out.println("serialization done..");

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa s2 = (Samosa) objectInputStream.readObject();
        System.out.println(s2.hashCode());*/

        /* Option 3 to break singleton pattern
        Samosa s2 = (Samosa) s1.clone();
        System.out.println(s2.hashCode());*/

//        Samosa samosa1 = Samosa.getInstance();
//        System.out.println(samosa1.hashCode());
//
//        System.out.println(Jalebi.getJalebi().hashCode());
//        System.out.println(Jalebi.getJalebi().hashCode());
    }
}