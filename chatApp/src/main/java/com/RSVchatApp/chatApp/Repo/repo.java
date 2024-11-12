package com.RSVchatApp.chatApp.Repo;


import org.apache.logging.log4j.message.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface repo extends MongoRepository<Message, String> {
    // You can add custom query methods if needed
}

