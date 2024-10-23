package org.example.searchengine2;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Site {
    private  String url;
    private  final Set<String> keyWordsList = new HashSet<>();
    public Site(String url, String keyword){
        this.url = url;
        addKeyWord(keyword);
    }
    public Site(String url){
        this.url = url;
    }

    public Site() {
    }

    public boolean addKeyWord(String keyWord){
        if (keyWordsList.add(keyWord))return true;
        return false;
    }
    public boolean removeKeyWord(String keyWord){
        if(keyWordsList.remove(keyWord)) return true;
        return false;
    }
    public boolean findKeyWord(String keyWord){
        for(String k: keyWordsList) if (k.equals(keyWord)) return true;
        return false;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Site site = (Site) o;
//        return Objects.equals(url, site.url) && Objects.equals(keyWordsList, site.keyWordsList);
        return Objects.equals(url, site.url);
    }

    @Override
    public int hashCode() {
//        return Objects.hash(url, keyWordsList);
        return Objects.hash(url);

    }

}
