package com.alexatest.vibhuti.helloalexavibhuti.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class JurassicParkIntentHandler implements RequestHandler{

	public boolean canHandle(HandlerInput input) {
		 return input.matches(intentName("JurassicParkIntent"));
	}

	public Optional<Response> handle(HandlerInput input) {
		String ans = "The Jurrasic Park movie was released in 1973";
		 return input.getResponseBuilder()
	                .withSpeech(ans)
	                .withSimpleCard("Information", ans)
	                .build();
	}
}
