package br.com.fiap.hwacquirer.repository;

import br.com.fiap.hwacquirer.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findFirstByUserName(String username);
}
