package net.javaguides.springboot.controller;


import net.javaguides.springboot.kafka.KafkaProducerJson;
import net.javaguides.springboot.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/kafka/json")
public class JsonMessageController {

    private KafkaProducerJson kafkaProducerJson;

    public JsonMessageController(KafkaProducerJson kafkaProducerJson) {
        this.kafkaProducerJson = kafkaProducerJson;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User data){

        kafkaProducerJson.sendmessage(data);
        return ResponseEntity.ok("Json message sent");

    }
}
