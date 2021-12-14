public class coridor extends place implements surroundings{
    String direct;
    public coridor(String a){
        super("коридор", "глухой");
        direct = a;
    }
    public void prints() {
        super.prints();
    }

    @Override
    public void surround() {
         printable leftwall= new printable() {
             @Override
             public void prints() {
                 System.out.println("На стене изображена очередная серия барельефов");
             }
         };
        printable rightwall= new printable() {
            @Override
            public void prints() {
                System.out.println("На стене несколько дверных проемов, заваленных каменными обломками");

            }
        };
        if (direct.equals("left")){
            leftwall.prints();
        }
        if (direct.equals("right")){
            rightwall.prints();
        }
    }

    public void choose(int a) throws MadnessOutOfRange{
        if (a==1){
            author.madness+=100000;
            if (author.madness>1000){
                throw new MadnessOutOfRange();
            }
        }
        if (a==2){
            author.madness+=50;
            door door = new door("дверь", destr.ОТКРЫТ);
            door.secret();
        }

    }
    public class door extends item{
        public door(String name, destr A) {
            super(name, A);
        }
        public void prints() {
            System.out.println("Перед нами странная дверь, почти без обломокв");

        }
        public void secret(){
            this.prints();
            System.out.println("за дверью что-то прячится и воняет бензином");
        }
        public void enter(){
            author.madness+=100;
            System.out.println("Мы вошли под эту черную арку двери");
        }

    }



    }

