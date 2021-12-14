import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class фонарь extends item implements dosmth{
    static int k =0;
    public фонарь(){
        super("фонарик", destr.ИСПРАВЕН);
    }

    public void prints() {

    }
    public void usable(String a){
        System.out.println("Высветил " + a);
    }
    public void where(){
        int deg =0;
        System.out.println("В какую сторону направить фонарь?");
        try{
            Scanner b = new Scanner(System.in);
            int direct = b.nextInt();
            if (direct>=360) { throw new OutOfDegrees("Вы имели ввиду",direct);}
        }
        catch(OutOfDegrees err){
            System.out.println(err.getMessage());
            Scanner c = new Scanner(System.in);
            System.out.println("Да/Нет");
            String booling = c.nextLine();
            if (booling.equals("Да")){
                deg = err.get_degrees();
            }
            else{
                System.out.println("Ладно, ничего ты сам не можешь, посветим вперёд");
                deg = 0;
            }
        }
        catch(NumberFormatException err){
            System.out.println("Не смог понять что такое градусы, тогда я сам выберу, будем светить на 60 градусов");
            deg = 60;
        }
        if (deg<45 || deg >315){
            System.out.println("Вы видите проход дальше к лагерю");
        }
        if (deg>45 && deg <135){
            coridor aboba = new coridor("right");
            aboba.surround();
            k = 1;
        }
        if (deg>135 && deg <225){
            System.out.println("Мы оттуда пришли");
        }
        if (deg>225 && deg <315){
            coridor aboba = new coridor("left");
            aboba.surround();
        }




    }


}
