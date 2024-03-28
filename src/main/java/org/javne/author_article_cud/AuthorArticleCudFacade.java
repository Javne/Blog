package org.javne.author_article_cud;

import org.javne.reader_article_retriever.ReaderArticleRetrieverFacade;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AuthorArticleCudFacade {

    Map<Long, Article> db = new HashMap<>();
    Long id = 0L;

    public void saveArticle(ArticleCreateDto dto) {
        Article article = new Article(
                id++,
                dto.header(),
                dto.category(),
                dto.content()
        );
        db.put(article.id(), article);
    }


    //autor dodaje wpis
    public Set<ArticleDto> findAllArticles() {
        Set<ArticleDto> collect = db.values().stream()
                .map(article ->
                        new ArticleDto(
                                article.id(),
                                article.header(),
                                article.category(),
                                article.content()
                        ))
                .collect(Collectors.toSet());
        return new HashSet<>(collect);


    }


}
