public  class ItemWeightComparator implements itemComparator{

    public int compare(item i1,item i2)
    {
         if(i1.weight<i2.weight)
        return -1;
    else if(i1.weight>i2.weight)
        return 1;
    else
         return (i1.compareTo(i2));}
}