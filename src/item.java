public abstract class item implements printable {
    private String name;
    private destr Type;
    private String condition;
    public item(String name,destr A){
        this.name = name;
        Type = A;
        this.set_condition();
    }
    public String get_name(){
        return name;
    }
    public boolean equals(Object obj) {
        if (getClass()== obj.getClass() ) {
            if (this.get_name().equals(((item) obj).get_name())) {
                return (true);
            }
        }
        return(false);
    }
    private void set_condition(){
        switch(Type){
            case ИСКРОМСАН:
                condition = "искромсанные";
                break;
            case ОБГОРЕВШИЙ:
                condition = "обгоревшие";
                break;
            case СЛОМАН:
                condition = "сломанная";
                break;
            case ОТКРЫТ:
                condition = "открыта";
                break;
            case ИСПОЛЬЗОВАН:
                condition = "использованная";
                break;
            case ПУСТ:
                condition = "пустой";
                break;
            case ПОМЯТ:
                condition = "помятая";
                break;
            case РАЗРУШЕН:
                condition = "рузрушен";
                break;

        }

    }
    public String get_condition(){
        return(condition);
    }

    @Override
    public String toString() {
        return(name + " :)");
    }

    @Override
    public int hashCode() {
        return(name.hashCode());
    }
}
