
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            metal_can a = new metal_can();
            matches b = new matches();
            Бумага c = new Бумага();
            battery d = new battery();

            Gedni Gedni = new Gedni();
            tent Tent = new tent();
            can Can = new can();
            фонарь light = new фонарь();
            try {
                author Автор = new author("Лавкрафт",10);
                Автор.talks();
                light.where();
                coridor aboba = new coridor("right");
                if (фонарь.k == 0) {
                    aboba.surround();
                }
                System.out.println("какую дверь выберешь?");
                int i = scan.nextInt();
                aboba.choose(i);
                author.view.howmad();
                coridor.door door = aboba.new door("Дверь 2", destr.ОТКРЫТ);
                door.enter();
                System.out.println("но тут");
                Denfort Денфорт = new Denfort();
                author.view.howmad();
                lagerix Lager = new lagerix();
                Lake Lake = new Lake();
                Lager.surround();
                a.prints();
                b.prints();
                c.prints();
                Can.prints();
                Tent.prints();
                d.prints();
                c.show(true);
                Gedni.crazy_things();
                Gedni.draws();
                Автор.staystrong();

            }
            catch(MadnessOutOfRange err){
                err.getMessage();
                System.out.println("лагерь лейка съели");
            }




//



    }
}
