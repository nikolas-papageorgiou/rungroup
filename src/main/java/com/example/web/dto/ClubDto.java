package com.example.web.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Builder
public class ClubDto {

    private Integer id;
    private String title;
    private String photoUrl;
    private String content;

    private LocalDateTime createdOn;

    private LocalDateTime updatedOn;
}
