package org.example.searchengine2;


import java.util.HashSet;
import java.util.Set;

public class Site {
    private  String url;
    private  final Set<String> keyWordsList = new HashSet<>();
    public Site(String url){
        this.url = url;
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

    public void setUrl(String url) {
        this.url = url;
    }
    public Set<String> getKeyWordsList(){
        return this.keyWordsList;
    }
}
