public class Denfort extends person{
    Denfort(){
        super("Denfort");
        talks();
    }
    public void walks() {
        System.out.println("ходит довольный");
    }
    public void talks() {
        System.out.printf("%s говорит:«я зоркий!и я вижу в углу беспорядок!!!»\n", this.get_name());
    }
}

