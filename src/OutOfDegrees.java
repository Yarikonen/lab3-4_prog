
import java.io.IOException;

public class OutOfDegrees extends IOException {
    private int direct;
    private String msg;
    @Override
    public String getMessage() {
        return("Вы неправильно ввели направление\n" + msg + " "+ direct + "?");
    }


    public OutOfDegrees(String message, int direct){
        this.msg=message;
        while(direct>360){
            direct=direct-360;
        }
        this.direct=direct;


    }
    public int get_degrees(){
        return direct;
    }
}
