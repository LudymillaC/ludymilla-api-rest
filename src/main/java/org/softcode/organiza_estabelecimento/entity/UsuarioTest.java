package org.softcode.organiza_estabelecimento.entity;

class Usuario_test {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1L, "Ludymilla Oliveira", "ludymilla.oliveira@example.com", "senha123",  "1234567890", "usuário", "ativo");
        usuario.setCpf(null); 
        // O cpf será iniciado como null, mas pode ser atualizado posteriormente usando o método setCpf
    
        System.out.println("ID: " + usuario.getId());
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail()); 
        System.out.println("Senha: " + usuario.getSenha());
        System.out.println("Contato: " + usuario.getContato());
        System.out.println("Permissões: " + usuario.getPermissoes());
        System.out.println("Condição: " + usuario.getCondicao());
        // poderá ter dois tipos de validação no cpf, uma para verificar se o formato é válido e outra para verificar se o cpf já existe no sistema na camada de banco de dados, já na camada service será validado se na receita federal o cpf é válido, para isso será necessário fazer uma integração com a receita federal, utilizando a API disponibilizada por eles.
    }
}
