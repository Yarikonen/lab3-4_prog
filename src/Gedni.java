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

    public void walks() {
        System.out.println("*бешено ходит*");
    }
}
