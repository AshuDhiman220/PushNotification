package com.linewebhook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class PushNotificationController {

	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping("/send-notification")
	public ResponseEntity<Status> notify(@RequestBody PushNotificationRequest notificationRequest){
		
		HttpHeaders headers=new HttpHeaders();
		headers.add("Authorization","key=AIzaSyDIH-CqbrzZlkTW3ynPkrKB5e34TkfJOz0");
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<Object> entity=new HttpEntity<Object>(notificationRequest, headers);
		
				ResponseEntity<NotificationResponse> resObject = restTemplate.exchange("https://fcm.googleapis.com/fcm/send",
						HttpMethod.POST, entity, NotificationResponse.class);
		
				if(resObject.getBody().getSuccess()>=1)
					return new ResponseEntity<Status>(new Status(200, "Success"), HttpStatus.OK);
				else 
					return new ResponseEntity<Status>(new Status(400, "Failure"), HttpStatus.BAD_REQUEST);
		
	}
	
}
