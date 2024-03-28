package org.javne.author_article_cud;

public record ArticleCreateDto(
        String header,
        String content,
        String category
) {
}
