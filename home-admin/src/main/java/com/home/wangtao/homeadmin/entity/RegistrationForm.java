package com.home.wangtao.homeadmin.entity;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class RegistrationForm {

    private String username;
    private String password;
    private String fullName;
    private String street;
    private String city;
    private String state;
    private String zip;
    private Long phoneNumber;

    public UserDO toUser(PasswordEncoder passwordEncoder) {
        return new UserDO(username, passwordEncoder.encode(password), fullName, street, city, state, zip, phoneNumber);
    }
}
