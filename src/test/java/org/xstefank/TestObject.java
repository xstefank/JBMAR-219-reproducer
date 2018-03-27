package org.xstefank;

import javax.ejb.Stateless;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Stateless
public class TestObject implements Serializable {

    private List<String> strings = Collections.unmodifiableList(new ArrayList<>());
}
