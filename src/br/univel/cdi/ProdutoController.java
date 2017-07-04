package br.univel.cdi;

public class ProdutoController {
    @Inject private ProdutoDAO dao;
 
    public String inserir() {
        ProdutoController p = new ProdutoController();
        dao.adiciona(p);
        return "Produto adicionado!";
    }
}
