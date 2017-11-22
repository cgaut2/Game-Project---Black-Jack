

//Author Franklin Dang

/*
if a card object is between 10 and 13 the value will be 10
*/

package b4djack;
//Returns card value, if you get a king, queen or jack the value is set to 10
public class Cards
{
    
    int id;
    
    public Cards(int seed)
    {
        id = seed;
    }
    
    public int getValue()
    {
        if(id>9)
        {
            return 10;
        }

        return id;
    }
    
}