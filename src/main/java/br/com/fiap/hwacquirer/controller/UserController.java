package br.com.fiap.hwacquirer.controller;

import br.com.fiap.hwacquirer.dto.AuthDTO;
import br.com.fiap.hwacquirer.dto.CreateUserDTO;
import br.com.fiap.hwacquirer.dto.JwtDTO;
import br.com.fiap.hwacquirer.dto.UserDTO;
import br.com.fiap.hwacquirer.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("login")
    public JwtDTO login (@RequestBody AuthDTO authDTO) throws Exception {
        return userService.login(authDTO);
    }

    @PostMapping
    public UserDTO createUser(@RequestBody CreateUserDTO createUserDTO) {
        return userService.createUser(createUserDTO);
    }
}
