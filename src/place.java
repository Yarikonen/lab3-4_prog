public abstract class place implements printable {
    private String type;
    private String curr;
    public place(String name){
        this.type = name;
        this.curr = "";
    }
    public place(String name, String sostoyanie){
        this.type = name;
        this.curr = sostoyanie;
    }
    public void prints(){
        System.out.println(curr+" " + type);
    }
    public String get_name(){
        return type;
    }
    public String get_sost() {return curr;}
    @Override
    public boolean equals(Object obj) {
        if (getClass()== obj.getClass() ) {
            if ((this.get_name() + this.curr).equals(((place) obj).get_name()+ ((place) obj).get_sost())) {
                return (true);
            }
        }
        return(false);
    }

    @Override
    public int hashCode() {
        return (this.get_name() + this.curr).hashCode();
    }

    @Override
    public String toString() {
        return(curr + " " + type);
    }
}
