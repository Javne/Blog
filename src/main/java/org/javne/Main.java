package org.javne;

import org.javne.author_article_cud.ArticleCreateDto;
import org.javne.author_article_cud.ArticleDto;
import org.javne.author_article_cud.AuthorArticleCudFacade;
import org.javne.reader_article_retriever.ReaderArticleRetrieverFacade;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        AuthorArticleCudFacade authorArticleCudFacade = new AuthorArticleCudFacade();
        System.out.println("1. Zapisywanie artykułu przez admina");
        authorArticleCudFacade.saveArticle(new ArticleCreateDto(
                "header 1",
                "content1",
                "IT"
        ));
        authorArticleCudFacade.saveArticle(new ArticleCreateDto(
                "header 2",
                "content2",
                "IT2"
        ));
        System.out.println("2. Artykuł zapisany");
        // autor dodaje wpis
        Set<ArticleDto> allArticles = authorArticleCudFacade.findAllArticles();
        System.out.println("3. Wszystkie spisy wyswietlone przez admina");

        allArticles.forEach(System.out::println);


        // czytelnik wyswietla wpis o id 1
        System.out.println("4. Czytelnik wyswietla wpis o id 0");
        ReaderArticleRetrieverFacade readerArticleRetrieverFacade = new ReaderArticleRetrieverFacade(
                authorArticleCudFacade
        );
        org.javne.reader_article_retriever.ArticleDto articleDto = readerArticleRetrieverFacade.retrieveById(0L);
        System.out.println(articleDto);
    }
}
