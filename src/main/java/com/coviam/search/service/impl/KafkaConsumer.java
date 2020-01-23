//package com.coviam.search.service.impl;
//
//
//import com.coviam.search.document.SearchDocument;
//import com.coviam.search.dto.SearchDto;
//import com.coviam.search.repository.SearchRepository;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class KafkaConsumer
//{
//    @Autowired
//    SearchRepository searchRepository;
//
//    @KafkaListener(topics = "kafkaAdd")
//    public void consume(String  merchantData) throws JsonProcessingException {
//
//        ObjectMapper objectMapper = new ObjectMapper();
//
//
//        SearchDto searchDto = objectMapper.readValue(merchantData,SearchDocument.class);
//        searchDocument.save(searchDto);
//
//
//            EmployeePostgres employee1 = objectMapper.readValue(employee, EmployeePostgres.class);
//            employeePostgresRepository.save(employee1);
//
//
//
//
//
//
//
//
//    }
//}
