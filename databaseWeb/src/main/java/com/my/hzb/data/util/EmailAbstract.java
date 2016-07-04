package com.my.hzb.data.util;

import java.util.List;

import javax.mail.MessagingException;  
import org.springframework.mail.javamail.JavaMailSender;  
import org.springframework.ui.freemarker.*;     
import org.springframework.web.servlet.view.freemarker.*;     
  
public abstract class EmailAbstract {
	protected String from;  
    protected String subject;  
    protected JavaMailSender sender;  
    protected FreeMarkerConfigurer freeMarkerConfigurer=null; //FreeMarker的技术类     
       
    public String getFrom() {  
        return from;  
    }  
  
    public void setFrom(String from) {  
        this.from = from;  
    }  
  
    public String getSubject() {  
        return subject;  
    }  
  
    public void setSubject(String subject) {  
        this.subject = subject;  
    }  
  
    public JavaMailSender getSender() {  
        return sender;  
    }  
  
    public void setSender(JavaMailSender sender) {  
        this.sender = sender;  
    }  
      
	  public void setFreeMarkerConfigurer(FreeMarkerConfigurer freeMarkerConfigurer) {     
	      this.freeMarkerConfigurer = freeMarkerConfigurer;     
	  }  
    /** 
     * 发送单个html格式邮件 
     */  
    public abstract void sendEmail(String content,String address);  
    /** 
     * 批量发送html格式邮件 
     */  
    public abstract void sendBatchEmail(String content,List<String> address);
}
