# JEE Demos
This repo includes JEE demos for Servlets, JSPs, JSFs, JAX-RS and EJBs.

## Recommendations and Dev Choices
* **IDE:** Eclipse IDE for JEE is recommended
* **JDK:** Open JDK 1.8 (not JRE) to use JavaEE/JakartaEE 8 recommended
* **JEE Server:** Glassfish v5.1 supporting JavaEE/JakartaEE 8 recommended

## Setting Up Development Environment

1. Make sure you downloaded `Eclipse IDE for JEE Development` from [here](https://www.eclipse.org/downloads/packages/release/2021-06/r/eclipse-ide-enterprise-java-and-web-developers)
2. Please refer [here](https://github.com/rasika/jee-demo/blob/master/docs/SettingUpEclipseIDEViews.md) to setup Eclipse IDE
3. Please refer [here](https://github.com/rasika/jee-demo/blob/master/docs/SettingUpGlassFish.md) to setup a new `GlassFish Server` instance in Eclipse IDE
4. Download and install `OpenJDK 1.8` (if not available) from [here](https://openjdk.java.net/install/)

## Building the Source Code
Each `demo1,...demo5` folders are considered separate JEE projects for the IDE. 
### Running Gradle Tasks through Terminal
You can simply navigate into the demoN folder and execute the following;

For Linux / MacOSX;

```
cd demo1
./gradlew clean build
```

For Windows;

```
cd demo1
./gradlew.bat clean build
```

### Running Gradle Tasks from Eclipse IDE
1. From the menu click on `Window -> Show View -> Other`. From the window, search for 'Gradle', select both Tasks and Executions then click open. 
2. Resulting Window can be dragged into any place wherever fits for you.
3. Goto `Window -> Preferences`; Select Gradle and enter JDK1.8 path into your Gradle `Java Home` path.
4. Then from the tree hierarchy; select correct project(eg. demo1), expand `build` item, 
   - Click on `clean` to run cleaning task, 
   - Click on `build` to run build task
5. NOTE: Whenever you are doing changes to the gradle file; make sure to right-click on the project and `Gradle -> Refresh Gradle Project`

![Gradle Task](https://github.com/rasika/jee-demo/raw/master/docs/images/gradle-task.png)

## Deploy and Run JEE Application in Glassfish Server
These steps assume that you have already configured server instance in Eclipse IDE as explained [here](https://github.com/rasika/jee-demo/blob/master/docs/SettingUpGlassFish.md).

1. Right Click on `Server` instance we created. Then select `Add and Remove...`. 

![Servers Tab](https://github.com/rasika/jee-demo/raw/master/docs/images/servers-tab.png)

2. From the window; for example if you want to add `demo1` into JEE server; select `demo1` first and click `Add` button this will results `demo1` appear in the list of right side.

![Add Artifacts](https://github.com/rasika/jee-demo/raw/master/docs/images/add-artifacts.png)

3. Start the server by right click and selecting `Start`.

![Run Server](https://github.com/rasika/jee-demo/raw/master/docs/images/run-server.png)

4. Whenever doing changes, you can execute `clean build` gradle tasks(if required) then right click on the server and click `Publish` to publish the changes.
