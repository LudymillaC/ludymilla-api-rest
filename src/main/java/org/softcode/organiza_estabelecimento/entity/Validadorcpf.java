package org.softcode.organiza_estabelecimento.entity;

public class Validadorcpf {

    public static boolean validarCPF(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("\\D", "");

        // Verifica se tem 11 dígitos ou se é uma sequência inválida conhecida
        if (cpf.length() != 11 || 
            cpf.equals("00000000000") || cpf.equals("11111111111") ||
            cpf.equals("22222222222") || cpf.equals("33333333333") ||
            cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") ||
            cpf.equals("88888888888") || cpf.equals("99999999999")) {
            return false;
        }

        try {
            // Cálculo do primeiro dígito verificador
            int sm = 0, peso = 10;
            for (int i = 0; i < 9; i++) {
                int num = cpf.charAt(i) - '0';
                sm += num * peso;
                peso -= 1;
            }
            int r = 11 - (sm % 11);
            int dig10 = (r == 10 || r == 11) ? 0 : r;

            // Cálculo do segundo dígito verificador
            sm = 0; peso = 11;
            for (int i = 0; i < 10; i++) {
                int num = cpf.charAt(i) - '0';
                sm += num * peso;
                peso -= 1;
            }
            r = 11 - (sm % 11);
            int dig11 = (r == 10 || r == 11) ? 0 : r;

            // Verifica se os dígitos calculados conferem com os dígitos informados
            return (dig10 == (cpf.charAt(9) - '0')) && (dig11 == (cpf.charAt(10) - '0'));

        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String cpf = "123.456.789-00"; // Exemplo
        if (validarCPF(cpf)) {
            System.out.println("CPF Válido");
        } else {
            System.out.println("CPF Inválido");
        }
    }
}