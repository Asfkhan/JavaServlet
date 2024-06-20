package mybeans;
import javax.ejb.Stateless;
@Stateless
public class CCBean {public CCBean(){}
public int r2Dollar(int r){ return r/65; }
public int d2Rupees(int d){ return d*65;}

}
