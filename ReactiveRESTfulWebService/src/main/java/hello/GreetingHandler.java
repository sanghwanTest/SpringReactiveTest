package hello;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;


import reactor.core.publisher.Mono;

@Component
public class GreetingHandler {

	public Mono<ServerResponse> hello(ServerRequest request){
		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
				.body(BodyInserters.fromObject("Hello, Spring! App01!"));
	}
	
	public Mono<ServerResponse> keys(ServerRequest request){
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON_UTF8)
				.body(BodyInserters.fromObject("{'resultCode': 'true','data' : {'keyName': 'SKT_APP_KEY','appKey' : 'fd986e75-1ef6-4d55-a356-8ca2fea3e156'}}"));
	}
	
	public Mono<ServerResponse> callme(ServerRequest request){
		System.out.println("callme");
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON_UTF8)
				.body(BodyInserters.fromObject("Listen Port 18080"));
	}
	
}
