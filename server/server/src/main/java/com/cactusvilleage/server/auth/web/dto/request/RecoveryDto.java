package com.cactusvilleage.server.auth.web.dto.request;

import lombok.*;
import com.cactusvilleage.server.auth.validator.EmailForm;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RecoveryDto {
    @EmailForm
    private String email;

    private String username;
}
