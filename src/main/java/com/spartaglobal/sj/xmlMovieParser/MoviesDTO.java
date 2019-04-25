package com.spartaglobal.sj.xmlMovieParser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MoviesDTO {
    private Document moviesList;

    public MoviesDTO(String XMLMoviesDataFilePath) {
        XMLFileReader xmlFileReader = new XMLFileReader(XMLMoviesDataFilePath);
        moviesList = xmlFileReader.getParsedXMLFile();
    }

    private NodeList getAllRecords(){
        return moviesList.getElementsByTagName("record");
    }

    public int totalRecords(){
        return getAllRecords().getLength();
    }

    public Element getElement(){
        int movieLength = totalRecords();
        NodeList movieRecords = getAllRecords();
        Element el = null;

        for(int i=0; i<movieLength; i++){
            Node node = movieRecords.item(i);
            el = (Element) node;
            System.out.println(el.getElementsByTagName("movie_name").item(0).getTextContent());
        }

        return el;
    }

    public void printAllMovieNames(){
        int movieLength = totalRecords();
        NodeList movieRecords = getAllRecords();

        for(int i=0; i<movieLength; i++){
            Node node = movieRecords.item(i);
            Element el = (Element) node;
            System.out.println(el.getElementsByTagName("movie_name").item(0).getTextContent());
        }
    }
}