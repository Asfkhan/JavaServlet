package mypack;

import javax.ejb.Stateless;
@Stateless
public class CheckerBean {
    private String name,age,hob,email,gender,error;
    public CheckerBean(){error="";}
    public void setName(String n){name=n;}
    public void setAge(String a){age=a;}
    public void setHobbies(String h){hob=h;}
    public void setEmail(String e){email=e;}
    public void setGender(String g){gender=g;}
    public void setError(String err){error=err;}
    public String getName(){return name;}
    public String getAge(){return age;}
    public String getHobbies(){return hob;}
    public String getEmail(){return email;}
    public String getGender(){return gender;}
    public String getError(){return error;}
    public boolean validate(){
    boolean res=true;
        if(name.equals("")) {error+="<br>Enter first name";res=false;}
        if(age.length()>2) {error+="<br>Enter proper Age";res= false;}
        return res;
    }
}


