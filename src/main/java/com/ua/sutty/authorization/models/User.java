package com.ua.sutty.authorization.models;

import com.ua.sutty.authorization.forms.UserForm;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    public static User from(UserForm userForm){
        return User.builder()
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .password(userForm.getPassword())
                .username(userForm.getUsername())
                .email(userForm.getEmail())
                .build();
    }

}
