package org.xstefank;

import org.jboss.marshalling.cloner.ClonerConfiguration;
import org.jboss.marshalling.cloner.ObjectCloner;
import org.jboss.marshalling.cloner.ObjectClonerFactory;
import org.jboss.marshalling.cloner.ObjectCloners;
import org.junit.Test;

public class JBMAR219Test {

    @Test
    public void testJBMAR219() throws Exception {
        final ObjectClonerFactory clonerFactory = ObjectCloners.getSerializingObjectClonerFactory();

        final ClonerConfiguration configuration = new ClonerConfiguration();

        ObjectCloner cloner = clonerFactory.createCloner(configuration);
        cloner.clone(new TestObject());

    }

}
