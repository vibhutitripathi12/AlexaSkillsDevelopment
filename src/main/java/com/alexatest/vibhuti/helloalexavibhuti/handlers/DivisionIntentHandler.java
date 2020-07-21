package com.alexatest.vibhuti.helloalexavibhuti.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Map;
import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.Slot;

public class DivisionIntentHandler implements RequestHandler{

	public boolean canHandle(HandlerInput input) {
		 return input.matches(intentName("DivisionIntent"));
	}

	public Optional<Response> handle(HandlerInput input) {
		IntentRequest intreq = (IntentRequest) input.getRequestEnvelope().getRequest(); 
		Map<String, Slot> slots  = intreq.getIntent().getSlots();
		String number1  = slots.get("firstnumber").getValue();
		String number2  = slots.get("secondnumber").getValue();
		
		return input.getResponseBuilder()
                .withSpeech("The result is" + (Integer.parseInt(number1) / Integer.parseInt(number2)))
                .withSimpleCard("HelloCalculator", slots.toString())
                .build();
	
		
	}

}

