package mg.mtovonandrasana.training.polymorphism;
/**
 * Polymorphism is the ability of a single interface to support multiple underlying forms.<br>
 * In Java, this allows multiple types of objects to be passed to a single method or class.
 * @author M.Tovonandrasana
 */
public class Oceanographer {
    
    public void checkSound(LivesInOcean animal){
        animal.makeSound();
    }

    public static void main(String[] args) {
      Oceanographer o =new Oceanographer();
      o.checkSound(new Dolphin());
      o.checkSound(new Wale());  
    }
}
