load("@io_bazel_rules_scala//scala:scala_toolchain.bzl", "scala_toolchain")
load("@io_bazel_rules_scala//scala:providers.bzl", "declare_deps_provider")
scala_toolchain(name = "scala", unused_dependency_checker_mode = "off", dependency_mode = "transitive", strict_deps_mode = "off", dependency_tracking_method = "ast", scalacopts = [], visibility = ["//visibility:public"])
toolchain(name = "scala_toolchain", toolchain_type = "@io_bazel_rules_scala//scala:toolchain_type", toolchain = "scala", visibility = ["//visibility:public"])