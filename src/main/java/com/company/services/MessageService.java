package com.company.services;

import com.company.models.Message;

import java.util.List;

/**
 * @author Jeff Risberg
 * @since 11/20/17
 */
public interface MessageService {

    public Message getOne(Long id);

    public List<Message> getList(int limit, int offset);
}
