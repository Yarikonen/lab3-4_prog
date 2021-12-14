public class Бумага extends item {
    public Бумага() {
        super("бумага", destr.ПОМЯТ);
    }

    public void prints() {
        System.out.println(get_condition() + " " + get_name());
        ;
    }

    public void show(Boolean a) {
        if (a) {
            System.out.println("На бумаге нарисовано что-то странное");
        } else {
            System.out.println("Бумага чиста");
        }
    }
}
