package com.example.backend.Authentication;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoder;
import io.jsonwebtoken.io.Decoders;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;

@Component
public class JWTGenerator {
    public JWTGenerator() {
    }

    public String jwtGenerator(String username){
        HashMap<String,Object> claims=new HashMap<>();
        return createToken(claims,username);
    }

    private String createToken(HashMap<String, Object> claims, String username) {
        byte[] keyBytes= Decoders.BASE64.decode("4E645267556B58703273357638792F423F4528472B4B6250655368566D597133");

        return Jwts.builder().setClaims(claims).setSubject(username).setIssuedAt(new Date(System.currentTimeMillis())).setExpiration(new Date(System.currentTimeMillis()*1000*60*10)).compact();



    }

}
