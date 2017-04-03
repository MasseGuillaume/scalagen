organization := "com.mysema.scalagen"

version := "0.3.2"

name := "scalagen-root"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.github.javaparser" % "javaparser-core" % "2.5.1",
  "net.sourceforge.collections" % "collections-generic" % "4.01",
  "org.apache.commons" % "commons-lang3" % "3.0.1",
  "org.apache.commons" % "commons-io" % "1.3.2",
  "com.geirsson" %% "scalafmt-core" % "0.6.6",
  
  "org.scala-lang" % "scala-library" % scalaVersion.value % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.scala-lang" % "scala-compiler" % scalaVersion.value % "test",
  "junit" % "junit" % "4.8.1" % "test" exclude("javax.servlet", "servlet-api"),
  "com.mysema.querydsl" % "querydsl-core" % "2.3.0" % "test",
  "com.mysema.commons" % "mysema-commons-lang" % "0.2.4" % "test",
  "com.google.code.findbugs" % "jsr305" % "3.0.1" % "test",
  "com.mysema.codegen" % "codegen" % "0.6.8" % "test",
  "javax.inject" % "javax.inject" % "1" % "test",
  "com.jsuereth" %% "scala-arm" % "1.4" % "test"
)

//fork in test := true
//baseDirectory in test := baseDirectory(_ / "scalagen").value