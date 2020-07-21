package com.alexatest.vibhuti.helloalexavibhuti.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class AdditionIntentHandler implements RequestHandler{

	public boolean canHandle(HandlerInput input) {
		 return input.matches(intentName("CalculatorIntent"));
	}

	public Optional<Response> handle(HandlerInput input) {
		// TODO Auto-generated method stub
		return null;
	}

}
