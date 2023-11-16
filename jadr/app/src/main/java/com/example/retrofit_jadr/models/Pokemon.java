// Pokemon.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

package com.example.retrofit_jadr.models;
import java.util.List;

public class Pokemon {
    private String next;
    private long count;
    private List<Result> results;

    public String getNext() { return next; }
    public void setNext(String value) { this.next = value; }

    public long getCount() { return count; }
    public void setCount(long value) { this.count = value; }

    public List<Result> getResults() { return results; }
    public void setResults(List<Result> value) { this.results = value; }

    public class Result {
        private String name;
        private String url;

        public String getName() { return name; }
        public void setName(String value) { this.name = value; }

        public String geturl() { return url; }
        public void seturl(String value) { this.url = value; }
    }
}

// Result.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation


