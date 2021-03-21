package com.javamastermind.booking.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author lahiru_w
 */

@Document
public class User
{

    @Id
    private ObjectId _id;

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

    public ObjectId get_id()
    {
        return _id;
    }

    public void set_id(ObjectId _id)
    {
        this._id = _id;
    }

    @Override
    public String toString()
    {
        return "User [_id=" + _id + ", email=" + email + ", password=" + password + ", accountStatus=" + accountStatus
            + "]";
    }

}
