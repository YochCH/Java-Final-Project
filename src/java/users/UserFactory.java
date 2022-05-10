/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import clinic.*;

/**
 *
 * @author huser
 */
public class UserFactory {
    public static User getNewUser(LawEnum law){
        if(law==LawEnum.DOCTOR){
            return new Doctor();
        }
        else{
            return new Patient();
        }
    }
}
