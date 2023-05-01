package br.com.fiap.hwacquirer.dto;

import java.time.LocalDate;

public record StudentCreateUpdateDTO(
        String name,
        String email,
        LocalDate birthDate,
        String course
){
}
