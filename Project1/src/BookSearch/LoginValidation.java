/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookSearch;

/**
 *
 * @author dhrisyad
 */
/**
 * This will have methods to check if a given username exists in the Users array 
created and initiated in the InitiateObjects method,the methods in this class will be 
* called by the Login jframe
* */

public class LoginValidation {
    
    public Boolean loginValid(String _username,String _password,Users[] usersArray){
        Boolean returnVal=false;
        for (int i=0;i<usersArray.length;i++){
            if (usersArray[i]==null)
                break;
            if (usersArray[i].getUsername().equalsIgnoreCase(_username) && usersArray[i].getPassword().equals(_password)){
                returnVal=true;
                break;
            }
        }
        return returnVal;
    }
}
