package com.incra.services;

import com.incra.Main;
import com.incra.models.Incident;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.NamingException;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jeff Risberg
 * @since 11/20/17
 */
public class DefaultIncidentService extends AbstractService implements IncidentService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultIncidentService.class);

    public List<Incident> getAll() {
        List<Incident> results = new ArrayList<Incident>();
        Incident incident;

        incident = new Incident(2L, "Account update required",
            "Click on Update link, follow instructions", "Medium");
        results.add(incident);

        incident = new Incident(3L, "No response within timeout interval",
            "Check the network wiring, check for firewall configuration", "Medium");
        results.add(incident);

        incident = new Incident(4L, "Unable to install new application",
            "Check your password for the Apple App Store", "Medium");
        results.add(incident);

        return results;
    }

    public Incident getOne(int id) throws NamingException {
        LOGGER.debug("getOne");

        EntityManager em = getEntityManager();

        em.getTransaction().begin();

        Incident result = em.find(Incident.class, id);

        em.getTransaction().commit();
        em.close();

        return result;
    }

    public List<Incident> getList(int limit, int offset) throws NamingException {
        LOGGER.debug("getList");

        EntityManager em = getEntityManager();

        em.getTransaction().begin();

        List<Incident> result = em.createQuery("SELECT is FROM Incident is").getResultList();

        em.getTransaction().commit();
        em.close();

        return result;
    }

    public long getCount() throws NamingException {
        LOGGER.debug("getCount");

        EntityManager em = getEntityManager();

        em.getTransaction().begin();

        List<Incident> result = em.createQuery("SELECT is FROM Incident is").getResultList();

        em.getTransaction().commit();
        em.close();

        return result.size();
    }

    public void create(Incident invocationStatus) throws NamingException {
        LOGGER.debug("create");

        EntityManager em = getEntityManager();

        em.getTransaction().begin();

        em.persist(invocationStatus);

        em.getTransaction().commit();
        em.close();
    }

    public void update(Incident invocationStatus) throws NamingException {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();

        em.persist(invocationStatus);

        em.getTransaction().commit();
        em.close();
    }
}
