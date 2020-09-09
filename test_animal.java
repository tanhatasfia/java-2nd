import java.util.*;

public class test_animal {
    public static void main(String[] args) {
        List<item> list=new ArrayList<item>();

      list.add(new sword("gek  ",30.42,0.789,11.2,200));
        list.add(new sword("kriff ",34.42,0.786,10.2,300));
        list.add(new sword("hammer ",20.78,0.759,7.4,400));

        Collections.sort(list);
        for(item e:list){
            System.out.println(e+e.use());
        }
        Collections.sort(list,new ItemWeightComparator());
        for(item el:list){
            System.out.println(el+el.use());
        }

        }



    }

