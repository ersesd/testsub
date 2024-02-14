package com.sparta.travelnewsfeed.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommentResponseDto {
    private Long id;
    private String text;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}