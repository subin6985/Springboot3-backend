package me.parksubin.springbootdeveloper.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.parksubin.springbootdeveloper.domain.Article;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ArticleViewResponse {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private String author;

    public ArticleViewResponse(Article article) {
        id = article.getId();
        title = article.getTitle();
        content = article.getContent();
        createdAt = article.getCreatedAt();
        author = article.getAuthor();
    }
}
