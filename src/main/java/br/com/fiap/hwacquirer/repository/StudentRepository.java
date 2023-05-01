package br.com.fiap.hwacquirer.repository;

import br.com.fiap.hwacquirer.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    List<StudentEntity> findAllByCourse(String course);
}
