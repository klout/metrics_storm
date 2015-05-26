name := "metrics_storm"

// Remove -SNAPSHOT from the version before publishing a release. Don't forget to change the version toI
// $(NEXT_VERSION)-SNAPSHOT afterwards!
version := "0.0.9-klout"

scalaVersion := "2.10.4"

scalacOptions += "-Yresolve-term-conflict:package"

unmanagedSourceDirectories in Compile <++= Seq(baseDirectory(_ / "src" )).join

unmanagedSourceDirectories in Test <++= Seq(baseDirectory(_ / "test" )).join

libraryDependencies ++= Seq(
  // slf4j >= 1.6 is needed so jetty logging won't throw an exception
  "org.slf4j" % "slf4j-api" % "1.7.10",
  "org.slf4j" % "slf4j-log4j12" % "1.7.10",
  "com.yammer.metrics" % "metrics-core" % "2.2.0",
  "com.yammer.metrics" % "metrics-servlet" % "2.2.0",
  "javax.servlet" % "servlet-api" % "2.5"
)

// Testing deps
libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.2.4" % "test",
                            "org.mockito" % "mockito-all" % "1.9.5" % "test")

resolvers ++= Seq("clojars" at "http://clojars.org/repo/",
                  "clojure-releases" at "http://build.clojure.org/releases")

libraryDependencies += "org.apache.storm" % "storm-core" % "0.9.4"

// Testing deps
libraryDependencies ++= Seq()
