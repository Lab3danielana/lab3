/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class Administrator extends User {
    
    private String[] permissions;
    private String[] role;
    
    
    public void addRole (String role1){
        
        for(int i=0;i<role.length;i++){
            if(getRole()[i]==""){
                getRole()[i]=role1;
        }            
        }
    }
    
    public void removeRole (String role1){
        for(int i=0;i<role.length;i++){
            if(getRole()[i]==role1){
                getRole()[i]="";
        }            
        }
        
    }
    
    public void addpermissions (String permissions1){
        
        for(int i=0;i<permissions.length;i++){
            if(getPermissions()[i]==""){
                getPermissions()[i]=permissions1;
        }            
        }
    }
    
    public void removepermissions (String permissions1){
        for(int i=0;i<permissions.length;i++){
            if(getPermissions()[i]==permissions1){
                getPermissions()[i]="";
        }            
        }
        
    }

    /**
     * @return the permissions
     */
    public String[] getPermissions() {
        return permissions;
    }

    /**
     * @param permissions the permissions to set
     */
    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }

    /**
     * @return the role
     */
    public String[] getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String[] role) {
        this.role = role;
    }
    
    
}
