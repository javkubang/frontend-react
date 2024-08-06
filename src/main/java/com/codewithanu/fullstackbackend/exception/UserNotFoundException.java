package com.codewithanu.fullstackbackend.exception;
/* Created by Anuradha Vasudevan */

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not found the user with id "+ id);
    }
}
