package org.softcode.organiza_estabelecimento.entity;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Lancamento_do_pedido implements Serializable {
    private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @ManyToOne
        @JoinColumn(name = "pedido_id", nullable = false, foreignKey = @ForeignKey(name = "fk_lancamento_do_pedido_pedido"))
        private Pedido pedido;

        @ManyToOne
        @JoinColumn(name = "produto_id", nullable = false, foreignKey = @ForeignKey(name = "fk_lancamento_do_pedido_produto"))
        private Produto produto;

        @ManyToOne
        @JoinColumn(name = "preco_id", nullable = false, foreignKey = @ForeignKey(name = "fk_lancamento_do_pedido_preco"))
        private Preco preco;

        @ManyToOne
        @JoinColumn(name = "desconto_id", nullable = true, foreignKey = @ForeignKey(name = "fk_lancamento_do_pedido_desconto"))
        private Desconto desconto;

        // Getters e Setters    

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Pedido getPedido() {
            return pedido;
        }

        public void setPedido(Pedido pedido) {
            this.pedido = pedido;
        }

        public Produto getProduto() {
            return produto;
        }
        public void setProduto(Produto produto) {
            this.produto = produto;
        }

        public Preco getPreco() {
            return preco;
        }

        public void setPreco(Preco preco) {
            this.preco = preco;
        }

        public Desconto getDesconto() {
            return desconto;
        }
        public void setDesconto(Desconto desconto) {
            this.desconto = desconto;
        }
        


}
