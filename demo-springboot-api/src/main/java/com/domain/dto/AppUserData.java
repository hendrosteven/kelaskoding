package com.domain.dto;

public class AppUserData {
    private String fullName;
    private String email;
    private String password;
    private String appUserRole;
    
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAppUserRole() {
        return appUserRole;
    }
    public void setAppUserRole(String appUserRole) {
        this.appUserRole = appUserRole;
    }

    
}
