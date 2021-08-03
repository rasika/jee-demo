# JEE Demos
This repo includes JEE demos for Servlets, JSPs, JSFs, JAX-RS and EJBs.

## Recommendations and Dev Choices
1. **IDE:** Eclipse IDE for JEE is recommended
2. **JDK:** Open JDK 1.8 (not JRE) to use JavaEE/JakartaEE 8 recommended
3. **JEE Server:** Glassfish v5.1 supporting JavaEE/JakartaEE 8 recommended

## Setting Up Development Environment

1. Make sure you downloaded Eclipse IDE for JEE Development [here](https://www.eclipse.org/downloads/packages/release/2021-06/r/eclipse-ide-enterprise-java-and-web-developers)
2. Please refer [here](https://github.com/rasika/jee-demo/blob/master/docs/SettingUpEclipseIDEViews.md) to setup Eclipse IDE
3. Please refer [here](https://github.com/rasika/jee-demo/blob/master/docs/SettingUpGlassFish.md) to setup a new GlassFish server instance in Eclipse IDE
4. Download and install OpenJDK 1.8 (if not available) from [here](https://openjdk.java.net/install/)

## Building the Source Code
Each demo1,...demo5 folders are considered separate JEE projects for the IDE. 
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
From the menu click on `Window -> Show View -> Other`. From the window, search for 'Gradle Tasks' and click open.
Resulting Window can be dragged into any place wherever fits for you.

Then from the collapsible tree-structure; select correct project(eg. demo1), expand `build` item, 
- Click on `clean` to run cleaning task, 
- Click on `build` to run build task

![Gradle Task](https://github.com/rasika/jee-demo/raw/master/docs/images/gradle-task.png)

## Deploy and Run JEE Application in Glassfish Server
These steps assume that you have already configured server instance in Eclipse IDE as explained [here](https://github.com/rasika/jee-demo/blob/master/docs/SettingUpGlassFish.md).

Right Click on `Server` instance we created. Then select `Add and Remove...`. 

![Servers Tab](https://github.com/rasika/jee-demo/raw/master/docs/images/servers-tab.png)

From the window; for example if you want to add `demo1` into JEE server; select `demo1` first and click `Add` button this will results `demo1` appear in the list of right side.

![Add Artifacts](https://github.com/rasika/jee-demo/raw/master/docs/images/add-artifact.png)

Start the server by right click and selecting `Start`.

![Run Server](https://github.com/rasika/jee-demo/raw/master/docs/images/run-server.png)

Whenever doing changes, you can execute `clean build` gradle tasks(if required) then right click on the server and click `Publish` to publish the changes.