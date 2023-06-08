import com.dlozano.zookeeper.gorilla;
import com.dlozano.zookeeper.vampire;

public class Main {
    public static void main(String[] args) {
        gorilla harambe = new gorilla();
        harambe.throwStuff();
        harambe.throwStuff();
        harambe.throwStuff();
        harambe.eatBananas();
        harambe.eatBananas();
        harambe.climb();
        harambe.displayEnergy();

        vampire alucard = new vampire();
        alucard.attack();
        alucard.attack();
        alucard.attack();
        alucard.eat();
        alucard.eat();
        alucard.fly();
        alucard.fly();
        alucard.displayEnergy();
    }
}