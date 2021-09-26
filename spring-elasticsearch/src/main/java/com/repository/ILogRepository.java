package com.repository;

import com.entity.LogEntitiy;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILogRepository extends ElasticsearchRepository<LogEntitiy,String> {

    @Query("{\"bool\": {\"must\": [{\"match\": {\"serviceName\": \"?0\"}}]}}")
    List<LogEntitiy> getByCustomQuery(String search);


}
