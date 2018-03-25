package com.patternbuilder.saltoleto.domain;

import com.patternbuilder.saltoleto.enums.*;


public class Soldado {

    private String nome;
    private Aparelhos aparelhos;
    private ArmaPrimaria armaPrimaria;
    private ArmaSecundaria armaSecundaria;
    private Colete colete;
    private Especialidade especialidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aparelhos getAparelhos() {
        return aparelhos;
    }

    public void setAparelhos(Aparelhos aparelhos) {
        this.aparelhos = aparelhos;
    }

    public ArmaPrimaria getArmaPrimaria() {
        return armaPrimaria;
    }

    public void setArmaPrimaria(ArmaPrimaria armaPrimaria) {
        this.armaPrimaria = armaPrimaria;
    }

    public ArmaSecundaria getArmaSecundaria() {
        return armaSecundaria;
    }

    public void setArmaSecundaria(ArmaSecundaria armaSecundaria) {
        this.armaSecundaria = armaSecundaria;
    }

    public Colete getColete() {
        return colete;
    }

    public void setColete(Colete colete) {
        this.colete = colete;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Esse é um especialista em ")
                .append(especialidade)
                .append(" chamado ")
                .append(nome);

        if (armaPrimaria != null) {
            sb.append(" utilizando ");
            sb.append(armaPrimaria).append(" como arma principal ");
        }

        if (armaSecundaria != null) {
            sb.append("de reserva uma ").append(armaSecundaria);
        }

        if (colete != null) {
            sb.append(" vestindo um colete do tipo ").append(colete);
        }

        if (aparelhos != null) {
            sb.append(" utilizando um ").append(aparelhos).append(" para entrar");
        }

        sb.append('.');
        return sb.toString();
    }

    public Soldado(Builder builder) {
        this.nome = builder.nome;
        this.aparelhos = builder.aparelhos;
        this.armaPrimaria = builder.armaPrimaria;
        this.armaSecundaria = builder.armaSecundaria;
        this.especialidade = builder.especialidade;
    }

    public static class Builder {

        private String nome;
        private Aparelhos aparelhos;
        private ArmaPrimaria armaPrimaria;
        private ArmaSecundaria armaSecundaria;
        private Colete colete;
        private Especialidade especialidade;

        public Builder(Especialidade especialidade,String nome) {
            this.nome = nome;
            this.especialidade = especialidade;
            if(especialidade == null || nome == null){
                throw new IllegalArgumentException("validacao.argumento");
            }
            this.especialidade = especialidade;
            this.nome = nome;
        }

        public Builder comArmaPrimaria(ArmaPrimaria armaPrimaria){
            this.armaPrimaria = armaPrimaria;
            return this;
        }

        public Builder comArmaSecundaria(ArmaSecundaria armaSecundaria){
            this.armaSecundaria = armaSecundaria;
            return this;
        }

        public Builder comColete(Colete colete){
            this.colete = colete;
            return this;
        }

        public Builder comAparelhos(Aparelhos aparelhos){
            this.aparelhos = aparelhos;
            return this;
        }

        public Soldado build(){
            return new Soldado(this);
        }

    }

}
