package eva.developez.peluqueriacanina.persistence;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Eva Lopez
 */
public class DuenioJpaController implements Serializable {

    public DuenioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public DuenioJpaController() {
         emf = Persistence.createEntityManagerFactory("PeluqueriaCaninaPU");
     }

    public EntityManager getEmf() {
        return emf.createEntityManager();
    }

    
    
    


    
}
