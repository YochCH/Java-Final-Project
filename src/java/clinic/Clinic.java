/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

import java.util.List;
import java.util.Map;
import users.*;

/**
 *
 * @author huser
 */
public class Clinic {
    private Map<String,User> users;
    private Clinic clinic;
    private Clinic(){
        
    }
    
    public Clinic getClinic(){
        if(this.clinic==null){
            this.clinic=new Clinic();
        }
        return this.clinic;
    }
    
    public void addUser(String password, String name, LawEnum law){
        User u= UserFactory.getNewUser(law);
        
    }
    
}
