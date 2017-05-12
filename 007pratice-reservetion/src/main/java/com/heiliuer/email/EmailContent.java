package com.heiliuer.email;

import java.util.List;

/**
 * Created by Heiliuer on 2016/11/10.
 */
public class EmailContent {

    private String subject;
    private String content;
    private List<String> recipients;

    public EmailContent(String subject, String content, List<String> recipients) {
        this.subject = subject;
        this.content = content;
        this.recipients = recipients;
    }

    public EmailContent() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }
}
