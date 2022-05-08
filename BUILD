twirl_templates(
  name = "twirl-templates",
  source_directory = "app",
  srcs = glob(["app/views/**/*.scala.html"]),
  include_play_imports = True,
)

play_routes(
  name = "play-routes",
  srcs = ["conf/routes"] + glob(["conf/*.routes"]),
  include_play_imports = True,
  generate_reverse_router = True,
)

scala_library(
    name = "play-scala-seed",
    plugins = [],
    srcs = glob(include = ["app/**/*.scala"]) + [":twirl-templates", ":play-routes"],
    deps = ["@maven//:org_scala_lang_scala_library", "@maven//:com_typesafe_play_twirl_api_2_13", "@maven//:com_typesafe_play_play_server_2_13", "@maven//:com_typesafe_play_play_docs_2_13", "@maven//:com_typesafe_play_play_logback_2_13", "@maven//:com_typesafe_play_play_akka_http_server_2_13", "@maven//:com_typesafe_play_filters_helpers_2_13", "@maven//:com_typesafe_play_play_guice_2_13"],
    resources = glob(include = ["src/main/resources/**/*.*"]),
    visibility = ["//visibility:public"]
)
scala_test(
    name = "play-scala-seed_test",
    plugins = [],
    srcs = glob(include = ["test/**/*.scala"]),
    deps = ["@maven//:com_typesafe_play_play_test_2_13", "@maven//:org_scalatestplus_play_scalatestplus_play_2_13", "play-scala-seed"],
    resources = glob(include = ["test/resources/**/*.*"]),
    visibility = ["//visibility:public"]
)