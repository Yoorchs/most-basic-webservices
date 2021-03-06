
package net.webservicex.es.biblia.libros;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BibleWebserviceSoap", targetNamespace = "http://www.webserviceX.NET")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BibleWebserviceSoap {


    /**
     * This web service list all versus by Book Title ,Chapter and Verse from the Kings James version Bible 
     * 
     * @param chapter
     * @param verse
     * @param bookTitle
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetBibleWordsByChapterAndVerse", action = "http://www.webserviceX.NET/GetBibleWordsByChapterAndVerse")
    @WebResult(name = "GetBibleWordsByChapterAndVerseResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetBibleWordsByChapterAndVerse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.es.biblia.libros.GetBibleWordsByChapterAndVerse")
    @ResponseWrapper(localName = "GetBibleWordsByChapterAndVerseResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.es.biblia.libros.GetBibleWordsByChapterAndVerseResponse")
    public String getBibleWordsByChapterAndVerse(
        @WebParam(name = "BookTitle", targetNamespace = "http://www.webserviceX.NET")
        String bookTitle,
        @WebParam(name = "chapter", targetNamespace = "http://www.webserviceX.NET")
        int chapter,
        @WebParam(name = "Verse", targetNamespace = "http://www.webserviceX.NET")
        int verse);

    /**
     * This web service list all versus by keyword from the Kings James version Bible 
     * 
     * @param bibleWords
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetBibleWordsbyKeyWord", action = "http://www.webserviceX.NET/GetBibleWordsbyKeyWord")
    @WebResult(name = "GetBibleWordsbyKeyWordResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetBibleWordsbyKeyWord", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.es.biblia.libros.GetBibleWordsbyKeyWord")
    @ResponseWrapper(localName = "GetBibleWordsbyKeyWordResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.es.biblia.libros.GetBibleWordsbyKeyWordResponse")
    public String getBibleWordsbyKeyWord(
        @WebParam(name = "BibleWords", targetNamespace = "http://www.webserviceX.NET")
        String bibleWords);

    /**
     * This web service list all books from the Kings James version Bible 
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetBookTitles", action = "http://www.webserviceX.NET/GetBookTitles")
    @WebResult(name = "GetBookTitlesResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetBookTitles", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.es.biblia.libros.GetBookTitles")
    @ResponseWrapper(localName = "GetBookTitlesResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.es.biblia.libros.GetBookTitlesResponse")
    public String getBookTitles();

    /**
     * This web service list all versus by Book Title and Chapter from the Kings James version Bible 
     * 
     * @param chapter
     * @param bookTitle
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetBibleWordsByBookTitleAndChapter", action = "http://www.webserviceX.NET/GetBibleWordsByBookTitleAndChapter")
    @WebResult(name = "GetBibleWordsByBookTitleAndChapterResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetBibleWordsByBookTitleAndChapter", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.es.biblia.libros.GetBibleWordsByBookTitleAndChapter")
    @ResponseWrapper(localName = "GetBibleWordsByBookTitleAndChapterResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.es.biblia.libros.GetBibleWordsByBookTitleAndChapterResponse")
    public String getBibleWordsByBookTitleAndChapter(
        @WebParam(name = "BookTitle", targetNamespace = "http://www.webserviceX.NET")
        String bookTitle,
        @WebParam(name = "chapter", targetNamespace = "http://www.webserviceX.NET")
        int chapter);

}
