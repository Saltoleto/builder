package com.patternbuilder.saltoleto.enums;

public enum ArmaSecundaria {
    PISTOLA("Pistola"), REVOLVER("Revolver"), SUB_METRALHADORA("Sub Metralhadora"), FACA("Faça");
    private String descricao;

    ArmaSecundaria(String descricao) {
        this.descricao = descricao;
    }
}
