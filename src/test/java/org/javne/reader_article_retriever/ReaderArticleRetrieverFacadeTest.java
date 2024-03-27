package org.javne.reader_article_retriever;
import org.junit.jupiter.api.Test;


class ReaderArticleRetrieverFacadeTest {
    @Test
    public void f(){
        //given
        ReaderArticleRetrieverFacade facade = new ReaderArticleRetrieverFacade();
        //when
        ArticleDto articleDto = facade.retrieveById(1L);
        //then

    }
}