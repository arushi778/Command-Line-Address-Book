import java.util.ArrayList;
import java.io.*;
public class AddressBook
{
    private ArrayList<AddressEntry> entries;

    public AddressBook()
    {
        entries = new ArrayList<>();
    }
    public void addEntry(AddressEntry entry)
    {
        entries.add(entry);
    }
    public void displayAllEntries()
    {
        for(AddressEntry entry:entries)
        {
            System.out.println(entry);
        }
    }
    public boolean deleteEntry(String name)
    {
        for(AddressEntry entry:entries)
        {
            if(entry.getName().equalsIgnoreCase(name))
            {
                entries.remove(entry);
                return true;
            }
        }
        return false;
    }
    public void saveToFile(String fileName)
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for(AddressEntry entry : entries)
            {
                writer.write(entry.getName() + "," + entry.getAddress() + "," +
                entry.getPhoneNumber() + "," + entry.getEmail());
                writer.newLine();
            }
            System.out.println("Address book saved to " + fileName);
        }
        catch(IOException e)
        {
          System.out.println("An error occured while saving the file");
          e.printStackTrace();
        }
    }
    public void loadFromFile(String fileName)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine())!=null)
            {
                String data[] = line.split(",");
                if(data.length==4)
                {
                    AddressEntry entry = new AddressEntry(data[0],data[1],data[2],data[3]);
                    entries.add(entry);
                }
            }
            System.out.println("Address Book loaded from : "+fileName);
        }
        catch(IOException e)
        {
          System.out.println("An error occured while loading the file");
          e.printStackTrace();
        }
    }
}
