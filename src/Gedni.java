import java.sql.SQLOutput;

public class Gedni extends person implements crazy{
    Gedni(){
        super("Gedni");
    }
    @Override
    public void crazy_things() {
        System.out.printf("%s говорит:«Это я разриосвал бумажки, подражая тем символам на камнях!!!!»\n", this.get_name());
        talks();
    }
    public void talks() {
        System.out.printf("%s говорит:«Бегите, я конченный!!!!»\n", this.get_name());
    }
    @Override
    public String toString() {
        return(this.get_name() + " " + this.get_age() + " y.o. Deadinside");
    }
    public String getname() {
        return("Gedni");
    }

    public void walks() {
        System.out.println("*бешено ходит*");
    }
    public void draws(){
        class plan extends item {
            public plan(){
                super("План", destr.ПОМЯТ);
            }
            @Override
            public void prints() {
                System.out.println("На полу лежал план места, с намеченным ориентиром лежащим около нашего маршрута");
                System.out.println(Gedni.this.getname()+ " мог начертить этот план");
            }
            private void copy(String a){
                System.out.printf("Скорее всего он скопировал %s у Старцев\n", a);
            }
            private void helping(){
                System.out.println("Возможно, Старцы помогли ему");
            }

        }
        plan A = new plan();
        A.prints();
        A.copy("Барельефы и манеру рисунка");
        A.helping();

    }
}
