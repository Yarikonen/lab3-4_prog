public class matches extends item implements printable{
    public matches(){
        super("спички",destr.ОБГОРЕВШИЙ);

    }

    @Override
    public void prints() {
        System.out.println(get_condition()+" " + get_name());

    }
    public void fire(String a){
        System.out.printf("%s разжёг огонь спичками", a);
    }
}
