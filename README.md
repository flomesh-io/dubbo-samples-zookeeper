# Reference doc

This code base is used to demo functions list here: [flomesh.cn/msa/dubbo](http://flomesh.cn/msa/dubbo)

* Build:
~~~
mvn clean package
~~~

* Run Provider:
~~~
mvn exec:java -Dexec.mainClass=org.apache.dubbo.samples.ProviderBootstrap
~~~

* Run Consumer:
~~~
mvn exec:java -Dexec.mainClass=org.apache.dubbo.samples.ConsumerBootstrap
~~~
