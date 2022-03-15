package com.br.kafkamsk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@SpringBootApplication
public class KafkamskApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(KafkamskApplication.class, args);
    }

    @KafkaListener(id = "quickstart-app", topics = "quickstart")
    public void listen(String foo) {
        System.out.println(foo);
    }
}
