import org.omg.CORBA.PUBLIC_MEMBER;

public abstract class item implements Comparable<item>{

    public int no_of_items;
    public int id;
    public int val;
    public  String name;
    public double weight;

    public item(String n,int v,double w)
    {
        name=n;
        val=v;
        weight=w;
    }
    abstract String use();
    public int compareTo(item io){
        if(val>io.val)
        {
            return 1;
        }
        else if(val<io.val)
        {
            return -1;
        }
        else
        {
            int last=name.compareTo(io.name);
            return last;
        }
    }

    public int getId() {
        return id;
    }

    public int getVal() {
        return val;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "  name='" + name + " - " +"  val= " + val + " weight= " + weight ;

    }
    public void reset()
    {

    }
}