### Setting Up Glassfish 5.1 Server in Eclipse

1. Open Eclipse JavaEE IDE and please refer [here](https://download.eclipse.org/glassfish-tools/1.0.1/repository/) to install Glassfish Tools into Eclipse IDE
2. Restart the Eclipse IDE
3. Download and extract [Glassfish v5.1.0](https://www.eclipse.org/downloads/download.php?file=/glassfish/glassfish-5.1.0.zip)
4. Click on `Create a new server...` in servers tab

![Adding New Glasshfish Server in Eclipse](https://github.com/rasika/jee-demo/raw/master/docs/images/add-new-server.png)

5. Upon Next on the Window, provide glassfish extracted directory path and JDK1.8 path as below;

![Adding New Glasshfish Server in Eclipse](https://github.com/rasika/jee-demo/raw/master/docs/images/new-glassfish-server2.png)

6. Then You can proceed Next and since we are setting up our deployable artifacts later, just click on Finish.

#### Setting Up Glassfish Server Debug
There's a known issue in Glassfish Eclipse Plugin. You need to add following JVM arguments in `Run -> Debug Configurations`
![debug-args](https://user-images.githubusercontent.com/1448489/128669907-b1544401-15e2-437f-9427-a04f51b1cbac.png)

