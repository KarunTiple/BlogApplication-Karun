package com.bikkadit.blogappapi.payloads;

import lombok.Data;

@Data
public class JwtAuthResponse {

    private String email;
    private String token;

}
