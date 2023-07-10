package com.pia.yazkampi.service;

import com.pia.yazkampi.dto.UserResponse;
import com.pia.yazkampi.dto.UserSaveRequest;
import com.pia.yazkampi.entity.User;
import com.pia.yazkampi.exception.RecordNotFoundException;
import com.pia.yazkampi.repository.UserRepository;
import com.pia.yazkampi.util.UserMapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse save(UserSaveRequest request) {
        User user = UserMapperUtil.toUser(request);
        User savedUser = userRepository.save(user);
        return UserMapperUtil.toUserResponse(savedUser);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getById(String id) {
        Optional<User> byId = userRepository.findById(id);
        if (byId.isPresent())
            return byId.get();
        else
            return null;
    }

    public UserResponse update(UserSaveRequest request, String username) {
        User byUsername = userRepository.findByUsername(username);

        if (byUsername == null)
            throw new RecordNotFoundException();

        User user = UserMapperUtil.forUpdate(request, byUsername);

        userRepository.save(user);

        return UserMapperUtil.toUserResponse(user);
    }
}
