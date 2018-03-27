# JBMAR-219-reproducer

`mvn clean install`

- openjdk version "9.0.4" - PASSED
- openjdk version "1.8.0_161" - PASSED
- java version "1.8.0_111" - FAILURE
  - ```java
        java.lang.IllegalStateException: Constructor is unexpectedly inaccessible
	at org.jboss.marshalling.reflect.SerializableClass.invokeConstructorNoException(SerializableClass.java:377)
	at org.jboss.marshalling.reflect.SerializableClass.callNonInitConstructor(SerializableClass.java:332)
	at org.jboss.marshalling.cloner.SerializingCloner.clone(SerializingCloner.java:248)
	at org.jboss.marshalling.cloner.SerializingCloner.clone(SerializingCloner.java:130)
	at org.jboss.marshalling.cloner.SerializingCloner.cloneFields(SerializingCloner.java:391)
	at org.jboss.marshalling.cloner.SerializingCloner.initSerializableClone(SerializingCloner.java:311)
	at org.jboss.marshalling.cloner.SerializingCloner.initSerializableClone(SerializingCloner.java:279)
	at org.jboss.marshalling.cloner.SerializingCloner.clone(SerializingCloner.java:254)
	at org.jboss.marshalling.cloner.SerializingCloner.clone(SerializingCloner.java:174)
	at org.jboss.marshalling.cloner.SerializingCloner.clone(SerializingCloner.java:130)
	at org.jboss.marshalling.cloner.SerializingCloner.cloneFields(SerializingCloner.java:391)
	at org.jboss.marshalling.cloner.SerializingCloner.initSerializableClone(SerializingCloner.java:311)
	at org.jboss.marshalling.cloner.SerializingCloner.clone(SerializingCloner.java:254)
	at org.jboss.marshalling.cloner.SerializingCloner.clone(SerializingCloner.java:130)
	at org.xstefank.JBMAR219Test.testJBMAR219(JBMAR219Test.java:18)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:252)
	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:141)
	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:112)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)
	at org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)
	at org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)
```

