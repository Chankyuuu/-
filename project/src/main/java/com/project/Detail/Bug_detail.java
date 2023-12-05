package com.project.Detail;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Bug_detail {
    @Id
    private Integer id;

    @Column(length = 200)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String detail;

    @Column(columnDefinition = "TEXT")
    private String howtokill;
    
    @Column(length = 400)
    private String img_url_0;

    @Column(length = 400)
    private String img_url_1;
    
    @Column(length = 400)
    private String img_url_2;
}
