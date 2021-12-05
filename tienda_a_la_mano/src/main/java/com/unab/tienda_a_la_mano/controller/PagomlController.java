package com.unab.tienda_a_la_mano.controller;


import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercadopago.MercadoPago;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.Preference;
import com.mercadopago.resources.datastructures.preference.BackUrls;
import com.mercadopago.resources.datastructures.preference.Item;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/pagoml")
public class PagomlController {

	@GetMapping("/crear")
	public String crear() throws MPException {
		//MercadoPago.SDK.setAccessToken("TEST-4977301227552893-120321-305b468b58c465aeaf71683ea9f0460f-24092619");
		MercadoPago.SDK.setAccessToken("APP_USR-4977301227552893-120321-7fe4e17eb7326410bc0fe09eabe05f1e-24092619");
		Preference preferencia = new Preference();

		preferencia.setBackUrls(
				new BackUrls().setFailure("http://localhost:8080/failure")
				.setPending("http://localhost:8080/pending")
				.setSuccess("http://localhost:8080/success")
				);

		Item item = new Item();
		item.setTitle("PAGO DEL MERCADO")
		.setQuantity(1)
		.setUnitPrice((float) 7500);
		preferencia.appendItem(item);

		var result = preferencia.save();

		System.out.println(result.getSandboxInitPoint());



		return "redirect:"+result.getSandboxInitPoint() ;
	}

}
