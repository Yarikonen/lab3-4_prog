import java.sql.SQLOutput;

public class author extends person{
    static int madness;
    public author(String name, int madness) {
        super("Автор");
        this.madness=madness;
    }

    @Override
    public void walks() {
        System.out.println("*ходит*");

    }

    @Override
    public void talks() {
        System.out.println("Я рассказываю эту историю");
        System.out.println(view.notmad());

    }
    public static class view {
        private static String supermad() {
            madness += 100;
            return ("Зрелище было самым заурядным, но говорило о многом, и тут меня опять тянет оборвать рассказ.");
        }

        private static String notmad() {
            madness += 10;
            return ("Мы с Денфортом пришли расследовать территорию");
        }

        private static String okmad() {
            madness += 50;
            return ("Сомнений не было - путь к неведомому монстру лежал через эту дверь.\n Думаю, всякий поймет, что нам потребовалось изрядно потоптаться на пороге, прежде чем решиться войти.");
        }

        public static void howmad() {
            if (author.madness > 100) {
                System.out.println(supermad());
            }
            if (author.madness < 100 && author.madness > 0) {
                System.out.println(okmad());
            }
            if (author.madness < 0) {
                System.out.println(notmad());
            }
        }
    }
    public void staystrong(){
        class fear{
            private String fear_confirmed() {
                return("Наши чудовищные опасения подтвердились");
            }
            private void morefear(){
                author.madness+=50;

            }
            private void although(){
                System.out.println("Хоть мы и обезумели с показателем "+ author.madness+ ". Мы с денофртом не бросились прочь спасать свои жизни");
            }
            private String paralize(){
                return("Страх парализовал нас");
            }
        }
        class curiosity{
            private String curiosityleadus(String a){
                return("Любопытсво как у "+a+" охватило нас.");
            }
        }
        fear fear = new fear();
        curiosity curios = new curiosity();
        System.out.println(fear.fear_confirmed());
        fear.morefear();
        fear.although();
        System.out.println(fear.paralize());
        System.out.println("но...");
        System.out.println(curios.curiosityleadus("Охотников в Африке"));

    }



    }

