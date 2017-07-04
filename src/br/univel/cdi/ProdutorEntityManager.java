package br.univel.cdi;

public class ProdutorEntityManager {
	 
	   @Produces @RequestScoped
	   public EntityManager criaEntityManager() {
		return null;
	      // ...
	   }
	 
//	   public void finaliza(@Disposes EntityManager manager) {
//	      manager.clone();
//	   }
	}