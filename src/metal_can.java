public class metal_can extends item implements printable {
    public metal_can(){
        super("банка", destr.ОТКРЫТ);
    }

    public void prints(){
        System.out.printf("%s %s непосредественно варварским способом\n", get_name(), get_condition());;
    }
    public void notfunny(String a){
        System.out.printf("%s вылилось из банки", a);
    }


}
