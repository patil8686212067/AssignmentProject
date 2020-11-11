package com.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class CountFilesCreatedByMonth 
{
private static final String FOLDER_PATH ="E:\\Zip";
public static void main(String[] args) throws IOException 
{
    File dir = new File(FOLDER_PATH);
    File[] files =dir.listFiles();
    int janfilesCountInMonth=0;
    int febfilesCountInMonth=0;
    int marfilesCountInMonth=0;
    
    int aprfilesCountInMonth=0;
    int mayfilesCountInMonth=0;
    int junfilesCountInMonth=0;
    
    int julyfilesCountInMonth=0;
    int augfilesCountInMonth=0;
    int sepfilesCountInMonth=0;
    
    int octfilesCountInMonth=0;
    int novfilesCountInMonth=0;
    int decfilesCountInMonth=0;
    


    SimpleDateFormat sdf = new SimpleDateFormat("MMM");

    for(File f:files)
    {

        String month = sdf.format(f.lastModified());

        if(month.equals("Jan"))
        {
        	janfilesCountInMonth++;
        	
        	System.out.println("In Month Of "+month +" created = "+ janfilesCountInMonth +" files.");
        	
        }
        if(month.equals("Feb"))
        {
        	febfilesCountInMonth++;
        	
        	System.out.println("In Month Of "+month +" created = "+ febfilesCountInMonth +" files.");
        	
        }
        if(month.equals("Mar"))
        {
        	marfilesCountInMonth++;
        	
        	System.out.println("In Month Of "+month +" created = "+ marfilesCountInMonth +" files.");
        	
        }
        if(month.equals("Apr"))
        {
        	aprfilesCountInMonth++;
        	
        	System.out.println("In Month Of "+month +" created = "+ aprfilesCountInMonth +" files.");
        	
        }
        if(month.equals("May"))
        {
        	mayfilesCountInMonth++;
        	
        	System.out.println("In Month Of "+month +" created = "+ mayfilesCountInMonth +" files.");
        	
        }
        if(month.equals("Jun"))
        {
        	junfilesCountInMonth++;
        	
        	System.out.println("In Month Of "+month +" created = "+ junfilesCountInMonth +" files.");
        	
        }
        if(month.equals("Jul"))
        {
        	julyfilesCountInMonth++;
        	
        	System.out.println("In Month Of "+month +" created = "+ julyfilesCountInMonth +" files.");
        	
        }
        
        
        if(month.equals("Aug"))
        {
        	augfilesCountInMonth++;
        	
        	System.out.println("In Month Of "+month +" created = "+ augfilesCountInMonth +" files.");
        	
        }
        if(month.equals("Sep"))
        {
        	sepfilesCountInMonth++;
        	
        	System.out.println("In Month Of "+month +" created = "+ sepfilesCountInMonth +" files.");
        	
        }
        if(month.equals("Oct"))
        {
        	octfilesCountInMonth++;
        	
        	System.out.println("In Month Of "+month +" created = "+ octfilesCountInMonth +" files.");
        	
        }
        if(month.equals("Nov"))
        {
        	novfilesCountInMonth++;
        	
        	System.out.println("In Month Of "+month +" created = "+ novfilesCountInMonth +" files.");
        	
        }
        if(month.equals("Dec"))
        {
        	decfilesCountInMonth++;
        	
        	System.out.println("In Month Of "+month +" created = "+ decfilesCountInMonth +" files.");
        	
        }
    
     
    }
  }
}
