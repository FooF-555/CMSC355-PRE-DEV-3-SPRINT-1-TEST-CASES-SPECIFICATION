package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.mongoclasses.Message;
import com.example.demo.mongoclasses.MessageRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class MessageController {

    MessageRepository messageRepo;

    public MessageController(MessageRepository messageRepo) {
        this.messageRepo = messageRepo;
    }

    // 📥 Inbox
    @GetMapping("/patientInbox")
    public String patientInbox(Model model, HttpSession session) {

        String email = (String) session.getAttribute("loggedInUser");

        List<Message> messages = messageRepo
                .findByReceiverEmailOrderByTimestampDesc(email);

        model.addAttribute("messages", messages);
        return "patientInbox";
    }

    @GetMapping("/physicianInbox")
    public String physicianInbox(Model model, HttpSession session) {

        String email = (String) session.getAttribute("loggedInUser");

        List<Message> messages = messageRepo
                .findByReceiverEmailOrderByTimestampDesc(email);

        model.addAttribute("messages", messages);
        return "physicianInbox";
    }


    @GetMapping("/messagePage")
    public String messagePage(@RequestParam(required = false) String otherUser,
                            Model model,
                            HttpSession session) {

        String currentUser = (String) session.getAttribute("loggedInUser");

        if (otherUser != null) {
            List<Message> convo = messageRepo
                .findBySenderEmailAndReceiverEmailOrReceiverEmailAndSenderEmailOrderByTimestampAsc(
                    currentUser, otherUser,
                    currentUser, otherUser
                );

            model.addAttribute("messages", convo);
        }

        model.addAttribute("otherUser", otherUser);
        return "messagePage";
    }

    // ✉️ Send message
    @PostMapping("/sendMessage")
    public String sendMessage(@RequestParam String receiver, @RequestParam String content, HttpSession session) {

        String sender = (String) session.getAttribute("loggedInUser");

        Message msg = new Message();
        msg.setSenderEmail(sender);
        msg.setReceiverEmail(receiver);
        msg.setContent(content);
        msg.setTimestamp(System.currentTimeMillis());
        msg.setRead(false);

        messageRepo.save(msg);

        return "redirect:/patientDashboard";
    }
}
