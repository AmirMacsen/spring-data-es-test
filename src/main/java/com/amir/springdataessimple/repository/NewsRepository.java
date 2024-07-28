package com.amir.springdataessimple.repository;

import com.amir.springdataessimple.domain.News;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface NewsRepository extends ElasticsearchRepository<News, Integer> {
}
