/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package webcrawler;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author joyce_c
 * @guy who added some more code sodhi_a
 */

public class WebCrawler
{
    public static String fixOutput(String output)
    {
        output = output.replaceAll("&amp;", "&");
        output = output.replaceAll("\"<br>\"", ": ");
        output = output.replaceAll("\"<br></td><td style=\"text-align:center\">\"", ": ");
        output = output.replaceAll("</a>", "");
        output = output.replaceAll("<br>", "");
        output = output.replaceAll("<b>", "");
        output = output.replaceAll("</b>", "");
        output = output.replaceAll("<i>", "");
        output = output.replaceAll("</i>", "");
        
        return output;
    }
    public static ArrayList<String> printAllInSection(String url, int delay, String magicKey, String prefix, String suffix, int listNum)
    {
        VirtualBrowser browser = new VirtualBrowser();
        String allCode = browser.download(url, delay);
        ArrayList<String> result = new ArrayList();
        
        int foundAt = allCode.indexOf(magicKey);
        int counter = 1;
        
        if(listNum > 0)
        {
            for(int n = 0; n < listNum; n++)
            {
                if(allCode.indexOf(magicKey, foundAt) > 0)
                {
                    int starting = allCode.indexOf(magicKey, foundAt);
                    starting = allCode.indexOf(prefix, starting);
                    int ending = allCode.indexOf(suffix, starting);

                    String output = allCode.substring(starting+(prefix.length()), ending);
                    output = counter+") "+output;

                    output = fixOutput(output);
                    
                    result.add(output);
                    
                    foundAt = ending;
                    counter++;
                }
                else
                {
                }
            }
        }
        else if(listNum == 0) //enter 0 as the listNum to print the whole list
        {
            while(allCode.indexOf(magicKey, foundAt) > 0)
            {
                int starting = allCode.indexOf(magicKey, foundAt);
                starting = allCode.indexOf(prefix, starting);
                int ending = allCode.indexOf(suffix, starting);

                String output = allCode.substring(starting+(prefix.length()), ending);
                output = counter+") "+output;
                
                output = fixOutput(output);

                result.add(output);
                
                foundAt = ending;
                counter++;
            }
        }
        else
        {
        }
        return result;
    }
    
    public static void main(String[] args) 
    {
        /* VirtualBrowser browser = new VirtualBrowser();
        String tvGuide = browser.download("https://www.tvtv.ca/bc/surrey/lu36594"); //Put number after url for
        a time delay
        System.out.println(tvGuide);
        Scanner in = new Scanner(System.in);
        System.out.println("Hit Enter to Continue...");
        in.nextLine();
        */
        
        // THE ONION
        // Categories
        //printAllInSection("https://www.theonion.com/", 0, "sc-1out364-0 hMndXN sc-1hjwdsc-0 bFEOoK js_link", ">", "</a>", 0);
        // Titles
        //printAllInSection("https://www.theonion.com/", 0, "sc-1qoge05-0 gWMyPL", ">", "</h4>", 0);
        // Text
        //printAllInSection("https://www.theonion.com/", 0, "sc-1d3a351-0 cOnuyB", ">", "</p>", 0);
        
        
        // CLUB PENGUIN WIKIPEDIA PAGE
        // Table of contents
        //printAllInSection("https://en.wikipedia.org/wiki/Club_Penguin", 0, "toctext", ">", "</span>", 0);
        
        
        // PROPERTY BROTHERS WIKIPEDIA PAGE (you knew it was bound to happen)
        // List of all episode titles (in order of release, oldest at the top)
        //printAllInSection("https://en.wikipedia.org/wiki/List_of_Property_Brothers_episodes", 0, "<td class=\"summary\" style=\"text-align:left\"", ">\"", "\"</td>", 0);
        
        
        // TREE OCTOPUS WEBSITE
        // All text on home page (I made it for every page in the UI)
        //printAllInSection("https://zapatopi.net/treeoctopus/", 0,"<p", ">", "</p>", 0);
        
    }
}