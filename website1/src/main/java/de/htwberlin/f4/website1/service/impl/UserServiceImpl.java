package de.htwberlin.f4.website1.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.htwberlin.f4.website1.persitence.entity.User;
import de.htwberlin.f4.website1.persitence.repository.BasicRepositoryUser;
import de.htwberlin.f4.website1.service.UserService;
import de.htwberlin.f4.website1.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BasicRepositoryUser basicRepositoryUser;

    @Override
    public List<UserVO> findAll() {
        List<UserVO> res = new ArrayList<>();

        List<User> userList = (List<User>) basicRepositoryUser.findAll();

        for (User u : userList) {
            UserVO newUser = new UserVO();
            newUser.setId(u.getId());
            newUser.setFirstname(u.getFirstName());
            newUser.setLastname(u.getLastName());
            res.add(newUser);
        }

        return res;
    }

    @Override
    public void createUser(UserVO userVO) {
        User newUser = new User();
        newUser.setFirstName(userVO.getFirstname());
        newUser.setLastName(userVO.getLastname());
        basicRepositoryUser.save(newUser);
    }

    @Override
    public void updateUser(Long id, UserVO userVO) {
        if (basicRepositoryUser.findById(id).isPresent()) {
            User u = basicRepositoryUser.findById(id).get();
            u.setFirstName(userVO.getFirstname());
            u.setLastName(userVO.getLastname());
            basicRepositoryUser.save(u);
        }
    }

    @Override
    public void deleteUser(Long id) {
        if (basicRepositoryUser.existsById(id)) {
            basicRepositoryUser.deleteById(id);
            
        }
    }

}