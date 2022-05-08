load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
http_archive(name = "bazel_skylib", sha256 = "1c531376ac7e5a180e0237938a2536de0c54d93f5c278634818e0efc952dd56c", type = "tar.gz", url = "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/1.0.3/bazel-skylib-1.0.3.tar.gz")
http_archive(name = "io_bazel_rules_scala", url = "https://github.com/bazelbuild/rules_scala/archive/e7a948ad1948058a7a5ddfbd9d1629d6db839933.zip", sha256 = "76e1abb8a54f61ada974e6e9af689c59fd9f0518b49be6be7a631ce9fa45f236", strip_prefix = "rules_scala-e7a948ad1948058a7a5ddfbd9d1629d6db839933", type = "zip")
http_archive(name = "io_bazel_rules_docker", sha256 = "27d53c1d646fc9537a70427ad7b034734d08a9c38924cc6357cc973fed300820", strip_prefix = "rules_docker-0.24.0", url = "https://github.com/bazelbuild/rules_docker/releases/download/v0.24.0/rules_docker-v0.24.0.tar.gz")
http_archive(name = "rules_jvm_external", sha256 = "cd1a77b7b02e8e008439ca76fd34f5b07aecb8c752961f9640dea15e9e5ba1ca", strip_prefix = "rules_jvm_external-4.2", url = "https://github.com/bazelbuild/rules_jvm_external/archive/4.2.zip")
load("@io_bazel_rules_scala//:scala_config.bzl", "scala_config")
scala_config(scala_version = "2.13.8")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()
register_toolchains("//toolchains:scala_toolchain")
load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")
rules_jvm_external_deps()
load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")
rules_jvm_external_setup()
load("@rules_jvm_external//:defs.bzl", "maven_install")
maven_install(artifacts = ["com.typesafe.play:play-guice_2.13:2.8.15", "org.scalatestplus.play:scalatestplus-play_2.13:5.0.0", "org.scalatest:scalatest_2.13:3.0.8", "com.typesafe.play:play-akka-http-server_2.13:2.8.15", "com.typesafe.play:play-docs_2.13:2.8.15", "com.typesafe.play:play-server_2.13:2.8.15", "com.typesafe.play:twirl-api_2.13:1.5.1", "com.typesafe.play:play-test_2.13:2.8.15", "org.scala-lang:scala-library:2.13.8", "com.typesafe.play:play-logback_2.13:2.8.15", "com.typesafe.play:filters-helpers_2.13:2.8.15"], repositories = ["https://repo1.maven.org/maven2/"])
load("@io_bazel_rules_docker//toolchains/docker:toolchain.bzl", docker_toolchain_configure = "toolchain_configure")
load("@io_bazel_rules_docker//repositories:repositories.bzl", container_repositories = "repositories")
container_repositories()
load("@io_bazel_rules_docker//repositories:deps.bzl", container_deps = "deps")
container_deps()
load("@io_bazel_rules_docker//container:container.bzl", "container_pull")
container_pull(name = "java_base", registry = "gcr.io", repository = "distroless/java", digest = "sha256:deadbeef")
load("@io_bazel_rules_docker//scala:image.bzl", _scala_image_repos = "repositories")
_scala_image_repos()

load("@io_bazel_rules_scala//testing:scalatest.bzl", "scalatest_repositories", "scalatest_toolchain")
scalatest_repositories()
scalatest_toolchain()

# Twirl
rules_twirl_version = "9ac789845e3a481fe520af57bd47a4261edb684f"
http_archive(
  name = "io_bazel_rules_twirl",
  sha256 = "b1698a2a59b76dc9df233314c2a1ca8cee4a0477665cff5eafd36f92057b2044",
  strip_prefix = "rules_twirl-{}".format(rules_twirl_version),
  type = "zip",
  url = "https://github.com/lucidsoftware/rules_twirl/archive/{}.zip".format(rules_twirl_version),
)

RULES_JVM_EXTERNAL_TAG = "3.3"
http_archive(
    name = "rules_jvm_external",
    sha256 = "d85951a92c0908c80bd8551002d66cb23c3434409c814179c0ff026b53544dab",
    strip_prefix = "rules_jvm_external-{}".format(RULES_JVM_EXTERNAL_TAG),
    type = "zip",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/{}.zip".format(RULES_JVM_EXTERNAL_TAG),
)

load("@io_bazel_rules_twirl//:workspace.bzl", "twirl_repositories")
twirl_repositories()
load("@twirl//:defs.bzl", twirl_pinned_maven_install = "pinned_maven_install")
twirl_pinned_maven_install()

# Routes
rules_play_routes_version = "bfaca5f186f2c3b989c80fd00f37a53b84406b3d"
http_archive(
  name = "io_bazel_rules_play_routes",
  sha256 = "b0ae17af402e88da31fa41b16a6cf1d8eea53d693dd6b4c0c219d421078a2af5",
  strip_prefix = "rules_play_routes-{}".format(rules_play_routes_version),
  type = "zip",
  url = "https://github.com/lucidsoftware/rules_play_routes/archive/{}.zip".format(rules_play_routes_version),
)

RULES_JVM_EXTERNAL_TAG = "2.9"
http_archive(
    name = "rules_jvm_external",
    sha256 = "e5b97a31a3e8feed91636f42e19b11c49487b85e5de2f387c999ea14d77c7f45",
    strip_prefix = "rules_jvm_external-{}".format(RULES_JVM_EXTERNAL_TAG),
    type = "zip",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/{}.zip".format(RULES_JVM_EXTERNAL_TAG),
)

load("@io_bazel_rules_play_routes//:workspace.bzl", "play_routes_repositories")
play_routes_repositories("2.7")
load("@play_routes//:defs.bzl", play_routes_pinned_maven_install = "pinned_maven_install")
play_routes_pinned_maven_install()

bind(
  name = "default-play-routes-compiler-cli",
  actual = "@io_bazel_rules_play_routes//default-compiler-clis:scala_2_12_play_2_7"
)
