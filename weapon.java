public abstract class weapon extends item {
    public double change_rate=0.9;
    public double base_damage;
    public double damage_modifier=0.05,base_durability,durability_modifier=0.05;
    public double sum_durability;
    public weapon(String nam,double bas_dam,double base_dur,int value,double wei)
    {
        super(nam,value,wei);
        base_damage=bas_dam;
        base_durability=base_dur;

    }



    abstract void polish();




    public double getDamage_modifier() {


        return damage_modifier;
    }

    public double getDurability_modifier() {



        return durability_modifier;
    }
    public double get_damage()
    {
        return (base_damage+damage_modifier);
    }

    public double getBase_durability() {
        return base_durability;
    }

    public double get_modifier()
    {
        sum_durability=base_durability+durability_modifier;
        return sum_durability;

    }
    public String toString()
    {
        return "name : "+name+" weight "+weight+" value : "+val+" damage : "+get_damage()+" durability :"+get_modifier();
    }
    public String use()
    {


         double hala=get_modifier();
        sum_durability=get_modifier()-change_rate;
        if(sum_durability<=0 && hala>0)

        {            return " use the " +name +" dealing with "+get_damage()+
                "    "+" the device breaks ";


        }
        else if(sum_durability<=0 && hala<=0)
        {
            return " you can't use "+" "+"device "+"its "+"broken ";
        }
        else
        {
            return " use the " +name +" dealing with "+get_damage();
        }

    }


}