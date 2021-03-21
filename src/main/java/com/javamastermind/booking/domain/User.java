package com.javamastermind.booking.domain;

/**
 * @author lahiru_w
 */
public class User
{

    private String email;

    private String password;

    private String accountStatus;

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getAccountStatus()
    {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus)
    {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString()
    {
        return "User [email=" + email + ", password=" + password + ", accountStatus=" + accountStatus + "]";
    }

}
