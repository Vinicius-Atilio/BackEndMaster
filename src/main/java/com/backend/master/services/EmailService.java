package com.backend.master.services;

import org.springframework.mail.SimpleMailMessage;

import com.backend.master.domain.Cliente;
import com.backend.master.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
