/*
 * Main plugins
 */

resolvers += Resolver.jcenterRepo

// Build, package and load native libraries
addSbtPlugin("ch.jodersky" % "sbt-jni" % "1.2.1")

/*
 * Utility plugins, can be disabled during plain build
 */
// Generate documentation for all sources
addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.3.3")

// Generate website content
addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.0.0")

// Publish to sonatype and sync with maven central
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "1.1")

// Automate release process
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.0")

// Usually a global plugin, made explicit to work with release automation
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
