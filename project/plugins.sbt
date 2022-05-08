addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.15")
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.13.1")
addSbtPlugin("community.flock" % "sbt-bazel" % "0.1.1-SNAPSHOT")

externalResolvers := Seq("Flock" at "https://flock.jfrog.io/artifactory/flock-sbt")

