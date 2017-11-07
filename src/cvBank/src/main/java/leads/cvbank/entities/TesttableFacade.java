/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leads.cvbank.entities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mahedee
 */
@Stateless
public class TesttableFacade extends AbstractFacade<Testtable> {

    @PersistenceContext(unitName = "leads_cvBank_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TesttableFacade() {
        super(Testtable.class);
    }
    
}
