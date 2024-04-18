package net.javaguides.springboot.kafka;

import net.javaguides.springboot.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerJson {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerJson.class);

    @KafkaListener(topics = "javaguides_json", groupId = "myGroup")
    public void consumer(User data){
        LOGGER.info(String.format("message consumed %s -> ", data.toString()));

    }
}
