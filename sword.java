public class sword extends weapon{

    public sword(String man ,double bas_damage,double bas_durab_ilityy,double weightt,int vall)
    {
        super( man, bas_damage, bas_durab_ilityy, vall, weightt);

    }
    double damage;
    @Override
    void polish() {
        if((0.25*base_damage)<=(damage_modifier+change_rate))
        {
            damage_modifier=damage_modifier+change_rate;
        }
        damage = get_damage();
    }

    @Override
    public String toString() {
        return  super.toString()+"{ "+
                "damage=" + damage +
                "} " ;
    }
}