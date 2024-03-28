package org.javne.reader_article_retriever;

import org.javne.author_article_cud.AuthorArticleCudFacade;

import java.util.Set;

public class ReaderArticleRetrieverFacade {

    //todo prepare communication with authorarticlecloud module;
    AuthorArticleCudFacade authorArticleCudFacade;

    public ReaderArticleRetrieverFacade(AuthorArticleCudFacade authorArticleCudFacade) {
        this.authorArticleCudFacade = authorArticleCudFacade;
    }

    public ArticleDto retrieveById(Long id){
        org.javne.author_article_cud.ArticleDto foundArticle = authorArticleCudFacade.findAllArticles().stream()
                .filter(articleDto -> articleDto.id().equals(id))
                .findFirst().orElseThrow(() -> new RuntimeException("not found error"));

        return ArticleDto.builder()
                .id(foundArticle.id())
                .header(foundArticle.header())
                .build();
    }
}
