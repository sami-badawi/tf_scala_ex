# tf_scala_ex Starter Project For tensorflow_scala

[tensorflow_scala](https://github.com/eaplatanios/tensorflow_scala) is a Scala binding for 
[TensorFlow](https://github.com/tensorflow/tensorflow).

It is actively maintained and it up to date with TensorFlow. 

Getting SBT set up to work with native bindings to TensorFlow library is a little tricky. 
This project is a starter project showing how this is done.

## Code Examples

This has 2 examples taken from tensorflow_scala project.

* Linear Regression
* MNIS

## Getting Started

``` bash
git clone https://github.com/sami-badawi/tf_scala_ex.git
cd tf_scala_ex
sbt run
```

## Dependencies with platform

``` scala
    libraryDependencies ++= Seq(
      "org.platanios" %% "tensorflow-api" % "0.5.10",
      "org.platanios" %% "tensorflow-data" % "0.5.10",
      "org.platanios" %% "tensorflow-examples" % "0.5.10",
      "org.platanios" %% "tensorflow-jni" % "0.5.10",
      "org.platanios" %% "tensorflow" % "0.5.10",
      "org.platanios" %% "tensorflow" % "0.5.10" classifier "linux"
    )
```

### Supported Platforms

* darwin
* linux
* windows

Not sure if there is a more general way to specify platform in SBT file than the code above.
