import java.util.ArrayList;
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
}
