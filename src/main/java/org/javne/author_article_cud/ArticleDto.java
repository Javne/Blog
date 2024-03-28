package org.javne.author_article_cud;

import lombok.Builder;

@Builder
public record ArticleDto(
        Long id,
        String header,
        String content,
        String category
) {
}
