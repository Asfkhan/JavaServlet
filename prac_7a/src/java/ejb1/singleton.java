package ejb1;
import javax.ejb.Singleton;
@Singleton
public class singleton 
        
{
    private int hits = 1;
    public synchronized int gethits(){
        return hits++;
    }
}
