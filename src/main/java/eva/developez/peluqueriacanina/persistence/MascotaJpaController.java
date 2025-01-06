package eva.developez.peluqueriacanina.persistence;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Eva Lopez
 */
public class MascotaJpaController implements Serializable{
    
    
    public MascotaJpaController(EntityManagerFactory emf){
        this.emf = emf;
    }
     private EntityManagerFactory emf = null;
     
     public MascotaJpaController() {
         emf = Persistence.createEntityManagerFactory("PeluqueriaCaninaPU");
     }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    

    


    


   
    
    
}
