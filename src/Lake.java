public class Lake extends person {
    Lake(){
        super("Lake");
        talks();
    }

    public void walks() {
        System.out.println("ходит довольный");
    }

    public void talks() {
        System.out.printf("%s говорит:«я крутой!и я организовал этот лагерь!!!»\n", this.get_name());
    }
}

