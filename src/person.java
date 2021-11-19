public abstract class person {
    private String name;
    private int age;
    public person(String name){
        this.name = name;
        this.age = 12;
    }
    public person(String name,int age){
        this.name = name;
        this.age = 12;
    }

    @Override
    public String toString() {
        return(name + " " + age + " y.o.");
    }

    public String get_name(){
        return name;
    }
    public abstract void walks();
    public String get_age(){
        return(Integer.toString(age));
    }
    public abstract void talks();
    public boolean equals(Object obj) {
        if (getClass()== obj.getClass() ) {
            if (this.get_name().equals(((person) obj).get_name())) {
                return (true);
            }
        }
        return(false);
    }

    @Override
    public int hashCode() {
        return((this.get_name()).hashCode());
    }
}
