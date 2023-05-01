package br.com.fiap.hwacquirer.service;

import br.com.fiap.hwacquirer.dto.AuthDTO;
import br.com.fiap.hwacquirer.dto.CreateUserDTO;
import br.com.fiap.hwacquirer.dto.JwtDTO;
import br.com.fiap.hwacquirer.dto.UserDTO;

public interface UserService {
    JwtDTO login(AuthDTO authDTO) throws Exception;
    UserDTO createUser(CreateUserDTO createUserDTO);
}
