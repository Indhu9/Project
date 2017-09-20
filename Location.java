/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment6;

/**
 *
 * @author Indhu
 */
public class Location 
{
    int id, item_id;
    String name, status, delivery_address;
    String delivery_time;
    public Location(int id, int item_id, String name, String status,String delivery_address,
                                                    String delivery_time)
    {
        this.id = id;
        this.item_id = item_id;
        this.name = name;
        this.status = status;
        this.delivery_address = delivery_address;
        this.delivery_time = delivery_time;
    }
    public int getid()
    {
        return id;
    }
    public int getItemid()
    {
        return item_id;
    }
    public String getName()
    {
        return name;
    }
    public String getStatus()
    {
        return status;
    }
    public String getDeliveryAddress()
    {
        return delivery_address;
    }
    public String getDeliverytime()
    {
        return delivery_time;
    }
}
