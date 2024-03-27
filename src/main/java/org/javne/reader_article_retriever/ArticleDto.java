package org.javne.reader_article_retriever;

import lombok.Builder;

@Builder
public record ArticleDto(Long id,
                         String header,
                         String content,
                         String category)
{

}
