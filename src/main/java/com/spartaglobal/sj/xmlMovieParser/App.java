package com.spartaglobal.sj.xmlMovieParser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MoviesDTO moviesDto = new MoviesDTO("resources/movies.xml");
        XMLFileReader movies = new XMLFileReader("resources/movies.xml");
        System.out.println(movies.getParsedXMLFile().getElementsByTagName("record").item(0).getTextContent());
        System.out.println(moviesDto.totalRecords());
//        System.out.println(moviesDto.printAllMovieNames());
    }
}
