package com.skillstorm.project_2.models;

import jakarta.validation.constraints.*;
import jakarta.validation.constraints.Pattern.Flag;

public class User {
    @NotEmpty(message = "The full name is required.")
    @Size(min = 2, max = 100, message = "The length of full name must be between 2 and 100 characters.")
    private String fullName;

    @NotEmpty(message = "The email address is required.")
    @Email(message = "The email address is invalid.", flags = { Flag.CASE_INSENSITIVE })
    private String email;

    // public User toUser() {
    // return new User()
    // .setName(fullName)
    // .setEmail(email.toLowerCase());

    public User() {
    }

    public User(
            @NotEmpty(message = "The full name is required.") @Size(min = 2, max = 100, message = "The length of full name must be between 2 and 100 characters.") String fullName,
            @NotEmpty(message = "The email address is required.") @Email(message = "The email address is invalid.", flags = Flag.CASE_INSENSITIVE) String email) {
        this.fullName = fullName;
        this.email = email;
    }

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

    @Override
    public String toString() {
        return "User [fullName=" + fullName + ", email=" + email + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (fullName == null) {
            if (other.fullName != null)
                return false;
        } else if (!fullName.equals(other.fullName))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }

}
