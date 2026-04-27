package com.example.demo.mongoclasses;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Messages")
public class Message {
    
    @Id
    private String ID;

    private String senderEmail;
    private String receiverEmail;
    private String content;
    private long timestamp;
    private boolean read;

    // Getters
    public String getID() {
        return ID;
    }

    public String getSenderEmail(){
        return senderEmail;
    }

    public String getReceiverEmail(){
        return receiverEmail;
    }

    public String getContent() {
        return content;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public boolean getRead() {
        return read;
    }
    
    // Setters

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}  
