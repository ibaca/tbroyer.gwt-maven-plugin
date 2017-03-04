gwt-maven-plugin
================

[![Build Status](https://travis-ci.org/tbroyer/gwt-maven-plugin.png?branch=master)](https://travis-ci.org/tbroyer/gwt-maven-plugin)

This plugin aims at making it easier to build GWT projects with Maven, by providing two specific packagings: `gwt-lib` and `gwt-app`.

Basic usage
-----------

1. Add the plugin to your POM and enable extensions:

    ```xml
    <plugin>
      <groupId>net.ltgt.gwt.maven</groupId>
      <artifactId>gwt-maven-plugin</artifactId>
      <version>…</version>
      <extensions>true</extensions>
    </plugin>
    ```

2. configure your module name in the plugin:

    ```xml
    <configuration>
      <moduleName>com.example.app.App</moduleName>
    </configuration>
    ```

3. set your `<packaging>` to either `gwt-lib` or `gwt-app`

4. Manage your module in a `src/main/module.gwt.xml` file.

Features
--------

* **Adds all source roots as resources** so they're packaged within the generated JAR.

* **Uses `src/main/super` for super-sources** and possibly relocate them within your module's package
  with `<relocateSuperSource>true</relocateSuperSource>`.

* **Generates `<inherits>` from Maven dependencies:** the `gwt:generate-module` searches for
  `META-INF/gwt/mainModule` files in the projects direct dependencies and merges them with an
  (optional) `src/main/module.gwt.xml` file.

  The `META-INF/gwt/mainModule` files are generated by the `gwt:generate-module-metadata` goal.

* **Packaging `gwt-app` generates a WAR** that can be directly used as overlays in a downstream
  module with a `war` packaging.

Documentation
-------------

The plugin documentation is published at https://tbroyer.github.io/gwt-maven-plugin/

You can also look at the [integration tests](https://github.com/tbroyer/gwt-maven-plugin/tree/master/src/it),
particularly `gwt-lib`, `gwt-app`, `import-sources` and `e2e`.
