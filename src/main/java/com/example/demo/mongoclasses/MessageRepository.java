package com.example.demo.mongoclasses;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String>{
    // Inbox
    List<Message> findByReceiverEmailOrderByTimestampDesc(String receiverEmail);

    // Conversation between two users
    List<Message> findBySenderEmailAndReceiverEmailOrReceiverEmailAndSenderEmailOrderByTimestampAsc(
        String sender1, String receiver1,
        String sender2, String receiver2
    );
}