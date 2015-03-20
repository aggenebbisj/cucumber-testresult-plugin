
package org.jenkinsci.plugins.cucumber.jsontestsupport;

import java.io.Serializable;

public class EmbeddedItem implements Serializable {

    private final String data;

    public EmbeddedItem(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

}
