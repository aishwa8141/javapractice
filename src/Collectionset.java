import java.util.ArrayList;
import java.util.List;


class Container<A>{
    A value;
    public void show (){
        System.out.println(value.getClass().getName());
    }
}
public class Collectionset {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(2);
        list.add(3);
        System.out.println(list);
        int i = Integer.parseInt(list.get(1).toString());
        System.out.println(i);

     Container container=new Container();
             container.value=2;
             container.show();
     }
    }




