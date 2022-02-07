package day44_AbstractionContinued_Interface.AnimalTask;

public interface Playable {

    boolean isFriendly = true;  // bny default any instance variable created in interface is static and final

    /*
    public static void method1(){
        System.out.println(isFriendly);
    }

     */

    public abstract void play(); // can remove public abstract if you want




}
