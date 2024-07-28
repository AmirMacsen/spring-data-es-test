package com.amir.springdataessimple.domain;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.elasticsearch.annotations.CompletionField;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.core.suggest.Completion;

import java.io.Serializable;

@Document(indexName = "news")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class News implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Field
    private String id;
    @Field
    private String title;
    @Field
    private String url;
    @Field
    private String content;
    @CompletionField
    @Transient // not save in db, 表明不需要序列化
    private Completion tags;
}
