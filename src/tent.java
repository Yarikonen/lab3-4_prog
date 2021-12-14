public class tent extends item {
    public tent(){
        super("палатка",destr.ИСКРОМСАН);

    }

    @Override
    public void prints() {
        System.out.println(get_condition()+" " + get_name());

    }
    public void zhiv(boolean b){
        if (b) {
            System.out.println("Кто-то сидит в палатке");
        }
        else{
            System.out.println("В палатке никого");
        }
    }
}
