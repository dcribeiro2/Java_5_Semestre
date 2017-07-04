package br.univel.cdi;

public class ProdutoDAO {
	   @Inject private EntityManager manager;
	 
	   public void adiciona(ProdutoController produto) {
	      manager.persist(produto);
	   }
	}