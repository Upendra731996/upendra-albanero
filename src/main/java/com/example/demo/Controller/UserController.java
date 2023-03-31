package com.example.demo.Controller;
import java.util.List;
import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/post")
    public String creteUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/get")
    public List<User> getuse(){
        return userService.getUer();

    }
    @PutMapping("/update/{id}")

    public User update(@PathVariable String id,@RequestBody User user){

        return userService.updateUser(id,user);
    }

@DeleteMapping("/del/{id}")

    public String DeleteUser(@PathVariable String id){

   userService.dell(id);
    return "send";
}


}
