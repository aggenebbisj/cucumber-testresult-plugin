
package org.jenkinsci.plugins.cucumber.jsontestsupport;

public class EmbeddedItem {

    private final String data;

    public EmbeddedItem(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

}
