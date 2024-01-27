/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spellchecker;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

/**
 *
 * @author Cam
 */
public class Dictionary extends ArrayList<String>
{
    private int accesses_;
    public Dictionary()
    {
        super();
        load();
        accesses_ = 0;
    }

    public void load()
    {
        try
        {
            File dictionary = new File("dictionary.txt");
            Scanner data = new Scanner( dictionary );
            while(data.hasNext())
                add(data.next());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    @Override
    public String get(int n)
    {
        accesses_++;
        return super.get(n);
    }

    public int accesses()
    {
        return accesses_;
    }

    public void resetCount()
    {
        accesses_ = 0;
    }
}
