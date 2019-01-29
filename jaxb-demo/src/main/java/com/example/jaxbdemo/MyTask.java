package com.example.jaxbdemo;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.jaxbdemo.entity.Trade;

@Component
public class MyTask {

	
	@Scheduled(fixedRate = 10000)
	public void parseXML() {
	    
		System.out.println("Parsing started");
		String xmlStr= "<trade><trade_id>123456</trade_id><trade_date>27111992</trade_date><trade_name>HDFC Pro</trade_name><first_key>HDFC3455</first_key><trade_order_no>75757609A</trade_order_no>"+
				"<trade_amount>999999</trade_amount><department><id>101</id><name>IT</name></department></trade>";
		
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Trade.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(xmlStr);
			Trade trade = (Trade) unmarshaller.unmarshal(reader);
			System.out.println(trade.getTrade_name()+" --> "+trade.getTrade_amount());
		} catch (JAXBException e) {
			System.out.println("Exception occured : "+e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}
