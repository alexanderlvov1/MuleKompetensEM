package org.ordermgmt;

import java.util.Random;

import org.mule.DefaultMuleMessage;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.annotations.ContainsTransformerMethods;
import org.mule.api.annotations.Transformer;
import org.mule.processor.AbstractInterceptingMessageProcessor;

//@ContainsTransformerMethods 
public class Test22 extends AbstractInterceptingMessageProcessor{
	
	@Override
	public MuleEvent process(MuleEvent event) throws MuleException {
		/*MuleEvent resultEvent = processNext(event);
		DefaultMuleMessage msg = (DefaultMuleMessage) resultEvent.getMessage();
	
		msg.setUniqueId("11af1111-0b13-11e2-9173-03971acb7f1c");
		resultEvent.setMessage(msg);
		*/
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return event;
	}
}
