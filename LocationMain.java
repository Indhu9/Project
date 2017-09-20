/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment6;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Indhu
 */
public class LocationMain 
{
    public static void main(String ...ar) throws IOException
    {
        Set<Location> s=new HashSet<Location>();
        Location loc = new Location
        (110, 405, "Khammam", "Vijayawada", "Madhurawada, Vizag", "3-4 days");
        s.add(loc);
        loc=new Location
        (123, 362, "Hyderabad", "Vijayawada", "Vijayawada", "2-3 days");
        s.add(loc);
        ObjectMapper map = new ObjectMapper();
        map.writeValue(new File("d:\\location.json"), s);
        System.out.println("JSON file for Location entity created successfully.");
    }
}
