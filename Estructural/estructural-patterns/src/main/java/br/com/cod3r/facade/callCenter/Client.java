package br.com.cod3r.facade.callCenter;

import java.util.List;

import br.com.cod3r.facade.callCenter.facade.CallCenterFacade;
import br.com.cod3r.facade.callCenter.model.Card;
import br.com.cod3r.facade.callCenter.model.Register;
import br.com.cod3r.facade.callCenter.services.CardService;
import br.com.cod3r.facade.callCenter.services.PaymentService;
import br.com.cod3r.facade.callCenter.services.RegisterService;
import br.com.cod3r.facade.callCenter.services.ReportService;
import br.com.cod3r.facade.callCenter.services.SecurityService;

public class Client {

	public static void main(String[] args) {
		CallCenterFacade callCenter = new CallCenterFacade();
		
		Card card = callCenter.getCardByUser(123456L);
		System.out.println(card);

		callCenter.getSumary(card);

		callCenter.getPaymentInfoByCard(card);

		//Remove last register, block the card e order a new one
		callCenter.cancelLastRegister(card);

		Card newCard = callCenter.getCardByUser(123456L);
		System.out.println(newCard);
	}
}
