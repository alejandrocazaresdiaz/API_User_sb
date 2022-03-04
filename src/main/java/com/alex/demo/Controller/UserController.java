package com.alex.demo.Controller;

/*import com.alex.demo.model.User;
import com.alex.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;*/
import com.alex.demo.model.User;
import com.alex.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping("/hello")
    public String sayHello(){
        return "It works!";
    }

    @GetMapping("/users")
    public List<User> allUsers(){
        return repository.findAll();
    }

    @GetMapping("/user/{name}")
    public List<User> findByName(@PathVariable("name") String name){
        return repository.findByName(name);
    }

    @PostMapping ("/user")
    public User createUser(@RequestBody User user){
        return repository.save(user);
    }

    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user){
        return repository.save(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        repository.deleteById(id);
    }

}
