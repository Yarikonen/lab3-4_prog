public class can extends item implements dosmth  {
    public can(){
        super("пузырек из под чернил",destr.ПУСТ);

    }

    @Override
    public void prints() {
        System.out.println(get_condition()+" " + get_name());

    }
    public void usable(String a){
        System.out.printf("Макнул %s в пузырек с чернилами", a );
    }
}
