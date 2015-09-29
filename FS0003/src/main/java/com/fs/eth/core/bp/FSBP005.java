package com.fs.eth.core.bp;

import org.ethereum.facade.Ethereum;
import org.ethereum.facade.EthereumFactory;
//import org.ethereum.listener.EthereumListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.fsco.eth.bp.core.EthereumBean;
//import com.fsco.eth.bp.core.FsBp001;

public class FSBP005 {




	//@SuppressWarnings("unused")
	//@SpringBootApplication(exclude = SpringDataWebAutoConfiguration.class)

		public static void main(String[] args) {


			//ApplicationContext context = 
	/*		ClassPathXmlApplicationContext context = 
					new ClassPathXmlApplicationContext("SpringConfig.xml");
			FsBp001 myBusinessPartner = (FsBp001) context.getBean("FsBp001");
*/

			//<property name="message" value="Hello World!"/>

			//EthereumBean myEthereumBean = new EthereumBean();
			

			FsBp001 myBusinessPartner = new FsBp001();
			myBusinessPartner.myMessage();
			
			
//			EthereumBean myEthereum = new EthereumBean();
//			myEthereum.start();

	        Ethereum myEthereum = EthereumFactory.createEthereum();
	        myEthereum.addListener(new EthereumListener( myEthereum ));
			
//			context.close();
			//context.close();
			
		}

	}
	

