package com.incra.services;

import com.incra.models.Incident;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jeff Risberg
 * @since 11/20/17
 */
public class DefaultIncidentService extends AbstractService implements IncidentService {
  private static final Logger logger = LoggerFactory.getLogger(DefaultIncidentService.class);

  public Incident getOne(Long id) {
    logger.debug("getOne");

    try {
      EntityManager em = getEntityManager();

      em.getTransaction().begin();

      Incident result = em.find(Incident.class, id);

      em.getTransaction().commit();
      em.close();

      return result;
    } catch (NamingException e) {
      return null;
    }
  }

  public List<Incident> getList(int limit, int offset) {
    logger.debug("getList");

    try {
      EntityManager em = getEntityManager();

      em.getTransaction().begin();

      TypedQuery<Incident> query =
          em.createQuery("SELECT i FROM Incident i", Incident.class);
      List<Incident> result = query.getResultList();

      em.getTransaction().commit();
      em.close();

          /*
        List<Incident> result = new ArrayList<Incident>();
        Incident incident;

        incident = new Incident(2L, "Account update required",
            "Click on Update link, follow instructions", "Medium");
        result.add(incident);

        incident = new Incident(3L, "No response within timeout interval",
            "Check the network wiring, check for firewall configuration", "Medium");
        result.add(incident);

        incident = new Incident(4L, "Unable to install new application",
            "Check your password for the Apple App Store", "Medium");
        result.add(incident);
        */

      return result;
    } catch (NamingException e) {
      return null;
    }
  }

  public long getCount() throws NamingException {
    logger.debug("getCount");

    EntityManager em = getEntityManager();

    em.getTransaction().begin();

    List<Incident> result = em.createQuery("SELECT is FROM Incident is").getResultList();

    em.getTransaction().commit();
    em.close();

    return result.size();
  }

  public void create(Incident invocationStatus) throws NamingException {
    logger.debug("create");

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
