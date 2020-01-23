//package com.coviam.search.config;
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//
//import java.util.HashMap;
//import java.util.Map;
//
//
//@EnableKafka
//@Configuration
//public class KafkaConfiguration
//{
//    @Bean
//    public ConsumerFactory<String,String> consumerFactory()
//    {
//        Map<String, Object> config = new HashMap<>();
//        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092");
//        config.put(ConsumerConfig.GROUP_ID_CONFIG,"group_id");
//        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
//        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
//        return new DefaultKafkaConsumerFactory<>(config);
//    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory kafkaListenerContainerFactory()
//    {
//        ConcurrentKafkaListenerContainerFactory factory = new ConcurrentKafkaListenerContainerFactory();
//        factory.setConsumerFactory(consumerFactory());
//        return factory;
//    }
//
//}
//
//
//
//
//
////package com.coviam.search.config;
////
////import com.coviam.search.dto.SearchDto;
////import org.apache.kafka.clients.consumer.ConsumerConfig;
////import org.apache.kafka.common.serialization.StringDeserializer;
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
////import org.springframework.kafka.annotation.EnableKafka;
////import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
////import org.springframework.kafka.core.*;
////import org.springframework.kafka.support.serializer.JsonDeserializer;
////import java.util.HashMap;
////import java.util.Map;
////@EnableKafka
////@Configuration
////public class KafkaConfiguration {
////
////    @Bean
////    public ConsumerFactory<String, SearchDto> userConsumerFactory() {
////        Map<String, Object> config = new HashMap<>();
////        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
////        config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
////        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
////        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
////        return new DefaultKafkaConsumerFactory<String, SearchDto>(config, new StringDeserializer(),
////                new JsonDeserializer<>(SearchDto.class));
////
////    }
////
////    @Bean
////    public ConcurrentKafkaListenerContainerFactory kafkaListenerContainerFactory()
////    {
////        ConcurrentKafkaListenerContainerFactory factory = new ConcurrentKafkaListenerContainerFactory();
////        factory.setConsumerFactory(userConsumerFactory());
////        return factory;
////    }
////
////}
////
