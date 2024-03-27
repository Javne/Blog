package org.javne.reader_article_retriever;

public class ReaderArticleRetrieverFacade {

    public ArticleDto retrieveById(Long id){
        return ArticleDto.builder()
                .id(1L)
                .header("Jak zostać programistą")
                .content("5 Kroków do sukcesu")
                .category("IT")
                .build();


    }
}
