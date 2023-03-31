package de.htwberlin.f4.website1.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.htwberlin.f4.website1.service.UserService;
import de.htwberlin.f4.website1.vo.UserVO;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/findAll")
    public List<UserVO> findAll() {
        return userService.findAll();
    }

    @PostMapping(value = "/createUser")
    public void createUser(@RequestBody UserVO userVO) {
        userService.createUser(userVO);
    }

    @PutMapping(value = "/updateUser/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody UserVO userVO) {
        userService.updateUser(id, userVO);
    }

    @DeleteMapping(value = "/deleteUser/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}

	


