package com.mburn.courseSpring.resources;

import com.mburn.courseSpring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity <User> findAll() {

        User user = new User(1L,"Jackson","jackson@gmail.com","9999999999", "123456");
        return ResponseEntity.ok(user);

    }



}
