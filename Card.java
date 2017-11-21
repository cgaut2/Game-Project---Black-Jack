/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitting;


public class Card
{
    
    int id;
    
    public Card(int seed)
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