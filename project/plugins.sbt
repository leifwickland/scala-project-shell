addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.0.1")

resolvers ++= Seq(
  "Scala Tools" at "https://oss.sonatype.org/content/groups/scala-tools",
  Resolver.url("sbt-plugin-releases",
    url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)
)
