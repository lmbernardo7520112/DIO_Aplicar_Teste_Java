package com.teste;

public class Calculadora {
    public int somar(String expressao) {
        int soma = 0;
        for (String ValorSomar: expressao.split("\\+"))
            soma += Integer.valueOf(ValorSomar);

        System.out.println(soma);
        return soma;
    }
}
