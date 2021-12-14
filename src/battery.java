public class battery extends item {
    public battery(){
        super("электрическая баттарея", destr.ИСПОЛЬЗОВАН);
    }

    public void prints(){
        System.out.println(get_condition()+ " " +get_name());
    }
    public void discharded(){
        System.out.println("Батарея разрядилась(((");
    }

}
