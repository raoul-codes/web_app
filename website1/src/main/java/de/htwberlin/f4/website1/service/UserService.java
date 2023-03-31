package de.htwberlin.f4.website1.service;

import java.util.List;

import de.htwberlin.f4.website1.vo.UserVO;

public interface UserService {

    List<UserVO> findAll();

    void createUser(UserVO userVO);

    void updateUser(Long id, UserVO userVO);

    void deleteUser(Long id);

}
