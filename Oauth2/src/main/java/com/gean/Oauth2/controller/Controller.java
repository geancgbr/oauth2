package com.gean.Oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    // Ending point é publico! Você pode ter acesso.
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "entrou no endpoin!";
    }

    // Ending point é privado! Você precisa de autenticação para ver.
    @GetMapping("/arearestrita")
    public String areaRestrita() {
        return "entrou em uma área restrita e está autenticado!";
    }





}
