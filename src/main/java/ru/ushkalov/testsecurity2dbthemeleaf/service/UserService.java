package ru.ushkalov.testsecurity2dbthemeleaf.service;

import org.springframework.stereotype.Service;
import ru.ushkalov.testsecurity2dbthemeleaf.dto.UserDto;
import ru.ushkalov.testsecurity2dbthemeleaf.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
