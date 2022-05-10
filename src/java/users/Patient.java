/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import clinic.Treatment;
import java.util.List;

/**
 *
 * @author huser
 */
public class Patient extends User {
    private int id;
    private static int count;
    private List<Treatment> treatments;
    
}
