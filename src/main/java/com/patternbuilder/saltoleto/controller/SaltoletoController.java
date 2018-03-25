package com.patternbuilder.saltoleto.controller;

import com.patternbuilder.saltoleto.domain.Soldado;
import com.patternbuilder.saltoleto.enums.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SaltoletoController {


    @RequestMapping( value = "/assalto", method = RequestMethod.GET, produces = { "application/json" })
    public Soldado assalto() {
        return new Soldado.Builder(Especialidade.ASSALTO, "Cpt Nascimento")
                .comArmaPrimaria(ArmaPrimaria.FUZIL)
                .comArmaSecundaria(ArmaSecundaria.PISTOLA)
                .comColete(Colete.CERAMICO)
                .build();
    }

    @RequestMapping( value = "/suporte", method = RequestMethod.GET, produces = { "application/json" })
    public Soldado suporte() {
        return new Soldado.Builder(Especialidade.SUPORTE, "Rambo")
                .comArmaPrimaria(ArmaPrimaria.METRALHADORA)
                .comAparelhos(Aparelhos.EXPLOSIVO_C4)
                .comColete(Colete.CERAMICO)
                .build();
    }

    @RequestMapping( value = "/engenheiro", method = RequestMethod.GET, produces = { "application/json" })
    public Soldado engenheiro() {
        return new Soldado.Builder(Especialidade.ENGENHEIRO, "Jack Bauer")
                .comAparelhos(Aparelhos.BOMBA_FUMACA)
                .comArmaSecundaria(ArmaSecundaria.PISTOLA)
                .comColete(Colete.KEVLAR)
                .build();
    }

    @RequestMapping( value = "/batedor", method = RequestMethod.GET, produces = { "application/json" })
    public Soldado batedor() {
        return new Soldado.Builder(Especialidade.BATEDOR, "Chris Kyle")
                .comArmaPrimaria(ArmaPrimaria.RIFLE)
                .comArmaSecundaria(ArmaSecundaria.REVOLVER)
                .comColete(Colete.ALUMINIO)
                .comAparelhos(Aparelhos.BOMBA_FUMACA)
                .build();
    }

}
