package com.company.services;

import com.company.models.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author Jeff Risberg
 * @since 12/05/17
 */
public class DefaultMessageService extends AbstractService implements MessageService {
    private static final Logger logger = LoggerFactory.getLogger(DefaultMessageService.class);

    public Message getOne(Long id) {
        try {
            EntityManager em = getEntityManager();

            em.getTransaction().begin();

            Message result = em.find(Message.class, id);

            em.getTransaction().commit();
            em.close();

            return result;
        } catch (NamingException e) {
            return null;
        }
    }

    public List<Message> getList(int limit, int offset) {
        try {
            EntityManager em = getEntityManager();

            em.getTransaction().begin();

            TypedQuery<Message> query =
                    em.createQuery("SELECT m FROM Message m", Message.class);
            List<Message> result = query.getResultList();

            em.getTransaction().commit();
            em.close();

            return result;
        } catch (NamingException e) {
            return null;
        }
    }

    @Override
    public Message create(String sender, String text) {
        try {
            EntityManager em = getEntityManager();

            em.getTransaction().begin();

            Message message = new Message();
            message.setSender(sender);
            message.setText(text);

            em.persist(message);

            em.getTransaction().commit();
            em.close();

            System.out.println(message);
        } catch (NamingException e) {
        }
        return null;
    }
}
