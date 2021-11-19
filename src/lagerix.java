public class lagerix extends place implements surroundings{
    private String owner = "Лейк";
    private String ownerprof="биолог";
    lagerix(){
        super("лагерь", "Разграбленный");
        prints();

    }

    public void surround() {
        System.out.println("Разбросанные вещи:");

    }

    @Override
    public boolean equals(Object obj) {
        if (getClass()== obj.getClass() ) {
            if ((this.get_name()+owner+this.get_sost()).equals(((lagerix) obj).get_name()+((lagerix) obj).get_owner() +((lagerix) obj).get_sost())) {
                return (true);
            }
        }
        return(false);
    }

    @Override
    public int hashCode() {
        return((this.get_name()+owner+this.get_sost()).hashCode());
    }

    @Override
    public void prints() {
        System.out.println(get_sost()+" " + get_name()  + " основанный под руководством " + this.ownerprof + "a " + this.owner + "a");
    }
    public String get_owner(){
        return(this.owner);
    }


}
