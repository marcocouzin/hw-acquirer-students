package br.com.fiap.hwacquirer.dto;

import br.com.fiap.hwacquirer.dto.security.Principal;

public record AuthDTO(
        String name,
        Principal principal

) {
}
